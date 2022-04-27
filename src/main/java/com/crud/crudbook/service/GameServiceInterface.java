package com.crud.crudbook.service;

import com.crud.crudbook.entity.Game;

import java.util.List;

public interface GameServiceInterface {

    List<Game> getAllGames();

    Game saveGame(Game game);

    Game updateGame(Game game);

    void deleteGame(Long id);
}
