//6 wap to accept empno,firstname , lastname, designation and salary of the employee and display it.
#include<stdio.h>
#include<conio.h>
int main()
{
	int empno;
	char firstname[20];
	char lastname[20];
	char designation[20];
	float salary;
	printf("enter empno");
	scanf("%d",&empno);
	printf("enter firstname:");
	fflush(stdin);
	gets(firstname);
	printf("enter lastname:");
	fflush(stdin);
	gets(lastname);
	fflush(stdin);
	printf("enter designation:");
	gets(designation);
	printf("enter salary");
	scanf("%f",salary);
	 
	 printf("\n employee details are:");
	 printf("\n empno=%d",empno);
	  printf("\n firstname=%s",firstname);
	   printf("\n lastname=%s",lastname);
	    printf("\n designation=%s",designation);
	     printf("\n salary=%f",salary);
}
