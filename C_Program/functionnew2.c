//2 wap to check whether amount to be deposited or withdrawl
#include<stdio.h>
#include<conio.h>
int main()
{
int actno,amount;
int bal=1000;
printf("\n Enter account no:");
scanf("%d",&actno);
printf("Enter deposit:");
scanf("%d",&amount);
//calling the function deposit
deposit(actno,amount,bal);
//calling the function withdrawl
withdrawal(actno,amount,bal);
//calling the function showbalance
showbalance(actno,bal);
}

//function return nothing
void deposit(int actno,int amount,int bal)
{
	if(amount>0)
	{
		bal=bal+amount;
		printf("\n account no:%d",actno);
		printf("\n amount deposited,balance amount:%d",bal);
			}
	else
	{
		printf("\n amount to be deposit should be greater then 0");
	}
}
   void withdrawal(int actno,int amount,int bal)
   {
   	if(amount<=bal)
   	{
   		bal=bal-amount;
   		printf("\n account no:%d",actno);
   		printf("\n amount withdrawal,balance amount:%d",bal);
	   }
	   else
	   {
	   	printf("\n no amount due to insuffient ");
	   }
   }
   void showbalance(actno,bal)
   {
   	printf("\n account no:%d",actno);
   	printf("\n balance amount is:%d");
   }
