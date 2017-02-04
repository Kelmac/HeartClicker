package com.codor.game.heartclick;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.codor.game.heartclick.screens.SplashScreen;

public class HeartClickerGame extends Game {
	public final static String TITLE = "Heart Clicker";
	public final static Integer WIDTH = 480;
	public final static Integer HEIGHT = 700;

	private Boolean paused;

	public Boolean isPaused() {
		return paused;
	}

	public void setPaused(Boolean paused) {
		this.paused = paused;
	}

	@Override
	public void create() {
		this.setScreen(new SplashScreen(this));
	}

}
