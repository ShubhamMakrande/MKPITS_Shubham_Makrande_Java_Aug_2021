//Write a C program to find whether a given year is a leap year or not.
#include<stdio.h>
#include<stdio.h>
int main()
{
	int year;
	printf("Enter the year:");
	scanf("%d",&year);
	if((year%400)==0)
	      printf("\n %d is a leap year.",year);
	else if((year%100)==0)
	      printf("\n %d is not a leap year.",year);
	else if((year%4)==0)
	      printf("\n %d is a leap year",year);
	else
	      printf("\n %d is not leap year.",year);	  	   
}
