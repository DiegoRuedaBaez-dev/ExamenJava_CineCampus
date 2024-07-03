package com.cinecampus.cinecampus_format.adapters.out;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cinecampus.cinecampus_format.domain.models.cineCampusFormat;
import com.cinecampus.cinecampus_format.infrasctructure.cineCampusFormatRepository;

public class cineCampusFormatMySqlRepository implements cineCampusFormatRepository {
    private final String url;
    private final String user;
    private final String password;

    public cineCampusFormatMySqlRepository(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public void save(cineCampusFormat cinecampusformat) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "INSERT INTO format (descripcion) VALUES(?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, cinecampusformat.getDescripcion());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(cineCampusFormat cinecampusformat) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE format SET descripcion = ? WHERE id_formato = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, cinecampusformat.getDescripcion());
                statement.setInt(2, cinecampusformat.getId_formato());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<cineCampusFormat> findById(int id_formato) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT id_formato,descripcion FROM format WHERE id_formato = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id_formato);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        cineCampusFormat cinecampusformat = new cineCampusFormat(
                                resultSet.getInt("id_formato"),
                                resultSet.getString("descrpcion"));
                        return Optional.of(cinecampusformat);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void delete(int id_formato) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM formato WHERE id_formato = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id_formato);
                statement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<cineCampusFormat> findAll() {
        List<cineCampusFormat> cinecampusformats = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT id_formato,descripcion FROM formato";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    cineCampusFormat cinecampusformat = new cineCampusFormat(
                            resultSet.getInt("id_formato"),
                            resultSet.getString("descripcion"));
                    cinecampusformats.add(cinecampusformat);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cinecampusformats;
    }
}