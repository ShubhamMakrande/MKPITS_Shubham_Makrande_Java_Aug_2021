//10 - wap to accept a number and print from 1 to the number entered by the user
#include<stdio.h>
#include<conio.h>
int main()
{
	int num;
	int i=1;
	printf("Enter the number:");
	scanf("%d",&num);
	while(i<=num)
	{
		printf("\n num %d",num);
		i=i+1;
	}

	
}
