import { Component } from 'react';

class Counter2 extends Component {
  state = {
    number: 0,
  };

  render() { /* 화면을 갱신(출력)할 때 사용하는 코드 render */
    const { number } = this.state;
    const plus = () => this.setState({number: number + 1});
    const minus = () => this.setState({number: number - 1});

    return (
        <>
            <h1>{number}</h1>
            <button type="button" onClick={plus}>+1</button>
                +1
            <button type="button" onClick={minus}>-1</button>
                -1
        </>
    );
  }
}

export default Counter2;