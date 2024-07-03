package com.cinecampus.cinecampus_actor.adapters.out;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cinecampus.cinecampus_actor.domain.models.cineCampusActor;
import com.cinecampus.cinecampus_actor.infrasctructure.cinecampusActorRepository;

public class cinecampusActorMySqlRepository implements cinecampusActorRepository {
    private String url;
    private String user;
    private String password;

    public void cineCampusActorMySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(cineCampusActor cineCampusActor) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO actor (id_actor,nombre_actor, id_nacionalidad, edad, id_genero) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cineCampusActor.getId());
                statement.setString(2, cineCampusActor.getActorName());
                statement.setInt(3, cineCampusActor.getActorAge());
                statement.setString(4, cineCampusActor.getActorNation());
                statement.setInt(5, cineCampusActor.getGenreId());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(cineCampusActor cineCampusActor) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE actor SET id_actor = ?, nombre_actor = ?, id_nacionalidad = ?, edad = ?, id_genero = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, cineCampusActor.getId());
                statement.setString(2, cineCampusActor.getActorName());
                statement.setInt(3, cineCampusActor.getActorAge());
                statement.setString(4, cineCampusActor.getActorNation());
                statement.setInt(5, cineCampusActor.getGenreId());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<cineCampusActor> findById(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM actor WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        cineCampusActor cineCampusActor = new cineCampusActor(
                            resultSet.getInt("id"),
                            resultSet.getString("nombre_actor"),
                            resultSet.getInt("id_nacionalidad"),
                            resultSet.getString("id_genero"),
                            resultSet.getInt("edad_actor")
                        );
                        return Optional.of(cineCampusActor);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void delete(int id) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM actor WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<cineCampusActor> findAll() {
        List<cineCampusActor> cineCampusActors = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM actor";
            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    cineCampusActor cineCampusActor = new cineCampusActor(
                        resultSet.getInt("id"),
                        resultSet.getString("nombre_actor"),
                        resultSet.getInt("id_nacionalidad"),
                        resultSet.getString("id_genero"),
                        resultSet.getInt("edad_actor")
                    );
                    cineCampusActors.add(cineCampusActor);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cineCampusActors;
    }
}
