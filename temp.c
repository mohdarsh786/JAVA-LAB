#include<stdio.h>
#include<stdlib.h>
#define MAX 15
void main()
{
    int n,i,arr[MAX],temp;
    printf("size of array:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if (arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
    }
    printf("Sorted arrayy: ");
    for(int i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
