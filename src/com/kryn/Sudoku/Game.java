package com.kryn.Sudoku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Game extends Activity {

	private static final String TAG = "Sudoku";
	
	public static final String KEY_DIFFICULTY =
		"com.kryn.Sudoku.difficulty";
	public static final int DIFFICULTY_EASY = 0;
	public static final int DIFFICULTY_MEDIUM = 1;
	public static final int DIFFICULTY_HARD = 2;
	private int puzzle[];
	
	private PuzzleView puzzleView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		
		int diff = getIntent().getIntExtra(KEY_DIFFICULTY, DIFFICULTY_EASY);
		puzzle = getPuzzle(diff);
		calculateUsedTiles();
		
		puzzleView = new PuzzleView(this);
		setContentView(puzzleView);
		puzzleView.requestFocus();
	}

	private int[] getPuzzle(int diff) {
		// TODO Auto-generated method stub
		return new int[81];
	}

	private void calculateUsedTiles() {
		// TODO Auto-generated method stub
		
	}

	public void showKeypadOrError(int selX, int selY) {
		// TODO Auto-generated method stub
		
	}

	public boolean setTileIfValid(int selX, int selY, int tile) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getTileString(int i, int j) {
		// TODO Auto-generated method stub
		return "0";
	}

	public int[] getUsedTiles(int i, int j) {
		// TODO Auto-generated method stub
		return new int[5];
	}
	

}
