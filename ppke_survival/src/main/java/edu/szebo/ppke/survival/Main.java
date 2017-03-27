package edu.szebo.ppke.survival;

import java.util.Random;

public class Main {
		
	private static int[][] known;
	private static Random random;
	
	public static void main(String[] args)
	{
		Map.setMap();
		
		known = Map.getMap();
		
		for(int i = 0; i < Map.getHeight(); i++)
		{
			for(int j = 0; j < Map.getWidth(); j++)
			{
				if(known[i][j] == -1)
				{
					continue;
				}
				else if(known[i][j] == 0)
				{
					random = new Random();
					if(random.nextInt(2) / 2 == 0)
					{
						known[i][j] = random.nextInt(99);
					}
					else 
						continue;
				}
			}
		}
		System.out.println(known);
	}
	
}
