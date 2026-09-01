#include <stdio.h>
int main()
{
  int arr[5] = {1, 2, 3, 4, 5};
  int *p = arr;
  int i;

  // 배열 인덱스로 접근
  for (i = 0; i < 5; i++)
  {
    printf("%d", arr[i]);
  }
  printf("\n");

  // 포인터로 접근
  for (i = 0; i < 5; i++)
  {
    printf("%d", *(p + i));
  }
  printf("\n");

  return 0;
}