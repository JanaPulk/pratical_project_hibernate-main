package menu;

import model.Customer;
import persistence.RepositoryCustomer;

import java.util.List;
import java.util.Scanner;

public class MainMenu {
    private static SubMenuOptions subMenuOptions;
    private static Scanner input;

    public static void main(String[] args) {
     Customer customer = new Customer();
      customer.setFirstName("Vila");
        customer.setLastName("Toss");
        customer.setEmail("silver@gmail.com");
      customer.setPhoneNumber("3245-74638");
      //  customer.setPaymentStatus("payed");
      //  customer.setCustomerId(3);

        RepositoryCustomer repository = new RepositoryCustomer();

        List <Customer> list = repository.findCustomerById(2);
       for(Customer c: list){
            System.out.println(c.toString());
        }

      //  repository.saveCustomer(customer);
       // repository.updateCustomer(customer);

       // List<Customer> list = repository.listAllCustomers();
        //System.out.println(customer.toString());


    //   Customer customerResult = repository.findCustomerById(3);
         //   System.out.println(customerResult.toString());


        input = new Scanner(System.in);
        subMenuOptions = new SubMenuOptions();
        subMenuOptions.menuChoice(input);
    }

    public static void getMainMenu() {
        subMenuOptions.menuChoice(input);
    }
}
