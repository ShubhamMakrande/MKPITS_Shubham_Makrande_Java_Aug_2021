//13 //wap to add two string using strcat function
#include<stdio.h>
#include<conio.h>
int main()
{
	char firstname[30];
	char lastname[30];
	printf("Enter first name:");
	gets(firstname);
	printf(" Enter lastname:");
	gets(lastname);
	strcat(firstname,lastname);
	printf("\n name=%s",firstname);
}
