#include <stdio.h>

int main()
{
  FILE *fp = fopen("data.txt", "w");
  int num, sum = 0;

  if (fp == NULL)
  {
    printf("파일을 열 수 없습니다.\n");
    return 1;
  }

  while (fscanf(fp, "%d", &num) != EOF)
  {
    printf("%d", num);
    sum += num;
  }

  printf("\n합계 : %d\n", sum);

  fclose(fp);

  printf("숫자 파일 저장 완료!\n");
  return 0;
}