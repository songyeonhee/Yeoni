#include <stdio.h>
#include <string.h>

struct Student
{
  char name[20];
  int age;
  int score;
};

// 구조체 초기화
int main()
{
  struct Student s1 = {"홍길동", 20, 85};
  struct Student *p = &s1;

  // 구조체 포인터를 이용해서 접근하려면 ->를 사용
  printf("이름 : %s\n", p->name);
  printf("나이 : %d세\n", p->age);
  printf("점수 : %d점\n", p->score);

  // 또는
  // 간접 참조, 잘 사용하지 않음
  printf("이름 : %s\n", (*p).name);
  printf("나이 : %d세\n", (*p).age);
  printf("점수 : %d점\n", (*p).score);

  return 0;
}