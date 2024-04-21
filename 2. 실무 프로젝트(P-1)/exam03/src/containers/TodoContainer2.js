import { useState, useReducer, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo2';
import TodoList from '../components/TodoList2';

const intialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

function reducer(items, action) {
    switch(action.type) {
        case 'ADD':

        return items.concat(action.todo);
        case 'TOGGLE':

            return items.map(item => item.id === action.id ? {...item, done: !item.done} : item);
            case 'REMOVE':

            return items.filter(item => item.id !== action.id);
    }
  return items;
}

const TodoContainer = () => {
  const [items, dispatch] = useReducer(reducer, intialValue);

  // !!반복!! 상태변화에 따라 이 함수가 계속 실행 됨
  // 변경을 가할 수 있는 함수(기능들) 정의
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');

  let id = useRef(4); // 할일 id

  // 할일 등록 처리
  const onSubmit = useCallback(
    //Callback으로 함수를 한 번만 만듬
    (e) => {
      // !!반복!! 정의되고
      e.preventDefault();

      if (!todo.trim()) {
        // ! 값이 없을 때 어떻게 할 것인가를 의미
        setMessage('할일을 입력하세요.'); // 값이 없을 때 해당문구 표출
        return; // == return undefined; 값이 없을 때는 종료한다
      }

      dispatch({
        type: 'ADD',
        todo: {
          id: id.current,
          title: todo,
          done: false,
        },
      });

      id.current++; // 상태값을 업데이트하는 함수를 정의하는 방법중 하나

      setTodo(''); // 값을 비워주는 역할
      setMessage('');
    },
    [todo],
  ); // 변화감지 매개변수 넣는 대신 함수형 Callback 메서드로 사용
  // todo를 매개변수로 사용시 무수히 많은 todo가 바뀔 때 마다 객체가 생성
  /* push는 기존 객체를 바꾸는 것이라 주소값이 일치해서 렌더링이 안 됨
    items.push({
        id: id.current,
        title: todo,
        done: false,
    });
    setItems(items);
    이 때 사용하는 것이 기존 배열을 변경하지 않고 새 배열을 반환하는 concat */

  // 할일 입력시 todo 상태값 변경
  const onChange = useCallback((e) => setTodo(e.currentTarget.value), []);

  // 할일 목록 완료 여부 토클(true -> false, false -> true)
  // 배열은 map을 사용하고 새로운 배열 객체를 만듬
  const onToggle = useCallback((id) => {
    dispatch({ type: 'TOGGLE', id });
  }, []); // 매개변수를 비워두면 변화되는 객체의 기준점이 없기 때문에 동작이 이상하게 됨 -> 매개변수를 넣어주면 작동은 하지만 함수객체가 계속 만들어지기 때문에 비효율적 -> 매개변수를 비워주고 Callback 메서드로 사용하여 함수의 재활용성을 높임

  // 할일 목록 제거 == 배제
  const onRemove = useCallback((id) => {
    dispatch({ type: 'REMOVE', id });
  }, []);
  /*
  const onRemove = (id) => {
    const newItems = items.filter((item) => item.id !== id);
    setItems(newItems);
  };
  */

  return (
    // 출력만 담당함
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
