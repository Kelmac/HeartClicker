package com.codor.game.heartclick.screens;

import com.codor.game.heartclick.HeartClickerGame;
import com.codor.game.heartclick.entities.Player;

public class GameplayScreen extends AbstractScreen {

	private Player player;

	public GameplayScreen(HeartClickerGame game) {
		super(game);
		init();
	}

	private void init() {
		initPlayer();
	}

	private void initPlayer() {
		this.player = new Player();
		stage.addActor(this.player);
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update();

		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();

	}

	private void update() {
		stage.act();
	}

}
