/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        
        while (testCases-- > 0) {
            String line = scan.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>"); //works only if < cannot be a text char inside tags
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("None");
            }
        }
        scan.close();
	}
}