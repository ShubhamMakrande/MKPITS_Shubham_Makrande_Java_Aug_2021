//9 - wap to accept 5 subject marks using for loop and print total and percentage.
#include<stdio.h>
#include<conio.h>
int main()
{
	int marks,total,i;
	float per;
	for(i=1;i<=5;i++)
	{
		printf("Enter marks:");
		scanf("%d",&marks);
		total=total+marks;
	}8 -wap to accept a no. and print whether it is a prime no. or not.
#include<stdio.h>
int main() {
 int num,result,i;
 printf("entern number");
 scanf("%d",&num); //5
 for(i=2;i<num;i++)
 {
 	if(num % i == 0)
 	{
 		printf("\n not a prime no.");
 		break;
	 }
 }
 if(i==num)
 {
 	printf("\n no. is prime");
 }
 
     
}

	printf("\n total =%d",total);
	per=(float) (total/500.0f)*100.0f;
	printf("\nper= %.2f",per);
	if(per>=75)
	{
		printf("\n grade=distinction");
		
	}
	else if(per>=60&&per<75)
	 {
		printf("\n grade=first");
		
	}
	else{
		print
