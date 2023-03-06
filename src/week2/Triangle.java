package week2;

import java.util.*;

class Triangle{

	int Perimeter_Calculator (int a, int b, int c)	{ 
        return a + b + c;
		// Fill in the code below for the method

	}

	int Area_Calculator (int b, int h)	{
        return (b * h)/2;

        // Fill in the code below for the method
        
	}


    // Do not modify the code below
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.Perimeter_Calculator(a,b,c);
        int area = object.Area_Calculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
}

}
