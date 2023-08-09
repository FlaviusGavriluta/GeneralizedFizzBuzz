package com.codecool.generalizedfizzbuzz.ui;

import com.codecool.generalizedfizzbuzz.model.GameSpecification;
import com.codecool.generalizedfizzbuzz.service.game.GameService;


public class FizzBuzzGameUi {
    private final GameService gameService;

    public FizzBuzzGameUi(GameService gameService) {
        this.gameService = gameService;
    }

    public void run() {
        int number = getNumber();
        GameSpecification spec = createGameSpecification();

        String result = gameService.play(number, spec);
        System.out.println(result);
    }

    private GameSpecification createGameSpecification() {
        return null;
    }

    private int getNumber() {
        return 0;
    }
}
