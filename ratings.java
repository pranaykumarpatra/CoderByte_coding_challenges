package com.practise;

import java.util.*;
import java.io.*;

class testtttt{
    public static void StringChallenge(String str)
    {
        String num="";
        int count=0,i;
        for(i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(ch=='.')
                break;
            num+=ch;
        }
        

        int n=Integer.parseInt(num);
        for(int j=1;j<=n;j++)
        {
            System.out.print("full ");
            count++;
        }

        num="";
        for(int j=i;j<str.length();j++)
        {

            char ch=str.charAt(j);
            num+=ch;
        }

        double fraction=Double.parseDouble(num);

        if(fraction>0)
        {
            System.out.print("half ");
            count++;
        }


        for(i=count;i<5;i++)
        {
            System.out.print("empty ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Input: ");
        String input=sc.nextLine();
        StringChallenge(input);
    }
}



