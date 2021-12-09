package model;

import javax.persistence.*;

@Entity
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transport")
    private int customerId;



}
