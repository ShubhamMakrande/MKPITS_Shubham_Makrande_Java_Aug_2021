//iteration construct :
//1- wap to accept your name and print your name 5 times
#include<stdio.h>
#include<conio.h>
int main()
{
	int i=1;
	char name[20];
	printf(" Enter the name:");
	scanf("%s",&name);
	while(i<=5)
	{
		printf("\n name=%s",name);
		i=i+1;
	}
	printf("\n tata");
}
