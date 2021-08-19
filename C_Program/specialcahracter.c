//Assginment
//15 -Write a C program to check whether a character is an alphabet, digit or special character
#include<stdio.h>
#include<conio.h>
int main()
{
    char ch;
    printf("Enter character: ");
    scanf("%c",&ch);
    
    if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
        printf("'%c'is alphabet.",ch);
    else if(ch>=48 && ch<=57)
        printf("'%c'is digit.",ch);
    else 
        printf("'%c'is special character.",ch);
    
    return 0;
}
