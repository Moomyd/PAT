#include<stdio.h>

int main()
{
	const int n =54;
	char card[5] = { 'S', 'H', 'C', 'D', 'J'};
	int start[n+1], next[n+1], end[n+1];
	int k;
	scanf("%d",&k);
	for(int i=1;i<=n;i++){
		start[i] = i;
	} 
	for(int i=1;i<=n;i++){
		scanf("%d",&next[i]);
	}
	for(int i=0; i<k; i++){
		for(int j=1; j<=n; j++){
			end[next[j]] = start[j];//注意这里是start[j]而不是j,因为，不止一轮操作 
		}
		for(int i=1;i<=n;i++){
		start[i] = end[i];
		}
	} 
	
	for(int i=1; i<=n; i++){
		printf("%c%d", card[(start[i]-1)/13], (start[i]-1)%13+1);
		if(i<n) printf(" ");	
	}
	
	return 0;
}

