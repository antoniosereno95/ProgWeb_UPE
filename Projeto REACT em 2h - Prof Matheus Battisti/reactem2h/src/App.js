import './App.css';
import AnotherComponent from './components/AnotherComponent';
import FirstComponent from './components/FirstComponent';
import Hooks from './components/Hooks';
import List from './components/List';
import RenderCondicional from './components/RenderCondicional';


function App() {
  return (
    <div className="App">
      <h2>Hello React Worlds</h2>
      <FirstComponent />
      <AnotherComponent />
      <Hooks />
      <List />
      <RenderCondicional />
    </div>
  );
}

export default App;