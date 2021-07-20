package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    public List<Customer> findAll() throws SQLException;
    public Customer findById(int id);
    public void add(Customer customer);
    public boolean edit(Customer customer);
    public boolean delete(int id);
    public List<Customer> searchByName(String name);
}
