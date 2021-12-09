package model;

import javax.persistence.*;

@Entity
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Activities" )
    private int activitiesId;

    @ManyToOne
    @JoinTable(name = "ActivitiesList")
    private Activities activities;








}
