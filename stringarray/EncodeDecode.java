package stringarray;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecode {
	public static String[] encodedUrls = new String[10];
	public static int index = 0;

	public static Map<Integer, String> map = new HashMap<>();
	public static String host = "http://youtube.com/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = encode("watch?v=baMNdGNaheI");
		System.out.println("Encode " + ans);
		String original = decode(ans);
		System.out.println("Decode " + original);

	}

	public static String encode(String longUrl) {
		int key = longUrl.hashCode();
		System.out.println(key+"key");
		map.put(key, longUrl);
		
		return host + key;
	}

	public static String decode(String shortUrl) {
		System.out.println("Short" + shortUrl);
		int key = Integer.parseInt(shortUrl.replace(host, ""));
		return map.get(key);
	}
}
