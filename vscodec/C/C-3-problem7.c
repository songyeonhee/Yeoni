#include <stdio.h>
#include <string.h>

int main()
{
  char str[101];
  char ch;
  int count;

  printf("문자 입력 (공백 입력 가능) > ");
  fgets(str, sizeof(str), stdin);
  printf("찾을 문자 1개 입력 > ");
  scanf("%c", &ch);

  for (int i = 0; i < strlen(str); i++)
  {
    if (str[i] == ch)
    {
      count++;
    }
  }

  printf("%c가 나타나는 횟수: %d", ch, count);
  return 0;
}