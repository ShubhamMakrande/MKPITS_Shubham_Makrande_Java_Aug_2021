//6-Write a C program to find the largest of three numbers
#include<stdio.h>
#include<conio.h>
int main()
{
	int num1,num2,num3;
	printf("Enter the three number:");
	scanf("%d%d%d",&num1,&num2,&num3);
	if(num1>num2)
	   printf("\n num1 is large.");
	   else if(num2>num3)
	       printf("\n num2 is large.");
	   else if (num3>num2)
	       printf("\n num3 is large.");
}
