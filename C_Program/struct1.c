//1- create a structure book with members bookid, title, author and price.
#include<stdio.h>
#include<conio.h>
struct book
{
	int bookid;
	char title[10];
	char author[10];
	float price;
};
int main()
{ 	//creating a structure variable
	struct book b1;// b1 is structure variable
     //assigning value to structure members
    b1.bookid=123;
    strcpy(b1.title,"orcale");
    strcpy(b1.author,"bill");
    b1.price=122.2f;
    //displaying the values stored in structure.
    printf("\n bookid=%d",b1.bookid);
    printf("\n title=%s",b1.title);
    printf("\n author=%s",b1.author);
    printf("\n price=%f",b1.price);
	
}
