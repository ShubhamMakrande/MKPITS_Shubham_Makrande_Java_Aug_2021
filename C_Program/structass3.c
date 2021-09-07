//3- create a structure employee with members empno,empname,designation and salary
#include<stdio.h>
#include<conio.h>
struct employee
{
	int empno;
	char empname[20];
	char designation[20];
	float salary;
};
int main()
{
	struct employee e1;
	e1.empno=12;
	strcpy(e1.empname,"raja");
	strcpy(e1.designation,"manager");
	e1.salary=12000.0f;
	
	
	printf("\n empno=%d",e1.empno);
	printf("\n empname=%s",e1.empname);
	printf("\n designation=%s",e1.designation);
	printf("\n salary=%f",e1.salary);
}
