//2- Write a C program to check whether a given number is even or odd.
#include<stdio.h>
#include<conio.h>
int main()
{
	int n1,rem;
	printf("Enter the number:");
	scanf("%d",&n1);
	rem=n1%2;
	if(rem==0)
	
		printf("\n number is even");
		else
		printf("\n number is odd");
}
