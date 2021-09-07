//3- accepting string from the user without & operator
#include<stdio.h>
#include<conio.h>
int main()
{
	char ch[10];
	int cnt=0;
	int i=0;
	printf("Enter a string:");
	scanf("%s",&ch);
	while(i<10)
	{
		if(ch[i]=='a' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u')
		{
			cnt=cnt+1;
		}
		i++;
	}
	printf("\n no.vowelin string=%d",cnt);
}
