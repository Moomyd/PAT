#include<stdio.h>
#include<string.h>

int main(){
    char a[100001];
    gets(a);
    int p=0,pa=0,pat=0;
    for(int i=0;i<strlen(a);i++){
//想要求有几个pat，就要求前面有几个pa。想要求有几个pa，就要求前面有几个p
        if(a[i]=='P')p++;
        else if(a[i]=='A'){
            pa+=p;
            pa%=1000000007;
        }
        else if(a[i]=='T'){
            pat+=pa;
            pat%=1000000007;
        }
    }
    printf("%d",pat);
    return 0;
}
