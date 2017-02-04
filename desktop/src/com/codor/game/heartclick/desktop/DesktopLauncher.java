package com.codor.game.heartclick.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.codor.game.heartclick.HeartClickerGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = HeartClickerGame.TITLE;
		config.width = HeartClickerGame.WIDTH;
		config.height = HeartClickerGame.HEIGHT;
		config.resizable = false;
		new LwjglApplication(new HeartClickerGame(), config);
	}
}
