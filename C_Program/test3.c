//3- Write a C program to check whether a given number is positive or negative.
#include<stdio.h>
#include<conio.h>
int main()
{
	int n1;
	printf("Enter the number:");
	scanf("%d",&n1);
	if(n1>=0)
	printf("\n %dnumber is positive",n1);
	else
	printf("\n%d number is nagtive",n1);
}
