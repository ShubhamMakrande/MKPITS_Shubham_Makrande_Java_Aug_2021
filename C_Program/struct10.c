//10 - repeat the above program by creating 2 structure variables stud1 and stud2
//create a structure student with members rno,name and address , pass this structure to function 
//display to display structure values
#include<stdio.h>
#include<conio.h>
struct student
{
	int rno;
	char name[20];
	char address[20];
};
void display(struct student s1);
int main()
{
	struct student stud1,stud2;
	printf(" enter rno");
	scanf("%d",&stud1.rno);
	printf(" enter student name");
	scanf("%s",&stud1.name);
	printf("Enter address");
	fflush(stdin);
	gets(stud1.address);
		printf("\n student details:");
	display(stud1);
	
	
	printf(" \nenter rno");
	scanf("%d",&stud2.rno);
	printf("enter student name");
	scanf("%s",&stud2.name);
	printf("Enter address");
	fflush(stdin);
	gets(stud2.address);
	printf("\n student details:");
	display(stud2);
}
void display(struct student s1)
{
printf("\n rno=%d",s1.rno);
printf("\n name=%s",s1.name);
printf("\n address=%s",s1.address);	
}

