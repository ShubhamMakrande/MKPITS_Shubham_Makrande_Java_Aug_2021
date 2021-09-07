//7-Write a C program to find the eligibility of admission for a professional course based on the following criteria: Go to the editor
#include<stdio.h>
#include<conio.h>
int main()
{
	int maths,phy,chem;
	printf("Enter the marks:");
	scanf("%d%d%d",&maths,&phy,&chem);
	if(maths>=65 && phy>=55 && chem>=50 &&(maths+phy+chem)>=190)
	printf("\n candiate is eligible for a addmission.");
	else if(maths+phy>=140)
	 printf("\n eligible to criteria.");
	 else
	 printf("\n not elegible to criteria");
}

