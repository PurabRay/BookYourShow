package com.lost.bookyourshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Costumer {
    @Id
    private Long id;
    private String name;
    private String email;


}
