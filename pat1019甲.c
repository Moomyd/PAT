#include<stdio.h>  
  
int numStr[100];  
int idx;  
  
int palindrome(int num,int radix){  
    if(num==0)  
        return 1;  
    int rem;  
    while(num){  
        rem=num%radix;  
        num/=radix;  
        numStr[idx++]=rem;  
    }  
  
    int i;  
    for(i=0;i<=idx/2;i++){  
        if(numStr[i]!=numStr[idx-1-i])  
            return 0;  
    }  
  
    return 1;  
}  
  
int main(){  
    int n,b;  
    scanf("%d%d",&n,&b);  
  
    if(n==0){  
        printf("Yes\n");  
        printf("0\n");  
        return 0;  
    }  
  
    if(palindrome(n,b))  
        printf("Yes\n");  
    else  
        printf("No\n");  
  
    int i;  
    for(i=idx-1;i>=0;i--){  
        printf("%d",numStr[i]);  
        if(i)  
            printf(" ");  
  
    }  
    printf("\n");  
  
  
    return 0;  
}  
