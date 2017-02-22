//Salil Malek
//salil.malek@ymail.com
//Looking for job. ;)


import java.util.ArrayList;
import java.util.List;


public class FindSumOfFileDirectoryWithImageFiles {
	public static void main(String args[]) {
		String S = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif";
		System.out.println(printSum(S));
	}

	public static int printSum(String S) {
		String[] array = S.split("\n");

/*		for (String s : array) {
			System.out.println(s);
		}*/

		List<String> list = new ArrayList<String>();

		int sum = 1, space = -1,max=0;
		for (int i = 0; i < array.length; i++) {
			String line = array[i];
			if (line.length() == line.trim().length()) {
				list.clear();
				space = -1;
				sum=1;
				list.add(line);
				space++;
				sum+=line.replaceAll("\\s+", "").length()+1;
			} else if ((list.get(space).length() - list.get(space).trim().length()) == (line.length()
					- line.trim().length())) {
		
				sum-=list.remove(space).replaceAll("\\s+", "").length()+1;			
				list.add(space, line);
				sum+=line.replaceAll("\\s+", "").length()+1;	
			} else if ((list.get(space).length() - list.get(space).trim().length()) < (line.length()
					- line.trim().length())) {
				list.add(line);
				space++;
				sum+=line.replaceAll("\\s+", "").length()+1;

			} else if ((list.get(space).length() - list.get(space).trim().length()) > (line.length()
					- line.trim().length())) {
				sum-=list.remove(space).replaceAll("\\s+", "").length()+1;
				sum-=list.remove(space-1).replaceAll("\\s+", "").length()+1;
				list.add(line);
				sum+=line.replaceAll("\\s+", "").length()+1;
				space--;
			}
			//System.out.println(list + " || " +sum);	
			//System.out.println(list);
			if (line.contains(".gif") || line.contains(".jpeg") || line.contains(".png")) {
				sum-=list.remove(space).replaceAll("\\s+", "").length()+1;
				space--;
				sum--;
				if(max<sum) max=sum;							
			}			
		}
		return max;
	}
}
