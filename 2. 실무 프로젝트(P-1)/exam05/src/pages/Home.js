import React, { Suspense, useState } from 'react';
import { Link, Navigate } from 'react-router-dom';
import styled from 'styled-components';
import loadable from '@loadable/component';

/*
const MessageBox2 = styled(MessageBox)`
  background: orange;
`;
*/

const MessageBox = loadable(() => import('../components/commons/MessageBox'), {fallback: <div>로딩중...</div>,
});

// const MessageBox = React.lazy(() => import('../components/commons/MessageBox'));

const Home = () => {
  const [visible, setVisible] = useState(false);
  /*
  const result = true;
  if (result) {
    return <Navigate to="/about" replace={true} />;
  }
  */

  return (
    <div>
      <h1>HOME</h1>
      <div>메인 페이지</div>
      <div>
        <Link to="/about">회사 소개</Link>
        {/*}
        <Suspense fallback={<div>로딩중...</div>}>
          {visible && <MessageBox>메세지!</MessageBox>}
        </Suspense>
        */}
        {visible && <MessageBox>메세지!!</MessageBox>}
        <button type="button" onClick={() => setVisible(true)}>
          보이기
        </button>
      </div>
      {/*<MessageBox2>메세지!!!</MessageBox2>*/}
    </div>
  );
};

export default React.memo(Home);
// 변경 사항이 없으면 렌더링을 다시 하지 않음 React.memo()
