package com.training.mars;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String s[])
    {
	int n,y;
	Scanner sc= new Scanner(System.in);
               System.out.println("enter month number");
	 n=sc.nextInt();
	if(n<=12&&n>=1)
	{
	System.out.println("enter year");
	y=sc.nextInt();
	System.out.println("Number of days in " + n+" month "+y+ "  year is :"+Days(n,y));	
	}
	else
	System.out.println("entered month number is not there in the calender");
   }	
 
static int Days(int m,int y )
{
	int d=0;
	if(m==1 || m==3 ||m==5 ||m==7||m==8||m==10||m==12)
	{
		d=31;	 
	}
	else 
	       if(m==4||m==6||m==9||m==11)
	       {
		d=30;	  
	       }
	       else 
	       {
		if(m==2)
	       	{
		  if(y%400==0&&y%100==0)
		  {
			d=29;
		  }
		  else  
		  {
		      if(y%4==0&&y%100!=0)
		        {
			d=29;
		        }
		        else
			d=28;
		   }
		}
		 	       	
	        }	
 
	return d;              
}
}