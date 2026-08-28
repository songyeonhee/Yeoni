#include <stdio.h>

int main()
{
  int age = 20;
  int score = 85;

  printf("나이가 18세 이상면서 점수가 60점 이상 : %d\n", (age >= 18) && (score >= 60));
  printf("나이가 65세 이상이거나 점수가 90점 이상 : %d\n", (age >= 65) || (score >= 90));

  return 0;
}