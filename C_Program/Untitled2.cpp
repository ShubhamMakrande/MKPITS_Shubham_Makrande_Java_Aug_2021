#include<stdio.h>
#include<conio.h>
int main()
{
	int n,i,a,b,c;
	printf("\n Enter the number:");
	scanf("%d",&n);
	a=0;
	b=1;
	for(i=1;i<=n;i++)
	{
		printf(" %d ",a);
		c=a+b;
		a=b;
		b=c;
	}
	return 0;
}
