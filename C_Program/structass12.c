//passing aary
//12 - create a structure array of 5 elements of structure book .
#include<stdio.h>
#include<conio.h>
struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
};
void display(struct book b1);
int main()
{
	struct book b1[5];
	int i;
	i=0;
	while(i<5)
	{
	
		printf("enter bookid:");
		scanf("%d",&b1[i].bookid);
		printf("enter titel:");
		scanf("%s",&b1[i].title);
		printf("enter author:");
		scanf("%s",&b1[i].author);
		printf("enter price");
		scanf("%f",&b1[i].price);
		display(b1[i]);
		printf("\n book[%d] details",i+1);
		i++;
	
	}
}
void display(struct book b1)
{
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
	printf("\n price=%f",b1.price);
}
