package geekforgeeks;

public class CircularJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean ans=judgeCircle("UD");
		System.out.println(ans);
		
	}

	
	public static boolean judgeCircle(String moves) {
        moves=" " + moves + " ";
        return moves.split("L").length==moves.split("R").length && moves.split("U").length == moves.split("D").length;
    }
}
