// 2. Write a program which accepts two numbers from user and display position of common ON bits from that two number.

import java.util.*;

class Number
{
    public void CommonBits(int iNo1, int iNo2)
    {
        int mask =0;
        int iResult = 0, i=0;
        iResult = iNo1 & iNo2;

        for(i=1; i<=32; i++)
        {
            mask = 0x00000001;
            mask = mask << (i-1);
            if(iResult == mask)
            {
                System.out.println(i+"\t");
            }
        }
    }
}

class assi40_2
{
    public static void main(String arg[])
    {
        Scanner sobj =new Scanner(System.in);

        int iNo1 =0, iNo2 = 0;
        
        System.out.println("Enter First number: ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        iNo2 = sobj.nextInt();

        Number bobj = new Number();

        bobj.CommonBits(iNo1, iNo2);

        sobj.close();
    }
}