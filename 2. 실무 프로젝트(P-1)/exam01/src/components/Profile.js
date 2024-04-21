import { useState } from 'react';
const Profile = () => {
  const [data, setData] = useState({ /* useState 상태 관리하는 함수 */
    name: '이이름', /* 상태값을 변경하는 함수명으로는 setData를 관례적으로 많이 사용함 */
    age: 40,
  });

  const changeProfile = () => {
    // data.name = '김이름';
    // data.age = 30; /*주소가 같은 객체에 자원만 바꾼 것이기에 렌더링이 안 됨 */
    // setData({name: '김이름', age: 30}); /* 새로운 객체를 만듬 */
    // setData({ ...data, name: '김이름' }); /* 객체를 복사(내 것으로 만듬)하고 변경 원하는 값만 적용 */
    setData((state) => { /* 변경을 할 수 있는 변경함수 함수형 */
      console.log('이전 상태값 :', state);
      return { ...state, name: '김이름' };
    });
  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h2>{age}</h2>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};

export default Profile;
