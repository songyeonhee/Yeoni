#include <stdio.h>

int main()
{
  int arr[5];
  int max, min;

  printf("숫자 5개를 입력하세요 > ");
  for (int i = 0; i < 5; i++)
  {
    scanf("%d", &arr[i]);
  }

  max = arr[0];
  min = arr[0];

  for (int i = 1; i < 5; i++)
  {
    if (arr[i] > max)
    {
      max = arr[i];
    }

    if (arr[i] < min)
    {
      min = arr[i];
    }
  }

  printf("최댓값: %d\n", max);
  printf("최솟값: %d\n", min);

  return 0;
}