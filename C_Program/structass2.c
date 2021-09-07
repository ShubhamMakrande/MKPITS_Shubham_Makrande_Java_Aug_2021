//2 -create a struture student with members rno,name,course, address,mobileno
#include<stdio.h>
#include<conio.h>
struct student
{
	int rno;
	int mobileno;
	char name[20];
	char course[20];
	char address[20];
	
};
int main()
{
	struct student s1;
	s1.rno=1234;
     s1.mobileno='9421558886';
	strcpy(s1.name,"shubham");
	strcpy(s1.course,"sicence");
	strcpy(s1.address,"nagpur");
	
	
	
	printf("\n rno=%d",s1.rno);
	printf("\n mobileno=%d",s1.mobileno);
	printf("\n name=%s",s1.name);
	printf("\n course=%s",s1.course);
	printf("\n address=%s",s1.address);
	
}
