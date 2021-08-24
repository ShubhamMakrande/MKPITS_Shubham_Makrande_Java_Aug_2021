 //3. wap to create a function square to accept  a no. and display the square of that no.
//creating a function sum
#include<stdio.h>
#include<conio.h>
void square()
{
	int num1,square;
	printf("\n Enter the number:");
	scanf("%d",&num1);
	square=num1*num1;
	printf("\n square the number=%d",square);
}
int main()
{
	square();
	printf("\n bye the main fuction.");
}
