// 3.Write a java program which accept number from user and return the count of digits in between 3 and 7.

import java.util.*;

class Digit
{
    public int CountRange(int iNo)
    {
        int iCnt=0, iDigit=0;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           if((iDigit > 3) && (iDigit < 7))
           {
                iCnt++;
           } 
           iNo = iNo / 10;
        }
        return iCnt++;
    }
}

class assi34_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0, iRet=0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digit aobj = new Digit();

        iRet = aobj.CountRange(iValue);

        System.out.println("count of digits in between 3 and 7: "+iRet);

        sobj.close();
    }
}