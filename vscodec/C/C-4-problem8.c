#include <stdio.h>

int main()
{
  int arr[8];
  int evenCount = 0;
  int oddCount = 0;

  printf("-100~100까지의 정수 8개를 입력하세요 > ");

  for (int i = 0; i < 8; i++)
  {
    scanf("%d", &arr[i]);
  }

  printf("짝수:");
  for (int i = 0; i < 8; i++)
  {
    if (arr[i] % 2 == 0)
    {
      printf(" %d", arr[i]);
      evenCount++;
    }
  }
  if (evenCount == 0)
  {
    printf("없음");
  }

  printf("\n홀수:");

  for (int i = 0; i < 8; i++)
  {
    if (arr[i] % 2 != 0)
    {
      printf(" %d", arr[i]);
      oddCount++;
    }
  }
  if (oddCount == 0)
  {
    printf("없음");
  }

  return 0;
}