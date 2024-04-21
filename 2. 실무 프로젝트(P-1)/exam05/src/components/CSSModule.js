import { useState } from 'react';
import styles from './CSSModule.module.scss';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);
// bind = 호출X this의 범위를 바꾸거나 매개변수를 고정해서 새로운 함수를 만듬

const CSSModule = () => {
  const [visible, setVisible] = useState(false);

  return (
    <>
      <div className={styles.wrapper}>
        <span className="commonColor">안녕하세요</span>,
        <span className={styles.highlight}>반갑습니다</span>.
      </div>
      <div className={cx('menus', ['cls1', 'cls2'], { on: visible })}>
        메뉴
      </div>
      <button type="button" onClick={() => setVisible(!visible)}>
        클릭
      </button>
    </>
  );
};

export default CSSModule;
