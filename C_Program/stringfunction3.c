//15 strcmp 
//wap to compare two string
#include<stdio.h>
#include<conio.h>
int main()
{
	char firstname[30];
	char lastname[30];
	 printf("Enter firstname:");
	 gets(firstname);
	 printf("Enter lastname:");
	 gets(lastname);
	 if(strcmp(firstname,lastname)==0)
	 {
	 	printf("\n both  string are same.");
	 	}
	 	else{
	 		printf("\n both are string not same.");
		 }
	 
}

