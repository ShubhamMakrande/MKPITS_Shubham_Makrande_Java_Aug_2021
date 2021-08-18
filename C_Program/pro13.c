//4 -wap to accept a character from the user and then print the character entered.
// char datatype is used 
//and %c format specifier for character.
#include<stdio.h>
#include<conio.h>
int main(){
	char ch;
	printf("enter character ");
	scanf("%c",&ch);
	printf("\n char = %c",ch);
	
	printf("\nenter another character ");
	ch=getch();
	printf("\n char = %c",ch);
	 
	 	printf("\nenter another character ");
	ch=getche();
	printf("\n char = %c",ch);



}
