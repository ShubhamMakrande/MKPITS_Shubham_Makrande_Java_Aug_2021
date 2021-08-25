//8 wap to create a function factorial with one int parameter ,
//calculate and display the factorial of that number.
#include<stdio.h>
#include<conio.h>
void factorial(int num)
{
	int i,fact=1;
	if(num==0)
	{
		printf("\n factorial of 0 is 1(0!=1)");
    }
    else
    {
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	printf("\nfactorial of %d is %d(%d=%d)",num,fact,num,fact);
	
  }
}
int main()
{
	int num;
	printf("\n Enter the number:");
	scanf("%d",&num);
	factorial(num);
	printf("\n exit the main function.");
	return 0;
}
