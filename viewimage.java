package applet2;

import java.awt.*; 

import java.applet.*;  

  

class img1 extends Thread

{

	public void run() 

	{

    for(int i=0;i<5;i++)

    {

    	System.out.println("Img1");	

	try {Thread.sleep(1000);}catch (Exception e) {}

	}

	}

}

class img2 extends Thread

{

    public void run() 

    {

    for(int i=0;i<5;i++)

    {

    	System.out.println("Img2");



    	try {Thread.sleep(1000);}catch (Exception e) {}

    }

    }

}

public class imageview 

{

	public static void main(String args[])

	{

		img1 a = new img1();



		img2 b = new img2();

	

		a.start();

		

		b.start();

	}



}