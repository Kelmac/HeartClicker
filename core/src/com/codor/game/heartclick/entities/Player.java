package com.codor.game.heartclick.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.codor.game.heartclick.HeartClickerGame;

public class Player extends Image {

	private final static Integer WIDTH = 64;
	private final static Integer HEIGH = 64;

	private final static Integer STARTING_X = HeartClickerGame.WIDTH / 2;
	private final static Integer STARTING_Y = HeartClickerGame.HEIGHT / 2;

	private Button playerButton;

	public Player() {
		super(new Texture("fullheart.png"));

		this.setOrigin(WIDTH / 2, HEIGH / 2);
		this.setSize(WIDTH, HEIGH);

		// Starting position
		this.setPosition(STARTING_X, STARTING_Y);
		initPlayerButton();
	}

	public Button getPlayerButton() {
		return playerButton;
	}

	private void initPlayerButton() {
		this.playerButton = new Button(new Button.ButtonStyle());
		playerButton.setWidth(WIDTH);
		playerButton.setHeight(HEIGH);
		playerButton.setX(STARTING_X);
		playerButton.setY(STARTING_Y);
		playerButton.setDebug(false);

	}

	public void reactOnClick() {
		float timeAnimation = 1.5f;
		int moveAmountX = MathUtils.random(-200, 200);
		int moveAmountY = MathUtils.random(-300, 300);
		int growAmount = MathUtils.random(-32, 64);
		Action moveActiopn = Actions.sequence(
				Actions.moveBy(moveAmountX, moveAmountY, timeAnimation, Interpolation.swingIn),
				Actions.moveBy(-moveAmountX, -moveAmountY, timeAnimation, Interpolation.swingOut));
		Action growAction = Actions.sequence(
				Actions.sizeBy(growAmount, growAmount, timeAnimation, Interpolation.bounceIn),
				Actions.sizeBy(-growAmount, -growAmount, timeAnimation, Interpolation.bounceOut));

		this.addAction(growAction);
		this.addAction(moveActiopn);
	}

	public void updatePlayerButton() {
		playerButton.setWidth(this.getWidth());
		playerButton.setHeight(this.getHeight());
		playerButton.setX(this.getX());
		playerButton.setY(this.getY());
	}
}
