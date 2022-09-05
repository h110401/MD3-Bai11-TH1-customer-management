package rikkei.academy.service;

import rikkei.academy.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceIMPL implements ICustomerService {

    private static final Map<Integer, Customer> customers;
    private static int lastId = 1;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@rikkei.academy", "Hanoi"));
        lastId++;
        customers.put(2, new Customer(2, "Bill", "bill@rikkei.academy", "Danang"));
        lastId++;
        customers.put(3, new Customer(3, "Alex", "alex@rikkei.academy", "Saigon"));
        lastId++;
        customers.put(4, new Customer(4, "Adam", "adam@rikkei.academy", "Beijin"));
        lastId++;
        customers.put(5, new Customer(5, "Sophia", "sophia@rikkei.academy", "Miami"));
        lastId++;
        customers.put(6, new Customer(6, "Rose", "rose@rikkei.academy", "Newyork"));
        lastId++;
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
        lastId++;
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

    @Override
    public int getLastId() {
        return lastId;
    }
}
