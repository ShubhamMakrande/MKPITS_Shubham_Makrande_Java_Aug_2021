//7 - wap to accept a no. and print table of that no. using for loop.
#include<stdio.h>
#include<conio.h>
int main() {
 int num,result,i;
 printf("entern number");
 scanf("%d",&num); //5
 for(i=1;i<=10;i++)
 {
 	result=num * i;
 	printf("\n%d * %d = %d",num,i,result);
 }
 
     
}

