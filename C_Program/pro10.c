//Asignment
//10 wap to accept basic_salary of employee and then calculate
//	hra= 25 % of basic_salary
//	da=35% of basic_salary
//	totalsalary= hra + da + basic_salary.
#include<stdio.h>
#include<conio.h>
int main()
{
	int basic_salary;
	float hra,da,total_salary;
	printf("Enter the basic_salary");
	scanf("%d",&basic_salary);
	hra=basic_salary*0.25f;
	da=basic_salary*0.35f;
	total_salary=basic_salary+hra+da;
	printf("\n the hra=%.2f",hra);
	printf("\n the da=%.2f",da);
	printf("\n the total_salary=%.2f",total_salary);
}
