//8 -Write a C program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
#include<stdio.h>
#include<conio.h>
int main()
{
	char name[20];
    int roll_no;
    int s1,s2,s3,total;
    float per,division;
    printf(" \n Enter the name:");
    scanf("%s",&name);
    printf("\n Enter the roll_no:");
    scanf("%d",&roll_no);
    printf("\n Enter the subject:");
    scanf("%d%d%d",&s1,&s2,&s3);
    total=s1+s2+s3;
    printf("\n total=%d",total);
    per=(float)total/300.0f*100.0f;
    printf("\n per = %.2f",per);
    division=(float)total/3.0f;
    if(per>=75)
    {
    	printf("\n division=distinction.");
    	
	}
	else if("per>=60 &&per<75")
	{
		printf(" division=first class");
	}
	else if(per>=40 && per<60)
	{
		printf("\n division=pass class");
	}
	else
	
	printf("\ndvivision=fail");

    
     
}
