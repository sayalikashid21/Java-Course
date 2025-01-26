// 4. Write a program which accepts two numbers and two positions from user and check whether bit at first or bit at second position is ON or OFF.

import java.util.*;

class Number
{
    public boolean ChkBit(int iNo, int iPos1, int iPos2)
    {
        int iMask1 = 0x00000001;
        int iMask2 = 0x00000001;
        int iResult1 = 0, iResult2=0;

        iMask1 = (iMask1 << (iPos1-1));
        iResult1 = iMask1 & iNo;

        iMask2 = (iMask2 << (iPos2-1));
        iResult2 = iMask2 & iNo;

        if(iPos1 > 32)
        {
            System.out.println("Invalid input");
        }

        if(iPos2 > 32)
        {
            System.out.println("Invalid input");
        }

        if((iResult1 == iMask1) && (iResult2 == iMask2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class assi40_4
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0, iValue1=0, iValue2=0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position1: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Position2: ");
        iValue2 = sobj.nextInt();

        Number bobj = new Number();

        bRet = bobj.ChkBit(iNo, iValue1, iValue2);

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