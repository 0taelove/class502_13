import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%
  height: 45px;
  border: 0;
  font-size: 1.5rem;
  font-weight: bold;
  background: ${({bgcolor}) => bgcolor ?? 'orange'};

  ${({ selected, bgcolor }) => selected && css` 
    border: 1px solid ${bgcolor ?? 'orange'};
    background: #fff;
  `}
`;
// ${} 함수를 정의하기만 해도 호출이 됨
// props 값이 첫 번재 매개변수로 들어옴 -> 비구조화로 바꿔주기
// if문을 쓸 수 없기에 삼항 조건문, true일 때는 && 연산문을 사용함