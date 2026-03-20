package ru.innovationcampus.vsu26.belozerov_kirill.happy_flappy_bird;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends Game {

	public SpriteBatch batch;
	public OrthographicCamera camera;

	public static final int SCR_WIDTH = 1280;
	public static final int SCR_HEIGHT = 720;

	ScreenGame screenGame;

	@Override
	public void create() {
		if (Gdx.input.justTouched()) {
			System.out.println("Just touched");
		}
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, SCR_WIDTH, SCR_HEIGHT);

		screenGame = new ScreenGame(this);
		setScreen(screenGame);
	}


	@Override
	public void dispose() {
		batch.dispose();
	}
}