//7- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) calculate and display the result.
//7- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and display the result.
#include<stdio.h>
#include<conio.h>
void calculate(int n1,int n2,char op)
{
	int result;
	switch(op)
	{
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		default:
			printf("\n invalid operator");
			break;

	}
	printf("\n result=%d",result);
}
int main()
{
	int n1,n2;
	char op;
	printf("\n Enter the 2 no:");
	scanf("%d%d",&n1,&n2);
	printf("enter operator like +,-,*");
	fflush(stdin);
	scanf("%c",&op);
	calculate(n1,n2,op);
	printf("\n Exit the main function");
	
}
