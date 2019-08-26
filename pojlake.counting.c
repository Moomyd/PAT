#include<stdio.h>
char w[101][101];
int m,n;
void dfs(int x,int y)
{
    int dx,dy,nx,ny;
    w[x][y]='.';
    for(dx=-1;dx<=1;dx++)
        for(dy=-1;dy<=1;dy++)
        {
            nx=x+dx;
            ny=y+dy;
            if(nx>=0&&nx<m&&ny>=0&&ny<n+1&&w[nx][ny]=='W')
                dfs(nx,ny);
        }
    return;
}
int main()
{
    int i,j,res=0;
    scanf("%d%d",&m,&n);
    for(i=0;i<m;i++)
        for(j=0;j<n+1;j++)
            scanf("%c",&w[i][j]);
    for(i=0;i<m;i++)
        for(j=0;j<n+1;j++)
            if(w[i][j]=='W')
            {
                dfs(i,j);
                res++;  
            }
    printf("%d\n",res);
}

