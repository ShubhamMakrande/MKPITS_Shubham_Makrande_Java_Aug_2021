//5 - create a structure book and create 2 structure variable b1 and b2
// create a structure book with members bookid, title, author and price.
#include<stdio.h>
#include<conio.h>
struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
	
}b1,b2;

int main()
{
	struct book b1;
	b1.bookid=222;
	strcpy(b1.title,"shershaan");
	strcpy(b1.author,"vikram");
	b1.price=129.0f;
	
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
	printf("\n price=%f",b1.price);
	
	printf("\n book 2 details:");
	struct book b2;
	b2.bookid=333;
	strcpy(b2.title,"shershaan2");
	strcpy(b2.author,"vikram2");
	b2.price=130.0f;
	
	printf("\n bookid=%d",b2.bookid);
	printf("\n title=%s",b2.title);
	printf("\n author=%s",b2.author);
	printf("\n price=%f",b2.price);
	
}
