//8 - wap to accept a no. print factorial of that no.
//suppose num=5 
//so factorial of 5! = 5*4*3*2*1 =120 
#include<stdio.h>
#include<conio.h>
int main()
{
	int num,fact=1;
	printf("Enter the number:");
	scanf("%d",&num);
	while(num>0)
	{
		fact=fact*num;
		num=num-1;
		
	}
	printf("\n Enter the factorial is %d",fact);
}
