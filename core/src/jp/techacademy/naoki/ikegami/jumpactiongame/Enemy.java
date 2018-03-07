package jp.techacademy.naoki.ikegami.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

public class Enemy extends GameObject {

    // 横幅、高さ
    public static final float ENEMY_WIDTH = 1.0f;
    public static final float ENEMY_HEIGHT = 1.0f;


    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);
    }
}
