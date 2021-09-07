//8- create a structure student and accept values from the user.
#include<stdio.h>
#include<conio.h>
struct student 
{
	int rno;
	char name[20];
	char course[20];
	char address[20];
	int mobileno;
};
int main()
{
	struct student s1;
	printf("enter rno:");
	scanf("%d",&s1.rno);
	printf("enter name:");
	scanf("%s",&s1.name);
	printf("enter course:");
	scanf("%s",&s1.course);
		fflush(stdin);
	printf("enter address:");
	gets(s1.address);
	fflush(stdin);
	printf("enter mobileno:");
	scanf("%d",&s1.mobileno);
	printf("\n----------------------------student details--------------------------");
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n course=%s",s1.course);
	printf("\n address=%s",s1.address);
	printf("\n mobile=%d",s1.mobileno);
	
}
