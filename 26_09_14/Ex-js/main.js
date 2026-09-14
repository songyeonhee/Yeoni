// #6
let score = 85;
result = score >= 60 ? "합격" : "불합격";
console.log(result);

// #8
let sum = 0;
for (i = 1; i <= 100; i++) {
  sum += i;
}

console.log(sum);

// #9
nums = [1, 2, 3, 4, 5, 6];
result = nums.filter((num) => num % 2 === 0);
console.log(result);

// #10
nums = [1, 2, 3];
result = nums.map((num) => num * 2);
console.log(result);

// #12
const add = (a, b) => a + b;
console.log(add(3, 4));

// #13
users = [
  { id: 1, name: "홍길동" },
  { id: 2, name: "김철수" },
];

result = users.find((user) => user.id === 2);
console.log(result);

// #19
btn = document.getElementById("btn");
msg = document.getElementById("msg");

btn.addEventListener("click", () => (msg.innerHTML = "클릭됨"));

// #20
name = document.getElementById("name").value.trim();
