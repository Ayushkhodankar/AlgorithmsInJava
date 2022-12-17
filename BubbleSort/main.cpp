#include <iostream>

using namespace std;

int main()
{
   int num[]= {7,15,78,4,19,45,99};
    int i,j,n;

    cout<<"Array before Bubble Sort"<<endl;
    for(i=0; i<7; i++)
    {
        cout<<num[i]<<" ";
    }

    for(i=0; i<6; i++)
    {
        for(j=0; j<6-i; j++)
        {
            if(num[j]>num[j+1])
            {
                n=num[j];
                num[j]=num[j+1];
                num[j+1]=n;
            }
        }
    }
    cout<<"\n\nArray after Bubble Sort\n";
    for(i=0; i<7; i++)
    {
        cout<<num[i]<<" ";
    }
    return 0;
}
