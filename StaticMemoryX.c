#include<stdio.h>
int main()
{
    // Static memory allocation
    float Marks[5];              // 20 bytes

    printf("Enter your Marks : \n");

    //Sequence
    scanf("%f",&Marks[0]);
    scanf("%f",&Marks[1]);
    scanf("%f",&Marks[2]);
    scanf("%f",&Marks[3]);
    scanf("%f",&Marks[4]);

    printf("Entered Marks are : \n");

    printf("%f",Marks[0]"\n");
    printf("%f",Marks[1]"\n");
    printf("%f",Marks[2]"\n");
    printf("%f",Marks[3]"\n");
    printf("%f",Marks[4]"\n");

    return 0;
}

