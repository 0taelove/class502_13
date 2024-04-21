import { useState, useEffect, useRef } from 'react';

const JoinForm = (props) => {
    console.log(props);
  const [form, setForm] = useState({});

  let userIdEl = useRef();

  useEffect(() => {
    // userIdEl.focus();
    // console.log(userIdEl.current);
    userIdEl.current.focus();
  }, [userIdEl]);

  const onChange = (e) => {
    // form[e.currentTarget.name] = e.currentTarget.value;
    // setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({ ...prevForm, [name]: value }));
  };

  const onSubmit = (e) => {
    e.preventDefault();
    // 처리 완료

    // 처리 완료 후 양식 값을 비워줘야 함
    setForm({});
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            // ref={(ref) => (userIdEl = ref)} // ref를 사용하여 DOM 객체를 바로 할당할 수 있음
            ref={userIdEl} // 함수형태로 접근
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userNm"
            onChange={onChange}
            value={form.userNm ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
