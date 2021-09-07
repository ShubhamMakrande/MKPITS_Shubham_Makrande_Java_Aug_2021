//bill
//10 -Write a program in C to calculate and print the Electricity bill of a given customer. The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer. The charge are as follow : Go to the editor
//Unit 	Charge/unit
//upto 199 	@1.20
//200 and above but less than 400 	@1.50
//400 and above but less than 600 	@1.80
//600 and above 	@2.00
//
//If bill exceeds Rs. 400 then a surcharge of 15% will be charged ,
// minimum bill should be of Rs. 100/-
#include<stdio.h>
#include<conio.h>
int main()
{
	int customer_id,unit;
	float amountcharge,surchargeamount,netamount;
	char name[10];
	printf("Enter customer_id:");
	scanf("%d",&customer_id);
	printf("Enter customer name:");
	scanf("%s",&name);
	printf("Enter unit consumed by customer:");
	scanf("%d",&unit);
	if(unit<=199)
	   {
		amountcharge=unit*1.20f;
	   }
	else if(unit>=200 && unit<400)
     	{
		amountcharge=unit*1.50f;
    	}
    		else if(unit>=400 && unit<600)
    		{
    			amountcharge=unit*1.80f;
			}
	else if(unit>600)
	   {
		amountcharge=unit*2.00f;
     	}
	else
    	{
		printf("\ninvalid unit");
	   }
	if(amountcharge<=100)
	   {
		amountcharge=100.0f;
     	}
	printf("\n amountcharge=%f",amountcharge);
	if(amountcharge>=400)
 	{
		surchargeamount=(float)(15/100.0f)*amountcharge;
		printf("\n surchargeamount=%f",surchargeamount);
		
  	}
	netamount=amountcharge+surchargeamount;
	printf("\n netamount paid by the customer=%f",netamount);
	return 0;
}
