package ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird;

import static com.badlogic.gdx.graphics.Color.WHITE;
import static com.badlogic.gdx.graphics.g3d.particles.ParticleChannels.Color;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class PointCounter {
    int x, y;
        BitmapFont font;

        PointCounter(int x, int y) {
            this.x = x;
            this.y = y;

            font = new BitmapFont();
            font.getData().setScale(5f);
            font.setColor(WHITE);
        }

        void draw(Batch batch, int countOfPoints) {
            font.draw(batch, "Count: " + countOfPoints, x, y);
        }

        void dispose() {
            font.dispose();
        }
}

