#include <iostream>
#include <string>

using namespace std;

int main() {
int age;
string name;

cout << "나이 입력 : ";
cin >> age;
cin.ignore();

cout << "이름 입력 : ";
getline(cin, name);

cout << name << "(" << age << "세)" << endl;
  return 0;
}