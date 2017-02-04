package com.codor.game.heartclick.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.codor.game.heartclick.HeartClickerGame;

public abstract class AbstractScreen implements Screen {
	protected HeartClickerGame game;
	protected Stage stage;
	private OrthographicCamera camera;
	protected SpriteBatch spriteBatch;

	public AbstractScreen(HeartClickerGame game) {
		this.game = game;
		this.spriteBatch = new SpriteBatch();
		stage = new Stage(new StretchViewport(HeartClickerGame.WIDTH, HeartClickerGame.HEIGHT));
		Gdx.input.setInputProcessor(stage);

		createCamera();
		init();
	}

protected abstract void init();

	private void createCamera() {
		this.camera = new OrthographicCamera();
		camera.setToOrtho(false, HeartClickerGame.WIDTH, HeartClickerGame.HEIGHT);
		camera.update();
	}

	@Override
	public void show() {
		// wchodziz apierwszym razem
	}

	@Override
	public void render(float delta) {
		clearScreen();
		camera.update();
		spriteBatch.setProjectionMatrix(camera.combined);

	}

	private void clearScreen() {
		Gdx.gl.glClearColor(0, 0, 0, 0.5f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void pause() {
		game.setPaused(true);
	}

	@Override
	public void resume() {
		game.setPaused(false);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		game.dispose();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

}
