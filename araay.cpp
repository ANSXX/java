#include<stdio.h>
#include<iostream>
int main()
{
    int a[5]={2,4,6,8,10};
    for(int x : a)
    {
        printf("%d\n",x);
    }   
    return 0;
}
