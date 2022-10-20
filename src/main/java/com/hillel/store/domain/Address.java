package com.hillel.store.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String test;
    private String country;
    private String city;
    private Integer zipCode;
    private String viktor;
}
