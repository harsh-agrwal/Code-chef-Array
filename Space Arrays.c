#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	long t;
	cin>>t;
	while(t--)
	{
	    long n,ans=0;
	    cin>>n;
	    long a[n],p[n];
	    for(long i=0;i<n;i++)
	    {
	        cin>>a[i];
	        p[i]=i+1;
	    }
	    sort(a,a+n);
	    for(long i=n-1;i>=0;i--)
	    {
	        if(p[i]-a[i]<0)//a[i]>p[i]
	        {
	            ans=0;
	            break;
	        }
	        ans+=p[i]-a[i];
	    }
	    if(ans%2!=0)
	        cout<<"First"<<endl;
	    else
	        cout<<"Second"<<endl;
	   
	}
	return 0;
}
