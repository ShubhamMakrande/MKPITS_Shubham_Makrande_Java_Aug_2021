//Asignment
//9 wap to accept 5 subject marks and print total and average marks.
#include<stdio.h>
#include<conio.h>
int main()
{
	int s1,s2,s3,s4,s5;
	float total,average;
	printf("enter the five subject:");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	total=s1+s2+s3+s4+s5;
	average=total/5.0;
    printf("\nthe total marks=%.2f",total);
	printf("\nthe averag marks=%.2f",average);
	return 0;
}
