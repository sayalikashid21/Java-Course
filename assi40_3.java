// 3. Write a program which checks whether 9th or 12th bit is ON or OFF.

import java.util.*;

class Number
{
    public static boolean ChkBit(int iNo)
    {
        int iMask = 0x00000900;
        int iResult = 0;

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

class assi40_3
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        boolean bRet = false;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        Number bobj = new Number();

        bRet = bobj.ChkBit(iNo);

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