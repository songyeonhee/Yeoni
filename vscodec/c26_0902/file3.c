#include <stdio.h>

int main()
{
  FILE *fp = fopen("data.txt", "w");
  int i;

  if (fp == NULL)
  {
    printf("파일을 열 수 없습니다.\n");
    return 1;
  }

  fprintf(fp, "Hello File\n");
  fprintf(fp, "안녕하세요 파일입니다.\n");

  for (i = 1; i <= 10; i++)
  {
    fprintf(fp, "%d\n", i);
  }

  fclose(fp);

  printf("숫자 파일 저장 완료!\n");
  return 0;
}