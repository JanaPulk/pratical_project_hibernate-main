package menu;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import model.Customer;
import persistence.RepositoryCustomer;

public class MenuCustomer {
    RepositoryCustomer repositoryCustomer = new RepositoryCustomer();


    private int menuOptions(Scanner input) {
        System.out.println("\n/***************************************************/");
        System.out.println("Select the submenu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: List all customers");
        System.out.println("2: Save a new Customer");
        System.out.println("3: Update a Customer");
        System.out.println("4: Find Customer by Id");
        System.out.println("5: Update customers phone number by customer id");
        System.out.println("100 - Return to Main Menu");
        System.out.println("\n/***************************************************/");
        return input.nextInt();
    }

    protected void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    menuListAllCustomers(input);
                    break;
                case 2:
                    menuInsertCustomer(input);
                    break;
                case 3:
                    menuUpdateCustomer(input);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 100:
                    MainMenu.getMainMenu();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
    }


    private void menuUpdateCustomer(Scanner input) {
    }

    private void menuListAllCustomers(Scanner input) {
        List<Customer> listCustomer = repositoryCustomer.listAllCustomers();

        if (listCustomer.size() > 0) {
            System.out.println("\nList of Customers:");
            for (Customer customer : listCustomer) {
                System.out.println(customer.toString());
            }
        } else {
            System.out.println("\nNo customers registered\n");
            menuOptions(input);
        }
    }

    private void menuInsertCustomer(Scanner input) {
        System.out.println("Update customers ID");
        int id = input.nextInt();
        System.out.println("Type customer first name");
        String firstName = input.next();
        System.out.println("Type customer last name");
        String lastName = input.next();
        System.out.println("Type the email");
        String email = input.next();
        System.out.println("Type customer phone number");
        String phoneNumber = input.next();
        System.out.println("Type customer payment status");
        String paymentStatus = input.next();
        System.out.println("Insert customer registration date");
        String dateOfRegister = input.next();
        LocalDate date = LocalDate.now();

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customer.setPaymentStatus(paymentStatus);
        repositoryCustomer.saveCustomer(customer);


        // if(firstName.length(^[a-zA-Z3-20]+$)
        // validate first name

    }

    private void menuUpdateCustomer(Scanner input, Customer customer) {
        repositoryCustomer.updateCustomer(customer);


    }


    public void menuFindCustomerId(Scanner input, RepositoryCustomer repositoryCustomer) {
        System.out.println("Type the customer id");
        int customerId = input.nextInt();

    }

    public void checkEmail(Scanner input){
      //  System.out.println("Type the email");
      //  String email = input.next();
      //  while (!validateEmail(email)){
         //   System.out.println("Type the email");
     //}
    }


    public boolean validateEmail(String email, RepositoryCustomer repositoryCustomer) {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher(email);
        return m.find();

    }

    public boolean validateFirstName(String firstName, RepositoryCustomer repositoryCustomer) {
        Pattern p = Pattern.compile("/[A-Z][a-z]* [A-Z][a-z]*/");
        Matcher m = p.matcher(firstName);
        return m.find();
    }

    public boolean validateLastName(String lastName, RepositoryCustomer repositoryCustomer) {
        Pattern p = Pattern.compile("/[A-Z][a-z]* [A-Z][a-z]*/");
        Matcher m = p.matcher(lastName);
        return m.find();

    }

    public boolean validatePaymentDate(String paymentDate) {
        Pattern p = Pattern.compile("^[0-3]?[0-9].[0-3]?[0-9].(?:[0-9]{2})?[0-9]{2}$");
        Matcher m = p.matcher(paymentDate);
        return m.find();
    }
    //this is my regex for only letters and length 3 - 20
         //   "[a-zA-Z]{3,20}$+



}










