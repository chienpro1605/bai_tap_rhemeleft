package service;

import model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    SQLConnection sqlConnection = new SQLConnection();
    private final String DISPLAY_ALL = "seclect * from customer";

    @Override
    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        Connection connection = sqlConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            customers.add(new Customer(id, name, age));
        }
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void add(Customer customer) {

    }

    @Override
    public boolean edit(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Customer> searchByName(String name) {
        return null;
    }
}
