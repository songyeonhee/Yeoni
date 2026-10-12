import { createSlice } from "@reduxjs/toolkit";

// 리덕스 설치
// npm install @reduxjs/toolkit react-redux

// 카운터의 초기 값 0 -> 전역 상태 초기 값

const initialState = { value: 0 };
// createSlice : 리덕스의 핵심 3가지(상태 + 액션 + 리듀서)를 한 번에 만드는 도구
// name : 상태의 이름(구분), state : 데이터, reducers : 상태 변경 로직

export const counterSlice = createSlice({
  name: "counter",
  initialState,
  reducers: {
    increment: (state) => {
      state.value += 1;
    },
    decrement: (state) => {
      state.value -= 1;
    },
    reset: (state) => {
      state.value = 0;
    },
  },
});

export const { increment, decrement, reset } = counterSlice.actions;
// dispatch{increment} : 버튼 클릭 시 사용할 명령어

export default counterSlice.reducer;
// store에 등록할 상태 관리 함수

// 버튼 클릭 > dispatch{increment} > reducers 실행 > state.value +1 > 화면에 업데이트
