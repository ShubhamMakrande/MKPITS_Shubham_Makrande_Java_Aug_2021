//problem statement : accept a number and then find whether that number is strong no. or not.
//first we have to seperate each digit of a number.
//suppose no  is 145 
#include<stdio.h>
#include<conio.h>
int main()
{
	int num=144;
	int originalnum=num;//145
	int rem;
	int fact;
	int sum=0;
	while(num!=0)
	{
		rem=num%10;//1
	//	printf("\n remainder=%d",rem);//1
		num=num/10;//0
		//printf("\n num=%d",num);//0
		fact=factorial(rem);
		sum=sum+fact;//sum=144+1=145
		
	}
	if(originalnum==sum)
	{
		printf("\n no[%d] is strong no.",originalnum);
	}
	else
	{
		printf("\n no [%d] is not a strong no.",originalnum);
	}
}
//creating a function fact to calculate factorail od a number
int factorial(int r)
{
	int f=1;
	while(r>0)
	{
		f=f*r;
		r=r-1;
	}
	return f;
}
