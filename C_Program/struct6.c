//6 - create a struture employee with members empid, empname , designation , salary
//accept the values from the user to store employee record in structure.
#include<stdio.h>
#include<conio.h>
struct employee
{
	int empid;
	char empname[20];
	char designation[20];
	float salary;
};
int main()
{
	struct employee emp1;
	printf("Enter empid:");
	scanf("%d",&emp1.empid);
	printf("Enter empname:");
	scanf("%s",&emp1.empname);
	printf("Enter designation:");
	scanf("%s",&emp1.designation);
	printf("Enter salary:");
	scanf("%f",&emp1.salary);
	
	printf("\n employee details:");
	printf("\n empid=%d",emp1.empid);
	printf("\n empname=%s",emp1.empname);
	printf("\n designation=%s",emp1.designation);
	printf("\n salary=%f",emp1.salary);
}

