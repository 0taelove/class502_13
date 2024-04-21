import { Component } from 'react'; // 리액트 모듈에서 가져옴

class Color extends Component {
  state = {
    color: 'blue',
    subColor: 'black',
  };

  render() {
    // 클래스형 컴포넌트에서 render는 필수
    /* const changeColor = (color) => console.log(this); // Color */
    const changeColor = (color) => this.setState({ color }); // Color
    const changesubColor = (color) =>
      this.setState((prevState) => ({ ...prevState, subColor: color }));

    const { color, subColor } = this.state;
    return (
      <>
        <div
          style={{ background: color, width: '100px', height: '100px' }}
        ></div>
        <button
          type="button"
          onClick={() => changeColor('red')}
          onContextMenu={() => changesubColor('red')}
        >
          RED
        </button>
        <button
          type="button"
          onClick={() => changeColor('orange')}
          onContextMenu={() => changesubColor('orange')}
        >
          ORANGE
        </button>
        <button
          type="button"
          onClick={() => changeColor('green')}
          onContextMenu={() => changesubColor('green')}
        >
          GREEN
        </button>
        <div
          style={{ background: subColor, width: '50px', height: '50px' }}
        ></div>
      </>
    );
  }
}

export default Color; // 내보내기를 해줘야 다른 컴포넌트에서 가져오기 가능
