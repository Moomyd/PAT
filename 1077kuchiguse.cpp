#include<iostream>
#include<algorithm>
using namespace std;

string input[265];

int main(){
	int N;
	while(cin>>N){
		cin.get();
		for(int i=0;i<N;i++){
			getline(cin,input[i]);
			reverse(input[i].begin(),input[i].end());
		}
		string suffix;
		for(int i=0;i<input[0].size();i++){
			char c = input[0][i];
			bool isequal = true;
			for(int j=1;j<N;j++){
				if(input[j][i]!=c){
					isequal = false;
					break;
				}
			}
			if(isequal) suffix+=c;
			else break;
		}
		if(suffix.empty()) cout<<"nai"<<endl;
		else{
			reverse(suffix.begin(),suffix.end());
			cout<<suffix<<endl;
		}
	}
	return 0;
}

