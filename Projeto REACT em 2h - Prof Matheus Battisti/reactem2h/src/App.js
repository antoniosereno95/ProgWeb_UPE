import './App.css';
import AnotherComponent from './components/AnotherComponent';
import FirstComponent from './components/FirstComponent';
import Hooks from './components/Hooks';


function App() {
  return (
    <div className="App">
      <h2>Hello React Worlds</h2>
      <FirstComponent />
      <AnotherComponent />
      <Hooks />
    </div>
  );
}

export default App;