//1- wap to create a character array of 10 elements to store a name .
#include<stdio.h>
#include<conio.h>
int main()
{
	char name[10]={'s','h','u','b','h','a','m','\0'};
	int i;
	for(i=0;i<10;i++)
	{
		printf("%c",name[i]);
	}
	printf("\n name=%s",name);
}
