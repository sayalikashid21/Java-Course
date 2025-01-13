// 4. Write a Java program which accept string from user and check whether it contains vowels in it or not.

import java.util.*;

class assi32_4
{
     public static boolean ChkVowel(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();
        boolean bFound = false;

        for(iCnt=0; iCnt<Arr.length; iCnt++)
        {
            if(Arr[iCnt]=='a' ||  Arr[iCnt]=='e' || Arr[iCnt]=='i' ||Arr[iCnt]=='o' || Arr[iCnt]=='u')
            {
                bFound =  true;
            }
        }
        return bFound;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;
        boolean iRet = false;

        System.out.println("Enter the String: ");
        str = sobj.nextLine();

        iRet = ChkVowel(str);

        if(iRet == true)
        {
            System.out.println("Vowel is present");
        }
        else
        {
            System.out.println("Vowel is not present");
        }

        sobj.close();
    }
}