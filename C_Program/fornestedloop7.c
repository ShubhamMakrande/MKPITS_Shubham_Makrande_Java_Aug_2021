//assignment
//7 - assignment 
//wap    
//		* 	*	*	*	
//		*	*	*
//		*	*
//		*
#include<stdio.h>
#include<conio.h>
int main()
{
	int row,col;
	for(row=4;row>0;row--)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t *");
		}
		printf("\n");
	}
}

