//Asignment.
//7 - wap to accept length, breadth and height and then print volume .
#include<stdio.h>
#include<conio.h>
int main()
{
	int volume,length,breath,heigth;
	printf("Enter lenght,breath and heigth");
	scanf("%d%d%d",&length,&breath,&heigth);
	volume=length*breath*heigth;
	printf("\n volume=%d",volume);
}
