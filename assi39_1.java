// 1. Write a program which accepts one number and position from user and check whether bit at that position is on or off. If bit is on return TRUE otherwise return false.

import java.util.*;

class Number
{
    public boolean ChkBit(int iNo, int iPos)
    {
        int iMask = 0x00000001;
        int iResult = 0;

        iMask = (iMask << (iPos-1));

        iResult = iMask & iNo;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class assi39_1
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0, iValue=0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position: ");
        iValue = sobj.nextInt();

        Number bobj = new Number();

        bRet = bobj.ChkBit(iNo, iValue);

        if(bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }
    }
}