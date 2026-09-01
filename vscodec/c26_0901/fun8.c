#include <stdio.h>

int global = 100; // 전역 변수

void func1()
{
  global = 200;
  printf("func1 : %d\n", global);
}

void func2()
{
  printf("func2 : %d\n", global);
}

int main()
{
  printf("main : %d\n", global); // 100
  func1(); // 200
  func2(); // 200
  printf("main : %d\n", global); // 200
  return 0;
}