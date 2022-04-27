package com.crud.crudbook.controller;

import com.crud.crudbook.entity.Game;
import com.crud.crudbook.service.GameServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class GameController {

    @Autowired
    private GameServiceInterface service;

    @GetMapping("get/games")
    public List<Game> getAllGames() {
        return service.getAllGames();
    }

    @PostMapping("save/game")
    public Game saveGame(@RequestBody Game game) {
        return service.saveGame(game);
    }

    @PutMapping("update/game")
    public Game updateGame(@RequestBody Game game) {
        return service.updateGame(game);
    }

    @DeleteMapping("delete/game/{id}")
    public void deleteGame(@PathVariable Long id) {
        service.deleteGame(id);
    }
}
