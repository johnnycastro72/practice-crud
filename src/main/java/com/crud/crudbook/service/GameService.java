package com.crud.crudbook.service;

import com.crud.crudbook.entity.Game;
import com.crud.crudbook.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService implements GameServiceInterface {

    @Autowired
    private GameRepository gameRepository;


    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public Game updateGame(Game game) {
        Optional<Game> gameToUpdate = gameRepository.findById(game.getId());
        if (!gameToUpdate.isPresent()) {
            return null;
        }
        return gameRepository.save(game);
    }

    @Override
    public void deleteGame(Long id) {
        Optional<Game> gameToDelete = gameRepository.findById(id);
        if (!gameToDelete.isPresent()) {
            return;
        }
        gameRepository.deleteById(id);
    }
}
