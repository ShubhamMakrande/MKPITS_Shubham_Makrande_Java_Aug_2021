//13 - create a structure array of 10 element of struture product.
#include<stdio.h>
#include<conio.h>
struct product
{
	int prodcutid;
	char productname[20];
	float productprice;
	
};
void display(struct product p1);
int main()
{
	struct product p1[10];
	int i=0;
	while(i<10)
	{
		printf("\n enter productid:");
		scanf("%d",&p1[i].prodcutid);
		printf("\nenter productname:");
		scanf("%s",&p1[i].productname);
		printf("\nenter productprice:");
		scanf("%f",&p1[i].productprice);
		fflush(stdin);
		display(p1[i]);
		printf("\n product[%d] details:",i+1);
		i++;
	}
}
void display(struct product p1)
{
	printf("\n productid=%d",p1.prodcutid);
	printf("\n productname=%d",p1.productname);
	printf("\n productprice=%f",p1.productprice);
}

