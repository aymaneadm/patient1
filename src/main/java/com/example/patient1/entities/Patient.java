package com.example.patient1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity  // pour dire qu'il a une relation avec base de donne
public class Patient {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nom ;
    @Temporal(TemporalType.DATE)  // pour garder la date spous format date
    private Date dateNaissance;
    private boolean malade ;
    private int score;



}
