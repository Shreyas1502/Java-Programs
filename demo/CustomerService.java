package StreamAPI.demo;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerService {
    Set<Customer> setOfCustomer;
    public void addCustomer(Set<Customer> setOfCustomer){
        this.setOfCustomer=setOfCustomer;
    }
    public List<Customer> getAllCustomer(){
        return setOfCustomer.stream().toList();
    }
    public List<Customer> getAllCustomersFromSameCity(String cityName){
        return setOfCustomer.stream().filter(cust->cust.getAddress().equals(cityName)).collect(Collectors.toList());
    }
    public int countMale(){
        return 0;
    }
    public Set<String> getAllCities(){
        return null;
    }
    public Stream<Customer> sortCustomerById(){
        return null;
    }
}
