//6 wap to accept a no. and print factorial of that no. using for loop.
#include<stdio.h>
#include<conio.h>
int main()
{
	int num,fact=1,i;
	printf("Enter the number");
	scanf("%d",&num);
	for(i=num;i>0;i--)
	{
		fact=fact*i;
	}
	printf("\nfact=%d",fact);
}
