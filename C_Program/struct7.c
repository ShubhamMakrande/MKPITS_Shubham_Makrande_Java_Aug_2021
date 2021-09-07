//7 - create a structure product  and accept values from the user
#include<stdio.h>
#include<conio.h>
struct product
{
	int proid;
	char proname[20];
	float price;
};
int main()
{
	struct product p1;
	printf("enter proid:");
	scanf("%d",&p1.proid);
	printf("enter proname:");
	scanf("%s",&p1.proname);
	printf("enter price:");
	scanf("%f",&p1.price);
	printf("\n----------------------product details---------------------");
	printf("\n proid=%d",p1.proid);
	printf("\n proname=%s",p1.proname);
	printf("\n price=%f",p1.price);
	 
}
