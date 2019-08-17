#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int main(){
    double a[3][4];
    int b[3];
    char c[3]={"WTL"};
    int i ,j;
    for(i= 0 ; i < 3 ;i++){
        scanf("%lf %lf %lf",&a[i][0],&a[i][1],&a[i][2]);
    }
    for(i= 0 ; i < 3 ;i++){
        a[i][3] = a[i][0];
        b[i]=0;
        for(j = 0 ; j < 3 ; j++){
            if(a[i][3] < a[i][j]){
                a[i][3] = a[i][j];
                b[i] = j;
            }
        }
    }
    for(i = 0 ; i < 3 ; i++){
        printf("%c " ,c[b[i]]);
    }
    double rs = (((a[0][3] * a[1][3] * a[2][3] * 65.00/100.00 -1.0) * 2.0) * 100)/100.00;
    
    printf("%.2f" ,rs);
    
    return 0;
}

