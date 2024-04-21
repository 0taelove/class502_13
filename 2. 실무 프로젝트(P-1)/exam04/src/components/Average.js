import React, { useState, useCallback, useMemo } from 'react';

function getAverage(nums) {
  // 합계 / 갯수

  const total = nums.reduce((acc, num) => { // 반환 값은 누산기에 할당 == 값이 누적되면서 연산 됨
    acc += num;

    return acc;
  }, 0);

  let avg = total / nums.length; // nums의 요소 갯수
  avg = Math.round(avg /*정수*/ * 100) / 10; // 소수점 첫째 자리까지 표기(반올림)

  return avg;
}

const Average = () => { // 렌더링 시킬 기준값
  const [nums, setNums] = useState([]);
  const [num, setNum] = useState('');

  const onChange = useCallback(
    (e) =>
      setNum(
        Number(e.currentTarget.value) !== NaN
          ? Number(e.currentTarget.value)
          : 0,
      ),
    [],
  ); // 함수형은 useCallback으로 감싸줘야 하고 e = event객체 메서드
  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      setNums((nums) => nums.concat(num));
    },
    [num],
  );

  // const avg = getAverage(nums); // nums의 값이 변경될 때만 호출 될 필요, 다른경우X 메모리 효율 위함 -> 아래 함수형 코드를 사용
  const avg = useMemo(() => getAverage(nums), [nums]); // num의 값이 변경될때만 호출 됨
  return (
    <>
      <form autoComplete="off" onSubmit={onSubmit}>
        <input type="number" value={num} onChange={onChange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {nums.map((num, i) => (
          <li key={i}>{num}</li>
        ))}
      </ul>
      평균 : {avg}
    </>
  );
};

export default React.memo(Average);
