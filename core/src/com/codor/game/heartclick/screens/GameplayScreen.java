package com.codor.game.heartclick.screens;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.codor.game.heartclick.HeartClickerGame;
import com.codor.game.heartclick.entities.Player;

public class GameplayScreen extends AbstractScreen {

	private Player player;
	private Button playerButton;

	public GameplayScreen(HeartClickerGame game) {
		super(game);

	}

	private void initPlayer() {
		this.player = new Player();
		this.playerButton = player.getPlayerButton();
		stage.addActor(this.player);
		stage.addActor(this.playerButton);
		playerButton.addListener(new ClickListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				System.out.println("Click");
				return super.touchDown(event, x, y, pointer, button);
			}

		});

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

	@Override
	protected void init() {
		initPlayer();

	}

}
