//6 - wap to create a function sum with 2 int parameters and write code in it to add and display the addition of 2 no.
//wap to create a function sum with 2 int parameters and write code in it to add and 
//display the addition of 2 no.
#include<stdio.h>
#include<conio.h>
void sum(int num1,int num2)
{
	int result;
	result=num1+num2;
	printf("\n result=%d",result);
	
}
int main()
{
	int num1,num2;
	printf("\n Enter the number:");
	scanf("%d%d",&num1,&num2);
	sum(num1,num2);
	printf("\n Exit the main function");
	return 0;
}
