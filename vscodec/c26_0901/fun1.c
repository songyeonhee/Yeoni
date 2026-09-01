#include <stdio.h>

// 함수 선언
// int add(int a, int b);

// 함수 정의
int add(int a, int b)
{
  return a + b;
};

int main()
{
  int result = add(10, 20);
  printf("합 : %d\n", result);
  return 0;
}
