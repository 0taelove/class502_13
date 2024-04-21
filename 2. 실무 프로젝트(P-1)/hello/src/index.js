import React from 'react'; /* 모듈 경로 rode_modules 외부에서 다운 받은 폴더 형태 */
import ReactDOM from 'react-dom/client';
import './index.css'; /* ./가 붙어있으면 우리가 개발한 지정 파일 가져옴 */
import App from './App'; /* import뒤의 App은 변수명 */
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
