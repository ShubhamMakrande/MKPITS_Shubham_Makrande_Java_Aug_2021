//15 - create a structure to product employee salary statement.
//create a structure employee with members empid,empname and salary , pass this structure to function 
//display to display structure values
#include<stdio.h>
#include<conio.h>
struct employee
{
	int empid;
	char empname[20];
	float salary;
};
void display(struct employee e1);
int main()
{
	struct employee e1[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter empid:");
		scanf("%d",&e1[i].empid);
		printf(" enter empname:");
		scanf("%s",&e1[i].empname);
		printf("Enter salary:");
		scanf("%d",&e1[i].salary);
		printf("\n---------------employeee[%d] details:",i+1);
		display(e1[i]);
		printf("\n-----------------------------------------------------------------------",i+1);
		i++;
	}
}
void display(struct employee e1)
{
	printf("\n empid=%d",e1.empid);
	printf("\n empname=%s",e1.empname);
	printf("\n salary=%f",e1.salary);
}
