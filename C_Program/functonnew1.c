//function 
//wap to accept account no. and amount and initial_bal=1000 and create function deposit, withdrawl and show_balance 
#include<stdio.h>
#include<conio.h>
int main()
{
	int actno,amount;
	int bal=1000;
	printf("\n Enter actno no:");
	scanf("%d",&actno);
	printf("\n Enter deposit:");
	scanf("%d",&amount);
	//calling the function deposit
	deposit(actno,amount,bal);
	//calling the function withdrawl
	withdrawl(actno,amount,bal);
	// calling the fuction showbalance
	showbalance(actno,bal);
	};
	//fuction return nothing
	void deposit(int actno,int amount,int bal)
	{
		bal=bal+amount;
		printf("\n actno no:%d",actno);
		printf("\n amount deposit,balance amount:%d",bal);
	}
	void withdrawl( int actno,int amount,int bal)
	{
		bal=bal-amount;
		printf("\n actno:%d",actno);
		printf("\n amount deposit,balance amount:%d",bal);
	}
	void showbalance(actno,bal)
	{
		printf("\n account:%d",actno);
		printf("\n balance amount:%d",bal);
	}

