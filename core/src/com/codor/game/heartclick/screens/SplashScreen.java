package com.codor.game.heartclick.screens;

import com.badlogic.gdx.graphics.Texture;
import com.codor.game.heartclick.HeartClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;

	public SplashScreen(HeartClickerGame game) {
		super(game);
		init();
	}

	private void init() {
		// TODO Menager Asset
		splashImg = new Texture("badlogic.jpg");

	}

	@Override
	public void render(float delta) {
		super.render(delta);
		spriteBatch.begin();
		spriteBatch.draw(splashImg, HeartClickerGame.WIDTH/2, HeartClickerGame.HEIGHT/2);
		spriteBatch.end();

	}

}
