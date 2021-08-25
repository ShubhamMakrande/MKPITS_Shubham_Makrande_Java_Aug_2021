//10 - wap to create function calarea with one int parameter to accept radius
//calculate and display area and circ of circle.
#include<stdio.h>
#include<conio.h>
void calarea(int radius)
{
	float area,circ;
	area=3.14f*radius*radius;
	circ =2*3.14f*radius;
	printf("\n area=%f",area);
	printf("\n circumfrence=%f",circ);
}
int main()
{
	int radius;
	printf("\n Enter the radius of circle:");
	scanf("%d",&radius);
	calarea(radius);
	printf("\n exit the main function.");
}
