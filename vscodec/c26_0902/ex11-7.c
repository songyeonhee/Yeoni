#include <stdio.h>

struct Student
{
  char name[20];
  int age;
  int score;
};

int main()
{
  struct Student student;

  printf("이름 나이 점수 입력 : ");
  scanf("%s %d %d", student.name, &student.age, &student.score);

  printf("이름 : %s | 나이 : %d세 | 점수 : %d점", student.name, student.age, student.score);

  return 0;
}
