package com.example.optimalschedule.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "group_frequent")
public class GroupFrequent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // Id of driver
    private int driverId;
    // Id main route
    // if value = 0 => taxi only serving online booking
    private int mainRouteId;

    public GroupFrequent(int driverId, int mainRouteId) {
        this.driverId = driverId;
        this.mainRouteId = mainRouteId;
    }

    public GroupFrequent(int id, int driverId, int mainRouteId) {
        this.id = id;
        this.driverId = driverId;
        this.mainRouteId = mainRouteId;
    }
}
