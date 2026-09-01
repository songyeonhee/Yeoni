#include <stdio.h>

int main()
{
  int a = 10;

  printf("초기 값 : %d\n", a); // 10
  printf("a++ : %d\n", a++);   // 10, 출력 후 증가
  printf("현재 값 : %d\n", a); // 11
  printf("++a : %d\n", ++a);   // 12, 출력 후 증가
  printf("현재 값 : %d\n", a); // 12

  return 0;
}