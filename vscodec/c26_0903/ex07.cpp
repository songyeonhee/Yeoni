#include <iostream>
#include <string>

using namespace std;

int main() {
  int age;
  string name;

  cout << "나이 : ";
  cin >> age;
  cin.ignore(); // 버퍼비우기

  cout << "이름 (공백 가능) : ";
  getline(cin, name); // 한 줄 입력

  cout << name << "(" << age << "세)" << endl;
  return 0;
}