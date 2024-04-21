import styled, { css } from 'styled-components';
// 스타일을 입히는 함수 2가지 styled, css
import { BigButton } from './commons/ButtonStyle';

const commonStyle = css`
  width: 100%;
`;
// 공통의 함수(스타일)를 적용하기 위해 css 사용

const OuterBox = styled.div`
  ${commonStyle}
  position: fixed;
  height: 100%;
  left: 0;
  top: 0;
  display: flex;
  align-items: center;
`;

const FormBox = styled.form`
  width: 420px;
  margin: 0 auto;

  h1 {
    text-align: center;
  }
`;

const InputBox = styled.input`
  ${commonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  padding: 0 10px;
  & + & {
    margin-top: 5px;
  }
`;
//태그 함수를 이용한 문법
//styled.Input 함수 안에 ``안의 값이 매개변수로 쓰임 내부함수 호출 tagged 함수

const LoginForm = () => {
  // ()안에 함수를 정의하기만 해도 첫 번째 매개변수는 props 값 이다.
  return (
    <OuterBox>
      <FormBox autoComplete="off">
        <h1>로그인</h1>
        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비밀번호" />
        <BigButton type="submit" selected={true}>
          로그인
        </BigButton>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
