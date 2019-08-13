#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct
{
    char ID[21];
    int Gp,Gm,Gf,G;
}Stu;
int cmpID(const void * a,const void * b)
{   return strcmp( (*(Stu *)a).ID , (*(Stu *)b).ID );   }
int cmpG(const void * a,const void * b)
{
    if( (*(Stu *)a).G != (*(Stu *)b).G )
        return (*(Stu *)b).G-(*(Stu *)a).G;
    else return strcmp( (*(Stu *)a).ID , (*(Stu *)b).ID );
}
int main()
{
    int P,M,N,cnt=0,score,G,nP=0;
    char ID[21];
    scanf("%d %d %d",&P,&M,&N);
    Stu A[P],Pass[P],*p;
    for(int i=0 ; i<P ; i++)
    {
        scanf("%s %d",A[cnt].ID,&A[cnt].Gp);
        if( A[cnt].Gp >= 200 )
        {
            A[cnt].Gm=A[cnt].Gf=A[cnt].G=-1;
            cnt++;
        }
    }
    qsort(A,cnt,sizeof(Stu),cmpID);
    for(int i=0 ; i<M ; i++)
    {
        scanf("%s %d",ID,&score);
        if( p = (Stu *)bsearch(ID,A,cnt,sizeof(Stu ),cmpID) )
            (*p).Gm=score;
    }
    for(int i=0 ; i<N ; i++)
    {
        scanf("%s %d",ID,&score);
        if( p = (Stu *)bsearch(ID,A,cnt,sizeof(Stu ),cmpID) )
        {
            (*p).G = ( score>=(*p).Gm ? score : ( score*0.6+(*p).Gm*0.4+0.5 ) );
            (*p).Gf = score;
            if( (*p).G>=60 )
                Pass[nP++]=*p;
        }
    }
    qsort(Pass,nP,sizeof(Stu ),cmpG);
    for(int i=0 ; i<nP ; i++)
        printf("%s %d %d %d %d\n",Pass[i].ID,Pass[i].Gp,Pass[i].Gm,Pass[i].Gf,Pass[i].G);
}
