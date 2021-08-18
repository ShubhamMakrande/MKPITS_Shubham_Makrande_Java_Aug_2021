//6 - wap to accept radius of a circle and print area and circumferance of a circle.
#include<stdio.h>
#include<conio.h>
int main()
{
	int radius;
	float area,circ;
	printf("Enter tha radius");
	scanf("%d",&radius);
	area=3.14f*radius*radius;
	circ=2*3.14f*radius;
	printf(" \nthe area of the circle=%f",area);
	printf("\nthe circumfreance of circle=%f",circ);

}
