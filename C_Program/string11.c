//string functions
//11 - //wap to find length of a string
#include<stdio.h>
#include<conio.h>
int main()
{
	char ch[15];
	int length;
	printf("Enter string:");
	gets(ch);
	length=strlen(ch);
	printf("\n length of string=%d",length
	);
}
