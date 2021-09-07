//9 Once a string is defined, it cannot be reassigned to another set of characters. However, using pointers, we can assign the set of characters to the string. Consider the following example.
#include<stdio.h>
#include<conio.h>
int main()
{
	char *p="hello mkpits";
	printf(" before assignng:%s\n",p);
	p="hello";
	printf("after assigning:%s",p);
	
}
