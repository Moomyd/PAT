/*坏掉的键保存在字符串bad中，应该输入的文字保存在should中，遍历整个应该输入的字符串，因为坏键以大写给出，所以如果在bad里面找到了should[i]的大写，表示这个字符对应的键坏了，则跳过这个字符不输出，continue跳过～如果should[i]是大写并且在bad中找到了’+’，表示上档键坏了，大写无法输出，所以这个字符也不能输出，continue跳过～如果都没跳过，则要输出should[i]～*/
#include <iostream>
#include <cctype>
using namespace std;
int main() {
  string bad, should;
  getline(cin, bad);
  getline(cin, should);
  for (int i = 0, length = should.length(); i < length; i++) {
    if (bad.find(toupper(should[i])) != string::npos) continue;
    if (isupper(should[i]) && bad.find('+') != string::npos) continue;
    cout << should[i];
  }
  return 0;
}
