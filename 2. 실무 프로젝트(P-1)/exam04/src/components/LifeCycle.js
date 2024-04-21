import { Component } from 'react';

class LifeCycle extends Component {
  state = {
    number: 0,
  };
  constructor(props) {
    // 초기에 실행할 값
    super(props); // 위의 component로 넘기는 기능

    console.log('constructor');
  }

  static getDerivedStateFromProps(prevProps, prevState) {
    // 기존 props값, 기존 state 값
    console.log('getDerivedStateFromProps');
    if (prevProps.mode === 'even' && prevState.number % 2 === 1) {
      return { number: prevState.number + 1 };
    }

    return null;
  }

  shouldComponentUpdate(props, state) {
    // return state.number++ % 3 !== 0;
    if (this.state.number % 3 === 0) {
      this.setState({ number: state.number + 1 });
      return false;
    }

    return true;
  }

  componentDidMount() {
    console.log('componentDidMount');
  }

  getSnapshotBeforeUpdate(props, state) {
    console.log('getSnapshotBeforeUpdate');

    return { value: 100 }; // 반환 값이 세번째 매개변수인 snapshot로 반환 된다
  }

  componentDidUpdate(props, state, snapshot) {
    console.log('componentDidUpdate');
    console.log('snapshot', snapshot);
  }

  componentWillUnmount() {
    console.log('componentWillUnmount');
  }

  render() {
    console.log('render');
    const { number } = this.state;
    
    try {
        number.abc();
    } catch (err) {
        console.log(err.message);
        console.error(err);
        console.log("에러 처리...");
    } finally {
      console.log('무조건 실행!');
    }
    // throw new Error('에러 발생!!!!!')

    return (
      <>
        <h1>{number}</h1>
        <button
          type="button"
          onClick={() => this.setState({ number: number + 1 })}
        >
          +1
        </button>
        <button
          type="button"
          onClick={() => this.setState({ number: number - 1 })}
        >
          -1
        </button>
      </>
    );
  }
}

export default LifeCycle;
