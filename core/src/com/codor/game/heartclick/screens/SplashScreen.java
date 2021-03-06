package com.codor.game.heartclick.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.codor.game.heartclick.HeartClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;

	public SplashScreen(final HeartClickerGame game) {
		super(game);


		Timer.schedule(new Task() {

			@Override
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 2.0f);
	}



	@Override
	public void render(float delta) {
		super.render(delta);
		spriteBatch.begin();
		spriteBatch.draw(splashImg, HeartClickerGame.WIDTH / 2, HeartClickerGame.HEIGHT / 2);
		spriteBatch.end();

	}



	@Override
	protected void init() {
		// TODO Auto-generated method stub
		splashImg = new Texture("badlogic.jpg");
	}

}
