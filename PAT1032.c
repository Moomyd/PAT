
#include<stdio.h>
/*
 *思路：
 *由题意可知学校不超过10^5个;
 *因为 学校编号从1开始编号;
 *所以 定义一个10^5+1大的数组;
 *数组下表代表学校编号,数组的值代表学校的总分;
 *目的:求出总分最大的学校编号及其分数;
 */
int main(){
	int a[100001]={0};
	int n,x,y;
	int max=0;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d %d",&x,&y);
		a[x]+=y;
		if(a[x]>a[max])
			max=x;
	}
	printf("%d %d",max,a[max]);
	return 0;
}
