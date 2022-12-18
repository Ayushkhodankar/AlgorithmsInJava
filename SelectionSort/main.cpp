#include <iostream>

using namespace std;

int main()
{
    int num[]= {4,5,8,78,12,41,63};
    int i,j,t,n;

    cout<<"Array before Selection Sort"<<endl;
    for(i=0; i<7; i++)
    {
        cout<<num[i]<<" ";
    }

    for(i=0; i<6; i++)
    {
        n=i;
        for(j=i+1; j<7; j++)
        {
            if(num[j]<num[n])
            {
                n=j;
            }
        }
        if(num[i]>num[n])
        {
            t=num[i];
            num[i]=num[n];
            num[n]=t;
        }
    }

    cout<<"\n\nArray after Selection Sort\n";
    for(i=0; i<7; i++)
    {
        cout<<num[i]<<" ";
    }
    return 0;
}
