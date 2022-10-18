package com.hillel.store.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    private Date dateOfOrder;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Address deliveryAddress;

    private Double deliveryPrice;
    private Double totalPrice;
}
