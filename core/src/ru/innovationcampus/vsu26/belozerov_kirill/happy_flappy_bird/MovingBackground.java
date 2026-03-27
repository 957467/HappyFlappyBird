package ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class MovingBackground {
    int texture1X;
    int speed = 2;

    static Texture texture;

    MovingBackground() {
        texture1X = 0;
        texture = new Texture("game_bg.png");
    }
    static void draw(Batch batch) {
        batch.draw(texture, 0, 0, MyGdxGame.SCR_WIDTH, MyGdxGame.SCR_HEIGHT);
    }

}
