import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { GoTrash } from 'react-icons/go';
import { FaRegTrashCan } from 'react-icons/fa6';

const TodoList = ({ items, onToggle, onRemove }) => {
  //props(속성을 정의하는 기능) 대신 비구조화 할당을 사용
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          <span onClick={() => onToggle(id)}>
            {done ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
            {title}
          </span>
          <button type="button" onClick={() => onRemove(id)}>
            <FaRegTrashCan />
          </button>
        </li>
      ))}
    </ul>
  );
};

export default TodoList;
