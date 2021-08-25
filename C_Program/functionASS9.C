//9 - wap to create function result with 3 int parameters to accept 3 subject marks
//calculate and display total, percentage and grade.
#include<stdio.h>
#include<conio.h>
void result(int s1,int s2,int s3)
{
	int total;
	float per,grade;
	total=s1+s2+s3;
	printf("\n total=%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\n per=%.2f",per);
	if(per>=75)
	{
		printf("\n grade A+");
	
	}
	else if(per>=60 && per<75 )
	{
		printf("\n grade A");
	}
	else if(per>=40 && per<60)
	{
		printf("\n grade B");
	}
	else
	{
		printf("\n grade f");
	}
}
int main()
{
	int s1,s2,s3;
	printf("\nEnter the 3 subject:");
	scanf("%d%d%d",&s1,&s2,&s3);
	result(s1,s2,s3);
	printf("\nexit the main functiom.");
}
