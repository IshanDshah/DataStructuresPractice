package collections;

import java.util.ArrayList;

public class VideoGameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] platform1={"Nintendo"};
		String[] platform2={"Xbox","PS"};
		VideoGame obj1=new VideoGame("Fifa",2014,"4", platform2);
		VideoGame obj2=new VideoGame("PokemonGO",2016,"3.6", platform1);
		ArrayList<VideoGame> games=new ArrayList<>();
		
		games.add(obj1);
		games.add(obj2);
		
		System.out.println(games);
		
	}

}
