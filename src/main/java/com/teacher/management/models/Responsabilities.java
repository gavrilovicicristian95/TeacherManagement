package com.teacher.management.models;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "responsabilities")
@Data
public class Responsabilities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idResponsability;
    @Column(name = "idUser")
    private Integer idUser;
}
