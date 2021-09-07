//4 wap to accept actno,amount,and transaction(whether you want to deposit or withdrawl or showbalance) and call the appropriate function.
#include<stdio.h>
#include<conio.h>
int main()
{
	int actno,amount;
	int bal=1000;
	char transaction[20];
	printf("\n enter account:");
	scanf("%d",&actno);
	printf("\n enter amount:");
	scanf("%d",&amount);
	printf("enter transaction:deposit or withdrawal");
	scanf("%s",&transaction);
	if(strcmp(transaction,"deposit")==0)
	{
		bal=deposit(actno,amount,bal);
		showbalance(actno,bal);
	}
	if(strcmp(transaction,"withdrawal")==0)
	{
		bal=(actno,amount,bal);
		showbalance(actno,bal);
	}
}
//function returning value
int deposit(int actno,int amount,int bal)
{
	if(amount>0)
	{
		bal=bal+amount;
		printf("\n account no:%d",actno);
		printf("\n amount deposit,balance amount is:%d",bal);
	}
	else
	{
		printf("\n amount deposit should be grater then 0");
		
	}
	return bal;
}
int withdrawal(int actno,int amount,int bal)
{
	if(amount<=bal)
	{
		bal=bal-amount;
		printf(" \n account no:%d",actno);
		printf("\n amount withdrawal,balance amount:%d",bal);
		
	}
	else
	
	{
		printf("\n no withdrawal due to insuffient");
	}
	return bal;
}
int showbalance(int actno,int bal)
{
	printf("\n account no:%d",actno);
	printf("\n balance amount:%d",bal);
}
