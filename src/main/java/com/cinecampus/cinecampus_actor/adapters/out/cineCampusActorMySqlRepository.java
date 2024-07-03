package com.cineCampus.cinecampus_actor.adapters.out;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cineCampusActorMySqlRepository implements cineCampusActorRepository {
    private final String url;
    private final String user;
    private final String password;

    public cineCampusActorMySQLRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(cineCampusActor cineCampusActor) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO actor (nombre_actor, id_nacionalida, id_plane, id_airport, id_nacionalida_status) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, cineCampusActor.getConnectionNumber());
                statement.setInt(2, cineCampusActor.getIdTrip());
                statement.setInt(3, cineCampusActor.getIdPlane());
                statement.setString(4, cineCampusActor.getIdAirport());
                statement.setInt(5, cineCampusActor.getIdTripStatus());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(cineCampusActor cineCampusActor) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE actor SET nombre_actor = ?, id_nacionalida = ?, id_plane = ?, id_airport = ?, id_nacionalida_status = ? WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, cineCampusActor.getConnectionNumber());
                statement.setInt(2, cineCampusActor.getIdTrip());
                statement.setInt(3, cineCampusActor.getIdPlane());
                statement.setString(4, cineCampusActor.getIdAirport());
                statement.setInt(5, cineCampusActor.getIdTripStatus());
                statement.setInt(6, cineCampusActor.getId());
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
                            resultSet.getInt("id_nacionalida"),
                            resultSet.getInt("id_plane"),
                            resultSet.getString("id_airport"),
                            resultSet.getInt("id_nacionalida_status")
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
                        resultSet.getInt("id_nacionalida"),
                        resultSet.getInt("id_plane"),
                        resultSet.getString("id_airport"),
                        resultSet.getInt("id_nacionalida_status")
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
