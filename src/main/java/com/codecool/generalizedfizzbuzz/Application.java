package com.codecool.generalizedfizzbuzz;

import com.codecool.generalizedfizzbuzz.service.division.DivisionService;
import com.codecool.generalizedfizzbuzz.service.game.GameService;
import com.codecool.generalizedfizzbuzz.ui.FizzBuzzGameUi;

public class Application {

    public static void main(String[] args){
        DivisionService divisionService = null;
        GameService gameService = null;

        var ui = new FizzBuzzGameUi(gameService);

        ui.run();
    }
}
