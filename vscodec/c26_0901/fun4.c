#include <stdio.h>

void changeValue(int x)
{
  x = 100;
  printf("함수 내부 : %d\n", x);
}

int main()
{
  int num = 10;
  changeValue(num);
  printf("함수 호출 후 : %d\n", num);
  return 0;
}