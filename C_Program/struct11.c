//11- wap to create a structure array of 3 elements of structure student
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
	struct student stud[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter rno");
		scanf("%d",&stud[i].rno);
		printf("enter name");
		scanf("%s",&stud[i].name);
		printf("enter address");
		fflush(stdin);
		gets(stud[i].address);
		display(stud[i]);
		printf("\n student [%d]details:",i+1);
		i++;
	}
}
void display(struct student s1)
{
	printf("\nrno=%d",s1.rno);
	printf("\nname=%s",s1.name);
	printf("\naddress=%s",s1.address);
}
