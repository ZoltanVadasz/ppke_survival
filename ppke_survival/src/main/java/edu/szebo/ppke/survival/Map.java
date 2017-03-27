package edu.szebo.ppke.survival;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Map {
	
	private static int[][] map;
	private static int height = 10;
	private static int width = 10;
	
	public Map(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public static void setMap(){
		map = new int[10][10];
		
		map[0][0]=-1; map[0][1]=-1; map[0][2]=-1; map[0][3]=-1; map[0][4]=-1; map[0][5]=-1; map[0][6]=-1; map[0][7]=-1; map[0][8]=-1; map[0][9]=-1;
		map[1][0]=-1; map[1][1]=20; map[1][2]=0; map[1][3]=0; map[1][4]=0; map[1][5]=0; map[1][6]=0; map[1][7]=0; map[1][8]=0; map[1][9]=-1;
		map[2][0]=-1; map[2][1]=0; map[2][2]=-1; map[2][3]=0; map[2][4]=-1; map[2][5]=-1; map[2][6]=-1; map[2][7]=-1; map[2][8]=0; map[2][9]=-1;
		map[3][0]=-1; map[3][1]=0; map[3][2]=-1; map[3][3]=0; map[3][4]=-1; map[3][5]=0; map[3][6]=0; map[3][7]=-1; map[3][8]=76; map[3][9]=-1;
		map[4][0]=-1; map[4][1]=0; map[4][2]=-1; map[4][3]=0; map[4][4]=-1; map[4][5]=0; map[4][6]=-1; map[4][7]=-1; map[4][8]=0; map[4][9]=-1;
		map[5][0]=-1; map[5][1]=0; map[5][2]=-1; map[5][3]=0; map[5][4]=-1; map[5][5]=0; map[5][6]=-1; map[5][7]=27; map[5][8]=0; map[5][9]=-1;
		map[6][0]=-1; map[6][1]=15; map[6][2]=0; map[6][3]=0; map[6][4]=0; map[6][5]=0; map[6][6]=-1; map[6][7]=0; map[6][8]=0; map[6][9]=-1;
		map[7][0]=-1; map[7][1]=0; map[7][2]=-1; map[7][3]=-1; map[7][4]=-1; map[7][5]=0; map[7][6]=-1; map[7][7]=-1; map[7][8]=0; map[7][9]=-1;
		map[8][0]=-1; map[8][1]=0; map[8][2]=0; map[8][3]=0; map[8][4]=0; map[8][5]=0; map[8][6]=13; map[8][7]=0; map[8][8]=0; map[8][9]=-1;
		map[9][0]=-1; map[9][1]=-1; map[9][2]=-1; map[9][3]=-1; map[9][4]=-1; map[9][5]=-1; map[9][6]=-1; map[9][7]=-1; map[9][8]=-1; map[9][9]=-1;
		
	}
	
	public static int[][] getMap()
	{
		return map;
	}
	
	public static int getHeight()
	{
		return height;
	}
	
	public static int getWidth()
	{
		return width;
	}
}
