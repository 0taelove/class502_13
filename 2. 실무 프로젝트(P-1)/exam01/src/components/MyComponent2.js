import { Component } from 'react';
import PropTypes from 'prop-types';

class MyComponent extends Component {
  static defaultProps = {
    name: '기본 이름',
  };

  static propTypes = {
    name: PropTypes.string,
    num: PropTypes.number.isRequired, /* isRequired 필수 항목 */
  };

  render() { /* render 필수 함수 */
    const { name, num, children } = this.props;
    return (
      <>
        <div>안녕하세요!, 제 이름은 {name}입니다.</div>
        <dlv>제가 좋아하는 숫자는 {num}입니다</dlv>
        {children}
      </>
    );
  }
}

/*
MyComponent.propTypes = {
  name: PropTypes.string,
  num: PropTypes.number.isRequired,
}; render 상단에 static을 사용하여 동일한 기능 대체 가능
*/

export default MyComponent;
