#include<stdio.h>
#include<string.h>
int main()
{
    int n;
	char str[15];
    scanf("%d",&n);
    n=n+1;
    while(n--)
    {

        gets(str);
        int i;
        for(i=0;i<15;i++)
        {
            if(str[i]=='T')
            {
                printf("%d",str[i-2]-'A'+1);
                break;
            }
        }
    }
    return 0;
}
