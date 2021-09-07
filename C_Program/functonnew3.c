//3 wap to create function deposite ,withdrawl returning bal.
#include<stdio.h>
#include<conio.h>
int main()
{
	int actno,amount;
	int bal=1000;
	printf("Enter actno:");
	scanf("%d",&actno);
	printf("Enter deposit:");
	scanf("%d",&amount);
	//calling the function deposit
	bal=deposit(actno,amount,bal);
	//calling the function withdrawal
	bal=withdrawal(actno,amount,bal);
	//callimg the function showbalance
	showbalance(actno,bal);
}
void deposit(int actno,int amount,int bal)
{
	if(amount>0)
	{
		bal=bal+amount;
		printf("\n account no:%d",actno);
		printf("\n amount deposit,balance amount:%d",bal);
	}
	else
	{
		printf("\n no amount should be gretaer then 0.");
		
	}
}
void withdrawal(int actno,int amount,int bal)
{
	if(amount<=bal)
	{
	bal=bal-amount;
	printf("\n account no:%d",actno);
	printf("\n amount withdrawal,balance amount;%d",bal);
}
else
{

printf("\n no amount due to insuffient");
}
return bal;
}
void showbalance(int actno,int bal)
{
	printf("\n account no:%d",actno);
	printf("\n balance amount:%d",bal);
}

