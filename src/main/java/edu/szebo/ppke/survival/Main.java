package edu.szebo.ppke.survival;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.google.protobuf.InvalidProtocolBufferException;
import edu.szebo.ppke.survival.proto.*;
import edu.szebo.ppke.survival.proto.Communication.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static Logger log = LoggerFactory.getLogger(Main.class.getName());


	
	public static void main(String[] args)
	{

		Consumer<String> inputConsumer = new Consumer<String>() {
			@Override
			public void accept(String s) {

				try {
					Message m = Message.PARSER.parseFrom(s.getBytes());

				log.debug("We received: " + s);
				} catch (InvalidProtocolBufferException e) {
					log.error("Input message format was wrong: " + e.getMessage(), e);
				}
			}
		};

		log.debug("We started up, it's a happy day :-) ");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Stream<String> lineStream = reader.lines();

		lineStream.forEachOrdered(inputConsumer);

		log.debug("We'll never see this, since we read in an infinite loop :-) ");

/*
		Integer[] fields = new Integer[input.getFieldsCount()];
		int width = input.getWidth();
		int height = input.getHeight();
		int hp = input.getHp();
		int id = input.getId();
		
		log.debug("Width:" + width);
*/


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
