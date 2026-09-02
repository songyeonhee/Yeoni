#include <stdio.h>
#include <string.h>

struct Student
{
  char name[20];
  int age;
  int score;
};

int main()
{
  struct Student s1;
  strcpy(s1.name, "홍길동"); // name 문자열로 직접 대입 불가
  s1.age = 20;
  s1.score = 85;

  printf("이름 : %s\n", s1.name);
  printf("나이 : %d세\n", s1.age);
  printf("점수 : %d점\n", s1.score);

  return 0;
}