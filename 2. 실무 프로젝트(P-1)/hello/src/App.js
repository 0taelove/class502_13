/* import { Fragment } from 'react'; */

const App = () => {
  const name = 'React'; /* js를 넣으면 아! 재미있다!가 출력 안 됨 */

  const style = {
    backgroundColor : 'orange',
    color : 'white',
    height : '100px',
  };

  return (
    /* 교체 효율성(Dom트리 조화) 때문에 div 하나로 감싸야 한다 div를 사용하고 싶지 않다면 리액트에는 Fragment를 사용하면 됨 == <> ~ </> */
    <>
    {/* 주석 ...  */}
      <div className="subject" style={style}>첫번째 컴포터넌트!!</div>
      <div style={{color: 'blue'}}>신나는, {name && name} 공부</div>
      {name === 'React' && <h1>아! 재미있다!</h1>}
      <input 
      // 주석...
      type="text" />
    </>
  );
};

export default App;
