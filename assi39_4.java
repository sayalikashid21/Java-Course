// 4. Write a program which accepts one number and position from user and toggle that bit. Return modified number.

import java.util.*;

class Number
{
    public int ToggleBit(int iNo, int iPos)
    {
        int iMask = 0x00000001;
        int iResult = 0;

        if(iPos > 32)
        {
            System.out.println("Invalid choice");
        }

        iMask = (iMask << (iPos-1));

        iResult = iMask ^ iNo;

        return iResult;
    }
}

class assi39_4
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0, iValue=0;
        int iRet =0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position: ");
        iValue = sobj.nextInt();

        Number bobj = new Number();

        iRet = bobj.ToggleBit(iNo, iValue);

        System.out.println("Modified number is: "+iRet);
    }
}