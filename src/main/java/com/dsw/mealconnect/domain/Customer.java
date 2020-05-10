package com.dsw.mealconnect.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Builder.Default
    @OneToMany(orphanRemoval = true, cascade = CascadeType.REMOVE)
    private Set<Order> orders = new HashSet<>();

}
