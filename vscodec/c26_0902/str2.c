#include <stdio.h>
#include <string.h>

struct Student
{
  char name[20];
  int age;
  int score;
};

// 구조체 초기화
// int main()
// {
//   struct Student s1 = {"홍길동", 20, 85};

//   printf("이름 : %s\n", s1.name);
//   printf("나이 : %d세\n", s1.age);
//   printf("점수 : %d점\n", s1.score);

//   return 0;
// }

// 구조체 배열에서 검색
int main()
{
  struct Student students[3] =
      {
          {"홍길동", 20, 85},
          {"김철수", 22, 95},
          {"이영희", 21, 75}};

  char search[20];
  int i, found = 0;
  printf("검색할 이름 : ");
  scanf("%s", search);

  for (i = 0; i < 3; i++)
  {
    if (strcmp(students[i].name, search) == 0)
    // C언어에서는 students[i].name == search 형식으로 비교하면 안됨
    // strcmp(문자열1, 문자열2)
    {
      printf("찾았습니다!\n");
      printf("나이 : %d | 점수 : %d\n",
             students[i].age, students[i].score);
      found = 1;
      break;
    }
  }

  if (!found)
  {
    printf("찾을 수 없습니다.");
  }
}