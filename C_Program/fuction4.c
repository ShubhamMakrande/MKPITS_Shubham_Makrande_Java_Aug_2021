//B - function with parameters and returning nothing (void)
 // 4.wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
// wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
#include<stdio.h>
#include<conio.h>
void square(int num1)
{
	int square;
	square=num1*num1;
	printf("\n square the number=%d",square);
}
int main()
{
	int num1=1717;
	square(num1);
	printf("\n exiting the main fuction.");
}
