
import java.util.*;

public class Oneaway {
    public boolean compareLength(String s1, String s2)
    {
        boolean output=false;
        if (s1.length() == s2.length())
        {
           output= replaceChar(s1, s2);

        }
        else if((s1.length() < s2.length()) | (s1.length() > s2.length()))
        {
            output= removeInsertChar(s1, s2);
        }
       return output;
    }

    public boolean replaceChar(String s1, String s2)
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
                   return false;}
            }
            else
            {
                i=i+1;
            }
        }
        return true;
    }

    public boolean removeInsertChar(String s1, String s2)
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
                {return false;}
            }
            else
            {
                if((j+1)<s2.length()) j=j+1;
            }

        }
        return true;
    }
}
