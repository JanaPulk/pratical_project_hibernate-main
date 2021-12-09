package persistence;

import java.util.List;
import javax.persistence.EntityManager;

import model.Customer;
import util.DBUtil;

public class RepositoryCustomer {
    private EntityManager entityManager;

    public RepositoryCustomer() {
        entityManager = DBUtil.getEntityManager();
    }


    public void saveCustomer(Customer customer) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
            System.out.println("New customer saved");
        } catch (Exception exception) {
            entityManager.getTransaction().rollback();

        }
    }

    public void updateCustomer(Customer customer) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(customer);
            entityManager.getTransaction().commit();
            System.out.println("Customer has been updated");
        } catch (Exception exception) {
            entityManager.getTransaction().rollback();
            exception.printStackTrace();
        }

    }

    public void deleteCustomer(Customer customer) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(customer);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            exception.printStackTrace();
            entityManager.getTransaction().rollback();

        }
    }

    public List<Customer> listAllCustomers() {
        List<Customer> list = null;
        try {
            list = entityManager.createQuery("From Customer", Customer.class).getResultList();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return list;
    }

    public List<Customer> findCustomerById(int customerId) {
       return  entityManager.find(Customer.class, customerId);
    }

    public void updateCustomerEmail(String email) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(email);
            entityManager.getTransaction().commit();
        } catch (Exception exception) {
            entityManager.getTransaction().rollback();
        }
    }



        // public List<Customer> findCustomerByPaymentStatus(String paymentStatus) {
        //return null;
    }






