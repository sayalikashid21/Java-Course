// 4.Write a java program which accept number from user and return the multiplication of all digits.

import java.util.*;

class Digit
{
    public int Multiply(int iNo)
    {
        int iCnt=0, iDigit=0, iMul=0;
        iMul = 1;

        while(iNo != 0)
        {
           iDigit = iNo % 10;
           if(iDigit == 0)
           {
                iDigit =1;
           }
           iNo = iNo / 10;
           iMul = iMul * iDigit;
        }
        return iMul;
    }
}

class assi34_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue=0, iRet=0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Digit aobj = new Digit();

        iRet = aobj.Multiply(iValue);

        System.out.println("multiplication of all digits is: "+iRet);

        sobj.close();
    }
}