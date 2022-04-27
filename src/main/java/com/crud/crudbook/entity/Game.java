package com.crud.crudbook.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Game")
@Table(name = "game")
@Data

public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String theme;

    private String playerMode;

    private String company;

    private String device;
}
