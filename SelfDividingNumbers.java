import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ans = selfDividing(1, 22);
		for (int x : ans)
			System.out.println(x);
	}

	private static List<Integer> selfDividing(int low, int high) {
		// TODO Auto-generated method stub


        List<Integer> ans = new ArrayList<>();
		for (int i = low; i <= high; i++) {
			if (i % 10 == 0) {
				continue;
			} else {
				String s = String.valueOf(i);
				char[] c = s.toCharArray();
				int count = 0;
                if(s.contains("0")){
                    continue;
                }
				for (char b : c) {
					if (i % (Character.getNumericValue(b)) == 0) {
						count++;

					}
				}

				if (count == c.length) {
					ans.add(i);
				}

			}

		}
		return ans;
	}

}
