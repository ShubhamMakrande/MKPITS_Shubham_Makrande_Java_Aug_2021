//4- create a structure product with productid,productname,productprice.
#include<stdio.h>
#include<conio.h>
struct product
{
	int productid;
	char productname[20];
	float productprice;
};
int main()
{
	struct product p1;
	p1.productid=222;
	strcpy(p1.productname,"dairymilk");
	p1.productprice=12.0f;
	
	printf("\n productid=%d",p1.productid);
	printf("\n productname=%s",p1.productname);
	printf("\n productprice=%f",p1.productprice);
}
