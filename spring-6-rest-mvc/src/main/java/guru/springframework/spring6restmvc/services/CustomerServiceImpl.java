package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        Customer customer1 = Customer.builder()
                .name("Customer 1")
                .version(1)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();
        Customer customer2 = Customer.builder()
                .name("Customer 2")
                .version(1)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();
        Customer customer3 = Customer.builder()
                .name("Customer 3")
                .version(1)
                .updateDate(LocalDateTime.now())
                .createdDate(LocalDateTime.now())
                .build();

        customerMap = new HashMap<>();
        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);

    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerMap.get(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }
}
