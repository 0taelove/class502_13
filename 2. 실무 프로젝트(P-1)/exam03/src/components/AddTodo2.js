import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  useEffect(() => {
    console.log('todo, message 값 변경 - 렌더링 후');

    return () => {
      console.log('뒷 정리 함수... /update');
    };
  });
  //props 대신 비구조화 할당을 사용
  /*
  useEffect(() => { // 모든 hook은 컴포넌트 안에 정의
    // componentDidMount(), componentDidUpdate() - todo값의 변화에 의한 렌더링
    console.log("todo, message 값 변경 - 렌더링 후");
  }, [todo, message]) // [] 변화감지의 기준이 될 수 있는 값을 넣어줌
  // 기준 두 번째 매개변수가 변경(렌더링)되어야만 호출 됨
  */

  /*
  useEffect(() => { // componentDidMount(), componentDidUpdate() - message
    console.log("message 값 변경");
  }, [message])
  */

  useEffect(() => {
    // 변경 기준인 매개변수가 없기 때문에 Update는 호출 안 됨
    console.log('마운트시 한번만 호출'); // componentDidMount()
  }, []); // 최초 로드작업만 필요한 경우 사용 DOMContentLoaded 비슷 (동일X)

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>
      {message && <div>{message}</div>}
    </form>
  );
};

export default AddTodo;
