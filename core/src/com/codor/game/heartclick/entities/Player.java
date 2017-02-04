package com.codor.game.heartclick.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.codor.game.heartclick.HeartClickerGame;

public class Player extends Image {

	private final static Integer WIDTH = 110;
	private final static Integer HEIGH = 90;

	private final static Integer STARTING_X = HeartClickerGame.WIDTH / 2;
	private final static Integer STARTING_Y = HeartClickerGame.HEIGHT / 2;

	public Player() {
		super(new Texture("fullheart.png"));

		this.setOrigin(WIDTH / 2, HEIGH / 2);
		this.setSize(WIDTH, HEIGH);

		// Starting position
		this.setPosition(STARTING_X, STARTING_Y);

	}

}
