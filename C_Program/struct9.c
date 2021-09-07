//passing structure to function
//9 - create a structure student with members rno,name and address , pass this structure to function display to display structure values
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
void display(struct student s1);//creating function declaration
#include<stdio.h>
int main()
{
	struct student s1;
	printf("enter rno");
	scanf("%d",&s1.rno);
	printf("Enter  student name");
	scanf("%s",&s1.name);
	printf("Enter address");
	fflush(stdin);
	gets(s1.address);
	 printf("\n student details are");
	 display(s1);// passing structure to function
	 	
}
//creating function display with structure parameter
/// to accept structure of type studen
void display(struct student s1)
{
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n address=%s",s1.address);
}
