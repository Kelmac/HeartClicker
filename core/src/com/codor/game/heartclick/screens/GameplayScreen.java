package com.codor.game.heartclick.screens;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.codor.game.heartclick.HeartClickerGame;
import com.codor.game.heartclick.entities.Player;
import com.sun.javafx.scene.control.skin.LabelSkin;

public class GameplayScreen extends AbstractScreen {

	private Player player;
	private Button playerButton;
	private Label score;

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
				player.reactOnClick();
				game.addScore();
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
		player.updatePlayerButton();
		score.setText("Score:   "+game.getScore().toString());
	}

	@Override
	protected void init() {
		initPlayer();
		initScore();
	}

	private void initScore() {
		LabelStyle style = new LabelStyle();
		style.font = new BitmapFont();
		this.score = new Label("Sample", style);
		score.setX(20);
		score.setY(HeartClickerGame.HEIGHT - 50);
		stage.addActor(score);

	}

}
