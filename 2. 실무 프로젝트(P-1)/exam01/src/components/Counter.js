import { useState, useRef } from 'react';

const Counter = () => {
  let num = useRef(10);
  console.log('렌더링!', 'num', num);
  const [number, setNumber] =
    useState(0); /*number는 상태값 setNumber는 상태값을 바꿀 수 있는 함수 */

  const plus = () => {
    num.current++; // 11
    setNumber(number + 1);
  };
  const minus = () => {
    num.current--; // 9
    setNumber(number - 1);
  };

  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={plus}>
        +1
      </button>
      <button type="button" onClick={minus}>
        -1
      </button>
    </>
  );
};

export default Counter;
