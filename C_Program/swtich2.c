//2- wap to accept 2 no. and operator like +,- , * and then display the result using switch.
#include<stdio.h>
#include<conio.h>
int main()
{
	int num1,num2,result=0;
	char op;
	printf("Enter the 2 no:");
	scanf("%d%d",&num1,&num2);
	printf(" Enter +,- , *");
	fflush(stdin);
	scanf("%c",&op);
	switch(op) {
		case '+' :
			result=num1+num2;
			break;
		case '-' :
			result=num1-num2;
			break;
		case '*' :
			result=num1*num2;
			break;
		case '/' :
			result=num1/num2;
			break;
        default:
        	printf("\n not valid op");
        	break;
        }
        printf("\n result=%d",result);
        return 0;
        
	
}
