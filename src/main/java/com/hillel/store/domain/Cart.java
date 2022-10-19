package com.hillel.store.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "carts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "cart_id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "cart_id")
    private Order order;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn (name = "cart_id")
    private List<Product> product;
}
