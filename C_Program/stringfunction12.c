//string function
//12 strcpy
//program to copy one string into another
//wap to find length of a string
#include<stdio.h>
#include<conio.h>
int main()
{
	char ch[15];
	char ch1[15];
	printf("enter a string");
	gets(ch);
	strcpy(ch1,ch);
	printf("\n string1=%s",ch);
	printf("\n sting2=%s",ch1);
	
}
