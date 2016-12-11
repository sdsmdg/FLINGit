package com.sdsmdg.flingit.constants;

/**
 * Created by rahul on 9/12/16.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.sdsmdg.flingit.FLINGitGame;

public class Assets {

    private BitmapFont bitmapSmallFont, bitmapMediumFont, bitmapLargeFont, bitmapTitleFont;
    private FLINGitGame game;
    private Texture groupLogoTexture, aboutUsTexture, leaderboardTexture, achievementTexture, soundOnTexture, soundOffTexture;
    private Sprite groupLogoSprite, aboutUsSprite, leaderboardSprite, achievementSprite, soundOnSprite, soundOffSprite;

    public Assets(FLINGitGame game) {
        this.game = game;
    }

    private BitmapFont loadFont(double ratio) {
        BitmapFont font;
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("colaborate-Thin-Regular.otf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = (int) (ratio * game.dimensions.getScreenWidth());
        font = generator.generateFont(parameter);
        font.setColor(Color.BLACK);
        generator.dispose();
        return font;
    }

    private BitmapFont loadTitleFont(double ratio) {
        BitmapFont font;
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("title-font.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = (int) (ratio * game.dimensions.getScreenWidth());
        font = generator.generateFont(parameter);
        font.setColor(Color.BLACK);
        generator.dispose();
        return font;
    }

    public void loadSplashScreenSprites(){
        groupLogoTexture = new Texture(Gdx.files.internal("mdg_logo.png"));
        //for minification and magnification
        groupLogoTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        groupLogoSprite = new Sprite(groupLogoTexture);
    }

    public void loadGameScreenSprites(){
        aboutUsTexture = new Texture(Gdx.files.internal("about.png"));
        aboutUsTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        aboutUsSprite = new Sprite(aboutUsTexture);

        leaderboardTexture = new Texture(Gdx.files.internal("leaderboard.png"));
        leaderboardTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        leaderboardSprite = new Sprite(leaderboardTexture);

        achievementTexture = new Texture(Gdx.files.internal("achievement.png"));
        achievementTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        achievementSprite = new Sprite(achievementTexture);

        soundOnTexture = new Texture(Gdx.files.internal("soundOn.png"));
        soundOnTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        soundOnSprite = new Sprite(soundOnTexture);

        soundOffTexture = new Texture(Gdx.files.internal("soundOff.png"));
        soundOffTexture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        soundOffSprite = new Sprite(soundOffTexture);
    }

    public void loadAllFonts() {
        setBitmapTitleFont();
        setBitmapSmallFont();
        setBitmapMediumFont();
        setBitmapLargeFont();
    }

    public BitmapFont getBitmapSmallFont() {
        return bitmapSmallFont;
    }

    private void setBitmapSmallFont() {
        bitmapSmallFont = loadFont(Constants.RATIO_SMALL);
    }

    public BitmapFont getBitmapMediumFont() {
        return bitmapMediumFont;
    }

    private void setBitmapMediumFont() {
        bitmapMediumFont = loadFont(Constants.RATIO_MEDIUM);
    }

    public BitmapFont getBitmapLargeFont() {
        return bitmapLargeFont;
    }

    private void setBitmapLargeFont() {
        bitmapLargeFont = loadFont(Constants.RATIO_LARGE);
    }

    public Sprite getGroupLogoSprite() {
        return groupLogoSprite;
    }

    public void dispose() {
        //disposing textures
        groupLogoTexture.dispose();

        //disposing fonts
        bitmapSmallFont.dispose();
        bitmapMediumFont.dispose();
        bitmapLargeFont.dispose();
    }

    public BitmapFont getBitmapTitleFont() {
        return bitmapTitleFont;
    }

    private void setBitmapTitleFont() {
        bitmapTitleFont = loadTitleFont(Constants.RATIO_LARGE);
    }

    public Sprite getAboutUsSprite() {
        return aboutUsSprite;
    }

    public Sprite getLeaderboardSprite() {
        return leaderboardSprite;
    }

    public Sprite getAchievementSprite() {
        return achievementSprite;
    }

    public Sprite getSoundOnSprite() {
        return soundOnSprite;
    }

    public Sprite getSoundOffSprite() {
        return soundOffSprite;
    }
}
