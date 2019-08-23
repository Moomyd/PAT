#include<stdio.h>
#include<string.h>
int main(){
	int n,min=0,max=0;
	scanf("%d",&n);
	char c[100],s[100],t[100];
	for(int i;i<n;i++){
		scanf("%s",c);
		int h1, m1, s1, h2, m2, s2;
                scanf("%d:%d:%d %d:%d:%d", &h1, &m1, &s1, &h2, &m2, &s2);
		int signin=h1*3600+m1*60+s1;
		int signout=h2*3600+m2*60+s2;
		if(signin<min){
			min=signin;
			strcpy(s,c);
		}
		if(signout>max){
			max=signout;
			strcpy(t,c);
		}
	}
	printf("%s,%s",s,t);
	return 0;
}
