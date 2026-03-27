package ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird;
import static ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird.MyGdxGame.SCR_HEIGHT;
import static ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird.MyGdxGame.SCR_WIDTH;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Tube {
    final int pointCounterMarginTop = 400;
    final int pointCounterMarginRight = 60;

    MyGdxGame myGdxGame;

    Bird bird;
    PointCounter pointCounter;

    int tubeCount = 3;
    Tube[] tubes;

    int gamePoints;
    boolean isGameOver;
    private Tube textureUpperTube;
    private Tube textureDownTube;

    Tube(MyGdxGame myGdxGame) {
        this.myGdxGame = myGdxGame;

        initTubes();
        bird = new Bird(20, SCR_HEIGHT / 2, 10, 250, 200);
        pointCounter = new PointCounter(SCR_WIDTH - pointCounterMarginTop, SCR_HEIGHT - pointCounterMarginRight);
    }

    public Tube(int tubeCount, int i) {
    }

    private void initTubes() {
    }

    public void show() {
        gamePoints = 0;
        isGameOver = false;
    }

    public void render(float delta) {

        if (Gdx.input.justTouched()) {
            bird.onClick();
        }

        bird.fly();
        if (!bird.isInField()) {
            System.out.println("not in field");
            isGameOver = true;
        }
    }

    void draw(SpriteBatch batch) {

    }

    private void hide() {

    }

    void dispose() {
        textureDownTube.dispose();
        textureUpperTube.dispose();
    }

    public void move() {
    }

    public boolean isHit(Bird bird) {
        return false;
    }

    public boolean wait(Bird bird) {
        return false;
    }
}