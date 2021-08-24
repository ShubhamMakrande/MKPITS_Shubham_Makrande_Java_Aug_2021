//5 - repeat the above program with accepting the no. from the user.
// wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
#include<stdio.h>
#include<conio.h>
int square(int num1)
{
	int square;
	square=num1*num1;
	printf("\n sqaure the number=%d",square);

}
int main()
{
	int num1;
	printf("\n Enter the number:");
	scanf("%d",&num1);
	square(num1);
	printf("\n exiting the main function");
}
