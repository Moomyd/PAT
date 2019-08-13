#include<stdio.h>
#include<string.h>

typedef struct student{
    int grade;
    char Tnumb[14];
}Student;

typedef struct eroom{
    int Pamou;
    int Tgrade;
}Eroom;

int main()
{
    int N, M;
    scanf("%d %d", &N, &M);
    Student S[N];
    Eroom E[1000];
    for(int i = 101; i < 1000; i++){      //结构体初始化
        E[i].Pamou = 0;
        E[i].Tgrade = 0;
    }
    for(int i = 0; i < N; i++){
        char str[14];
        int gra, En;
        scanf("%s %d", str, &gra);
        strcpy(S[i].Tnumb, str);
        S[i].grade = gra;
        En = (S[i].Tnumb[1] - '0') * 100 + (S[i].Tnumb[2] - '0') * 10 + (S[i].Tnumb[3] - '0');
        E[En].Pamou += 1;
        E[En].Tgrade += gra;
    }

    for(int i = 0; i < M; i++){
        int type = 0, flag = 0;
        scanf("%d", &type);
        if(type == 1){                  //类型１
            char level;
            Student S2[N];
            int cnt = 0;
            scanf(" %c", &level);
            for(int j = 0; j < N; j++){
                if(S[j].Tnumb[0] == level){
                    strcpy(S2[cnt].Tnumb, S[j].Tnumb);       //得到符合条件的学生数据
                    S2[cnt].grade = S[j].grade;
                    cnt++;
                    flag = 1;
                }
            }
            Student temp;
            for(int p = 0; p < cnt; p++){       //排序
                for(int q = p; q < cnt; q++){
                    if((S2[p].grade < S2[q].grade)||(S2[p].grade == S2[q].grade && S2[p].Tnumb < S2[q].Tnumb)){
                        //temp = S2[p];
                        strcpy(temp.Tnumb, S2[p].Tnumb);
                        temp.grade = S2[p].grade;
                        //S2[p] = S2[q];
                        strcpy(S2[p].Tnumb, S2[q].Tnumb);
                        S2[p].grade = S2[q].grade;
                        //S2[q] = temp;
                        strcpy(S2[q].Tnumb, temp.Tnumb);
                        S2[q].grade = temp.grade;
                    }
                }
            }
            printf("Case %d: %d %c\n", i+1, type, level);
            if(flag == 0){
                printf("NA\n");
            }
            else{
                for(int k = 0; k < cnt; k++){
                    printf("%s %d\n", S2[k].Tnumb, S2[k].grade);
                }
            }
        }
        else if(type == 2){             //类型２
            int Enumb;
            scanf("%d", &Enumb);
            printf("Case %d: %d %03d\n", i+1, type, Enumb);
            if(E[Enumb].Pamou == 0){
                printf("NA\n");
            }
            else{
                printf("%d %d\n", E[Enumb].Pamou, E[Enumb].Tgrade);
            }
        }
        else if(type == 3){             //类型３
            int data;
            scanf("%d", &data);
            Eroom E2[1000];
            for(int j = 101; j < 1000; j++){      //结构体初始化
                E2[j].Pamou = 0;
                E2[j].Tgrade = 0;
            }
            int dat2,cnt2 = 0,en, flag3 = 0;
            for(int j = 0; j < N; j++){
                dat2 = (S[j].Tnumb[4] - '0') * 100000 + (S[j].Tnumb[5] - '0') * 10000 + (S[j].Tnumb[6] - '0')* 1000 + (S[j].Tnumb[7] - '0') * 100+ (S[j].Tnumb[8] - '0') * 10 + (S[j].Tnumb[9] - '0');
                if(data == dat2){
                    en = (S[j].Tnumb[1] - '0') * 100 + (S[j].Tnumb[2] - '0') * 10 + (S[j].Tnumb[3] - '0');
                    E2[en].Pamou++;
                    flag3 = 1;      //flag用来表示查询是否为空
                }
            }
            printf("Case %d: %d %d\n", i+1, type, data);
            if(flag3 == 0){
                printf("NA\n");
            }
            else{
                for(int k = N; k > 0; k--){
                    for(int j = 101; j < 1000; j++){
                        if(E2[j].Pamou == k){
                            printf("%d %d\n", j, k);
                        }
                    }
                }
            }
        }
    }
    return 0;
}