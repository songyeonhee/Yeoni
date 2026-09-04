#include <stdio.h>

int main()
{
  int arr[10];
  float avg;
  int sum = 0;
  int count = 0;

  printf("0~100까지의 숫자 10개를 입력하세요 > ");
  for (int i = 0; i < 10; i++)
  {
    scanf("%d", &arr[i]);
    sum += arr[i];
  }

  avg = (float)sum / 10;

  for (int i = 0; i < 10; i++)
  {
    if (arr[i] >= avg)
    {
      count++;
    }
  }

  printf("평균: %.2f\n", avg);
  printf("평균 이상인 값의 개수: %d", count);

  return 0;
}