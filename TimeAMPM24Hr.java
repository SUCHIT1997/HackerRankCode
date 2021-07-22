package HackerRank;

import java.util.Arrays;

public class TimeAMPM24Hr {
public static void main(String[] args) {
	
	String s="10:05:47PM";
	 String s1="";
	 String s3="";
	 String s2[];
	    if(s.endsWith("AM"))
	    {
	    	for (int i = 0; i < s.length(); i++) 
	    	{
				if(s.charAt(i)>=48 && s.charAt(i)<=58)
					s1=s1+s.charAt(i);
			}
	    	s2=s1.split(":");
	    	if(s2[0].equals("12"))
	    	s2[0]="00";
	    	for(int i=0;i<s2.length;i++)
	    	{
	    		
	    		s3=s3+s2[i];
	    		if(i<s2.length-1)
	    			s3=s3+":";
	    		
	    	}
	    }
	    else
	    {
	    	for (int i = 0; i < s.length(); i++) 
	    	{
				if(s.charAt(i)>=48 && s.charAt(i)<=58)
					s1=s1+s.charAt(i);
			}
	    	s2=s1.split(":");
	    	if(s2[0].equals("12"))
	    	s2[0]="12";
	    	else
	    	{
	    	int temp=Integer.valueOf(s2[0]);
	    	int temp2=12+temp;
	    	String s222="";
	    	s222=s222+temp2;
	    	s2[0]=s222;
	    	}
	    	for(int i=0;i<s2.length;i++)
	    	{
	    		
	    		s3=s3+s2[i];
	    		if(i<s2.length-1)
	    			s3=s3+":";
	    		
	    	}
	    	
	    }
	    System.out.println(s3);
}
}
