#include <stdio.h>
#define MAXN 10000
void MaxSubseqSum2 ( int A[], int N ); 
int main(void) {
	int K, i;
	int a[MAXN] = {0};
	
	scanf("%d", &K);
	for ( i = 0; i < K; i++ )
		scanf("%d", &a[i]);
	MaxSubseqSum2 ( a, K );
	
	return 0;
}
 
void MaxSubseqSum2 ( int A[], int N ) {
	int ThisSum, MaxSum = -1;
	int i, j, start, stop;
	
	for ( i = 0; i < N; i++ ) {    //i是子列的左端。
		ThisSum = 0;    
		for ( j = i; j < N; j++ ) {    //j是子列的右端。
			ThisSum += A[j];    //i相同，j不同时，每算一个子列只要再多添一项就够了。
			if ( ThisSum > MaxSum ) {    //若发现当前子列更大，更新它。
				MaxSum = ThisSum;
				start = A[i];    //标记子列从哪个数开始。
				stop = A[j];    //标记子列从哪个数结束。
			}
		}
	}
	if ( MaxSum < 0 )	printf("%d %d %d\n", 0, A[0], A[N-1]);    //全是负数的情况。
	else	printf("%d %d %d\n", MaxSum, start, stop);
}

