//14 - create a structure array to produce result of student.
//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
#include<stdio.h>
#include<conio.h>
struct student
{
	int rno;
	char name[20];
	int marks1;
	int marks2;
	int marks3;
};
void display(struct student s1);
int main()
{
	struct student s1[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter rno:");
		scanf("%d",&s1[i].rno);
		printf("enter name:");
		scanf("%s",&s1[i].name);
		printf("enter marks1:");
		scanf("%d",&s1[i].marks1);
		printf("enter marks2:");
		scanf("%d",&s1[i].marks2);
		printf("enter marks3:");
		scanf("%d",&s1[i].marks3);
		printf("\n student[%d]--------------------------------------------detail:",i+1);
		display(s1[i]);
		printf("\n---------------------------------------------------------",i+1);
		i++;
		
	}
}
void display(struct student s1)
{
	int total;
	float per;
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	total=s1.marks1+s1.marks2+s1.marks3;
	printf("\n total=%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\n per=%f",per);
	if(per>=75)
	{
		printf("\n grade=distiction");
	}
	else if(per<=60 && per<75)
	{
		printf("\ngrade=first");
	}
	else
	{
		printf("\ngarde=fail");
	}
	}

