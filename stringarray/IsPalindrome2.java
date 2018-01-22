package stringarray;

public class IsPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ciuypudrxccjlfoirrsemxihzffjrbpphptpkdqsipbdnmvyfzamalkzmsyrvfvvxseoajrfpduxptuqdunwvgjeajliwfrbjxihbkgdoorbkmwhmjfbnkuwgrcocffflcwqerndfkldtgkduouggbkgbddfjblrtulewwtsjhspvenuxwfofknlhpyzrcdeiafqvikfhxqpsaighonffdrruhdpvvfxbgipcxvlkpcnripvmasgegtylkdknzzqsfitzzvtlhzecuwvluzepgyieevtqlpigtbjqmkgjyfmzdbgolkwkwncagrgjdeipijprpqsxvxlozkmckqpdeahunygbzdnphsrkvznncakbgotecdementbewrlrwermvzpyosqppysrbvpogjkhcwehunynrarjplaujaxbtvmlqgiwmuvvsbzacfhheypkqghbdthlixludgcpbgicvzroeogmonryfuyegpalgcbkvftvwphgknftojvgpidbpwyxmxlrmaalpzkkbuvldqexlspclwehgsqywbeftkajjvyjqgteznheenuvyhozdxokydpbwlcwxalfcjnrrvxymsljeapjnrnjjlckvldffrybieluhqokociiypiehikglzcyngihhsncpfiolhapademvzqehlugitvauoxqkdnlcasporatmlgzsgbmcxziauxloxdoiyhrnlimmfvyetdgcqtihatfgwyxhohfzepsvzmraiqwctqvivwnprkxytirawvafzrytgopljyrghwztzjdjozvxqbkisyidldcergnpzaoufdxifcfkbsmlpsthixzrweieiikbeiacysbckqpaeiuhkbcbbvlmndfbkvihhrmtnkmogiampbnqkamejoozjvaaahdxbhwbjwtnubctaetzzvggjmhnhyydrkotwjkkjciwalmjbzxamsuwwhzcvszwyrqyjcjvlcqbogmwbmhnffnhmbwmgobqclvjcjyqrywzsvczhwwusmaxzbjmlawicjkkjwtokrdyyhnhmjggvzzteatcbuntwjbwhbxdhaaavjzoojemakqnbpmaigomkntmrhhivkbfdnmlvbbcbkhuieapqkcbsycaiebkiieiewrzxihtsplmsbkfcfixdfuoazpngrecdldiysikbqxvzojdjztzwhgryjlpogtyrzfavwarityxkrpnwvivqtcwqiarmzvspezfhohxywgftahitqcgdteyvfmmilnrhyiodxolxuaizxcmbgszglmtaropsaclndkqxouavtigulheqzvmedapahloifpcnshhignyczlgkiheipyiicokoqhuleibyrffdlvkcljjnrnjpaejlsmyxvrrnjcflaxwclwbpdykoxdzohyvuneehnzetgqjyvjjaktfebwyqsghewlcpslxeqdlvubkkzplaamrlxmxywpbdipgvjotfnkghpwvtfvkbcglapgeyufyrnomgoeorzvcigbpcgdulxilhtdbhgqkpyehhfcazbsvvumwigqlmvtbxajualpjrarnynuhewchkjgopvbrsyppqsoypzvmrewrlrwebtnemedcetogbkacnnzvkrshpndzbgynuhaedpqkcmkzolxvxsqprpjipiedjgrgacnwkwklogbdzmfyjgkmqjbtgiplqtveeiygpezulvwucezhltvzztifsqzznkdklytgegsamvpirncpklvxcpigbxfvvpdhurrdffnohgiaspqxhfkivqfaiedcrzyphlnkfofwxunevpshjstwwelutrlbjfddbgkbgguoudkgtdlkfdnreqwclfffcocrgwuknbfjmhwmkbroodgkbhixjbrfwiljaejgvwnudqutpxudpfrjaoesxvvfvrysmzklamazfyvmndbpisqdkptphppbrjffzhixmesrriofljccxrdupyuich";
		boolean[] ans=new boolean[10000];
		int j=0;
		for(int i=0;i<s.length();i++)
        {
            ans[j++]=isPalindrome(s);
            char c=s.charAt(i);
            String s1= s.substring(0,i) + s.substring(i+1,s.length());
            //System.out.println(s1);
            ans[j++]=isPalindrome(s1);
        }
		boolean jawab=false;
		for(boolean a:ans)
		{
			if(a== true)
			{
				jawab=true;
			}
		}
		System.out.println(jawab);
	}
	
	
	    public static boolean isPalindrome(String s) {
	        //System.out.println(s);	        
	    	
	    	char[] arr1=s.toCharArray();
	    	StringBuilder sb=new StringBuilder();
	    	
	    	for(int i=arr1.length;i>0;i--)
	    	{
	    		sb.append(arr1[i-1]);
	    		
	    	}
	        
	        return sb.toString().equals(s);
	    }
	

}
