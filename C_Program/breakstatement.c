//1- example of break statement.
#include<stdio.h>
#include<conio.h>
int main()
{
	int i=1;
	while(i<=10)
	{
		printf("\n%d",i);
		i++;
		if(i>3)
		{
			break;
		}
	}
	printf("\n out of while loop.");
}
