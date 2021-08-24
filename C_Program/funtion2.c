//2- wap to create a function sum to accept 2 no. and display the addition of 2 no.
// wap to create a function sum to accept 2 no. and display the addition of 2 no.
//creating a function sum
#include<stdio.h>
#include<conio.h>
void sum()
{
	int num1,num2,result;
	printf("Enter the 2 no:");
	scanf("%d%d",&num1,&num2);
	result=num1+num2;
	printf("\n addtion of 2 no=%d",result);
	 
}
int main()
{
	sum();
	printf("\nbye the main fuction");
}

