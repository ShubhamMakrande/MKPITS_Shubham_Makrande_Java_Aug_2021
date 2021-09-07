//17-strlwr() function
//wap to convert string into lower case
#include<stdio.h>
#include<conio.h>
int main()
{
	char name[30];
	printf("Enter fristname:")
	gets(name);
	strlwr(name);
	printf("\n name=%s",name);
}
