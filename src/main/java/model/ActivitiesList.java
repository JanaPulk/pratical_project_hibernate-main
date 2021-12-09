package model;

import javax.persistence.*;

@Entity
public class ActivitiesList {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ActivitiesList")
        private String hike;
        private String dine;
        private String fitness;
        private String vineClass;
        private String painting;
}
