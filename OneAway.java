package com.company;
import java.util.*;

/**
 * Created by sharmi on 8/25/17.
 */
public class OneAway {
    public void compareLength(String s1, String s2)
    {
        if (s1.length() == s2.length())
        {
            replaceChar(s1, s2);

        }
        else if((s1.length() < s2.length()) | (s1.length() > s2.length()))
        {
            removeInsertChar(s1, s2);
        }

    }

    public void replaceChar(String s1, String s2)
    {
        int replaceCounter=0;
        int i=0;
            for(int j=0; j< s2.length(); j++)
            {
                if(!(s1.charAt(i) == s2.charAt(j)))
                {
                    replaceCounter++;
                    System.out.println("One edit: REPLACED at " + i );
                    i++;
                    if(replaceCounter>1)
                    {System.out.print("**MORE THAN ONE EDIT**");
                    break;}
                }
                else
                {
                    i=i+1;
                }
            }
    }

    public void removeInsertChar(String s1, String s2)
    {
        int edit=0;
        int j=0;
        for(int i=0; i< s1.length(); i++)
        {
            if(!(s1.charAt(i) == s2.charAt(j)))
            {
                edit++;
                System.out.println("One edit at " + i );
                if((edit>1)| ((j+1)==s2.length()))
                {break;}
            }
            else
            {
               if((j+1)<s2.length()) j=j+1;
            }

        }
    }
}
