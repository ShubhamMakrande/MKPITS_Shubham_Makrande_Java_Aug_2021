//8 - example of passing a string to function to display the string
#include<stdio.h>
#include<conio.h>
int main()
{
	char name[]="mkpits";
	display(name);
}
void display(char *ch)
{
	printf("name=%s",ch);
}
