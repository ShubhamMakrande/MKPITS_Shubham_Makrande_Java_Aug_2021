//5- Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote
#include<stdio.h>
#include<conio.h>
int main()
{
	int age;
	printf("Enter the age:");
	scanf("%d",&age);
	if(age>=18)
	  printf("\n %d it is eligible for vote.",age);
	  else
	  printf("\n %d it is not eligible for vote.",age);
	  }
