package net.felipebueno.flappybird.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tube {

	private static final int FLUCTUATION = 130;
	private static final int TUBE_GAP = 100;
	private static final int LOWEST_OPENING = 120;
	public static final int TUBE_WIDTH = 52; // Texture width
	public static final int TUBES_COUNT = 4;
	public static final int TUBE_SPACING = 125;

	private final Texture topTube;
	private final Texture bottomTube;
	private final Random rand;
	private final Vector2 posTopTube;
	private final Vector2 posBotTube;

	public Tube(float x) {
		topTube = new Texture("toptube.png");
		bottomTube = new Texture("bottomtube.png");

		rand = new Random();

		posTopTube = new Vector2(x, rand.nextInt(FLUCTUATION) + TUBE_GAP + LOWEST_OPENING);
		posBotTube = new Vector2(x, posTopTube.y - TUBE_GAP - bottomTube.getHeight());


	}

	public Texture getTopTube() {
		return topTube;
	}

	public Texture getBottomTube() {
		return bottomTube;
	}

	public Vector2 getPosTopTube() {
		return posTopTube;
	}

	public Vector2 getPosBotTube() {
		return posBotTube;
	}


	public void reposition(float x) {
		posTopTube.set(x, rand.nextInt(FLUCTUATION) + TUBE_GAP + LOWEST_OPENING);
		posBotTube.set(x, posTopTube.y - TUBE_GAP - bottomTube.getHeight());
	}

}
