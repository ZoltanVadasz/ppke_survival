package edu.szebo.ppke.survival;


import java.util.ArrayList;

import edu.szebo.ppke.survival.proto.*;
import edu.szebo.ppke.survival.proto.Communication.Message;

public class Main {
	
	private static Message.Builder input = Message.newBuilder();
	
	public static void main(String[] args)
	{
		input.build();
		Integer[] fields = new Integer[input.getFieldsCount()];
		int width = input.getWidth();
		int height = input.getHeight();
		int hp = input.getHp();
		int id = input.getId();
		
		System.out.println("Width:" + width);
//		Integer[] sfields = new Integer[input.getSFieldsCount()];
//		for(int i = 0; i < input.getSFieldsCount(); i++)
//		{
//			sfields[i] = input.getSFields(i);
//		}
//		
//		for(int i = 0; i < input.getFieldsCount(); i++)
//		{
//			fields[i] = input.getFields(i);
//		}
//		
//		int[] fields_ = Utils.toIntArray(fields);
//		int[] sfields_ = Utils.toIntArray(sfields);
//		
//		int[] mapWidth = new int[width];
//		
//		for(int i = 0; i < width; i++)
//		{
//			mapWidth[i] = fields_[i];
//		}
	}
}
