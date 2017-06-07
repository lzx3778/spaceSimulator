package scenes.gameScene;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import scenes.gameScene.canvas.GameCanvas;

public class GameScene extends Scene {

    private boolean clicked;

    //constructor
    public GameScene(Group root, double width, double height) {

        //construct the game scene as a scene
        super(root, width, height);

        clicked = false;

        //initialize the canvas
        //size
        GameCanvas gameCanvas = new GameCanvas(1000, 560);
        //add game canvas
        root.getChildren().add(gameCanvas);

        //add a menu
        Button Menu01 = new Button("Button");
        Menu01.setMinWidth(200);
        Menu01.setTranslateX(-200);
        root.getChildren().add(Menu01);

        //add a menu button
        Button button = new Button("=");
        button.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(20), null)));
        button.setOnMouseEntered(me -> button.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, new CornerRadii(20), null))));
        button.setOnMouseExited(me -> button.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(20), null))));
        button.setOnMouseClicked(me -> {
            setClicked(!isClicked());
            if (isClicked()) {
                //pop out
                Menu01.setTranslateX(0);
            } else {
                //goes back
                Menu01.setTranslateX(-200);
            }
        });
        button.setTranslateX(10);
        button.setTranslateY(10);
        root.getChildren().add(button);
    }


    private boolean isClicked() {
        return clicked;
    }

    private void setClicked(boolean clicked) {
        this.clicked = clicked;
    }
}