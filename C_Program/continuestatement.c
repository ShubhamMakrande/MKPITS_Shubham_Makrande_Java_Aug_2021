//example of continue statement
#include<stdio.h>
#include<conio.h>
int main()
{
	int i;
	while(i<5)
	{
		i++;
		if(i==4)
		{
			continue;
		}
		printf("\n%d",i);
	}
	printf("\n our of while loop.");
}
