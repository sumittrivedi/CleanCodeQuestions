/*
We have two types of printer. Type 1 printer can print, fax and scan. Type 2 printer is economical which can only print.
Here is code implementation by Rahul for both type of printer. Can you help Rahul by helping him to be a clean coder?
Which principal of clean code is Rahul voilating?
*/

package com.epam.solid;

interface Device
{
    void Print();
    void Fax();
    void Scan();
}

class AllInOnePrinter implements Device
{
    public void Print()
    {
         // Printing code.
    }
    public void Fax()
    {
         // Beep booop biiiiip.
    }
    public void Scan()
    {
         // Scanning code.
    }
}

class EconomicPrinter implements Device
{
    public void Print()
    {
        //Yes I can print.
    }
    public void Fax() 
    {
       // throw new NotSupportedException();
    }
    public void Scan()
    {
       // throw new NotSupportedException();
    }
}