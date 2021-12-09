package model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Customer implements List<Customer> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String paymentStatus;
    private LocalDate dateOfRegister;

    @ManyToOne
    @JoinTable(name = "Activities")
    private Customer customer;

    @ManyToOne
    @JoinTable(name = "Transport")
    private Transport transport;



    public LocalDate getGetDateOfRegister() {
        return dateOfRegister;
    }

    public void setGetDateOfRegister(LocalDate getDateOfRegister) {
        this.dateOfRegister = getDateOfRegister;
    }


    public int getCustomerId(int i) {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountStatus=" + paymentStatus +
                '}';
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Customer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Customer customer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Customer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Customer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Customer get(int index) {
        return null;
    }

    @Override
    public Customer set(int index, Customer element) {
        return null;
    }

    @Override
    public void add(int index, Customer element) {

    }

    @Override
    public Customer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Customer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Customer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Customer> subList(int fromIndex, int toIndex) {
        return null;
    }
}

