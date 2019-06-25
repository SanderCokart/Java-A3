package final1;

import final1.controller.GameController;
import final1.model.GameField;
import final1.view.GameView;
import final1.view.WinView;

public class Runner {
    public static void main(String[] args) {//MAIN;
        run();//runs method run;
    }

    public static void run() {//method to run the game
        GameField game_field_object = new GameField();//creates a new game field;
        GameView game_view_object = new GameView();//creates a user interface;
        WinView win_view = new WinView();//creates a new winner interface;
        GameController game_controller_object = new GameController(game_view_object, game_field_object, win_view);//creates the controller to interact with the different objects as parameters
    }
}
