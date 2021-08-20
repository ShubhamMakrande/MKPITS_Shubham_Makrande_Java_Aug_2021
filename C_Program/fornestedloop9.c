//9- 
//	1	
//	1	3
//	1	3	5

#include<stdio.h>
#include<conio.h>
int main()
{
	int row,col;
	for(row=1;row<=5;row++)
	{
		for(col=1;col<=row;col++)
		{
			if(col%2!=0)
			printf("\t%d",col);
		}
		printf("\n");
	}
	
}
