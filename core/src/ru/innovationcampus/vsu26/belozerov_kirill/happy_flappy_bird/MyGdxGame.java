package ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird.Screens.ScreenGame;
import ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird.Screens.ScreenRestart;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	public OrthographicCamera camera;

	public static final int SCR_WIDTH = 1280, SCR_HEIGHT = 720;

	public ScreenGame screenGame;
	public ScreenRestart screenRestart;

	@Override
	public void create() {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);

		screenGame = new ScreenGame(this);
		screenRestart = new ScreenRestart(this);
		setScreen(screenGame);
	}


	@Override
	public void dispose() {
		batch.dispose();
	}
}