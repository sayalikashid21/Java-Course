// 5. Write a program which accepts one number from user and toggle contents of first and last nibble of the number.(Nibble means group of four bit). Return modified number.

import java.util.*;

class Number
{
    public int ToggleBit(int iNo)
    {
        int iMask = 0xf000000f;
        int iResult = 0;

        iResult = iMask ^ iNo;

        return iResult;
    }
}

class assi39_5
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo =0;
        int iRet =0;

        System.out.println("Enter the number: ");
        iNo = sobj.nextInt();

        Number bobj = new Number();

        iRet = bobj.ToggleBit(iNo);

        System.out.println("Modified number is: "+iRet);
    }
}