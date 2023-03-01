import './App.css';
import AnotherComponent from './components/AnotherComponent';
import Conteiner from './components/Conteiner';
import FirstComponent from './components/FirstComponent';
import Fragmentos from './components/Fragmentos';
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
      <RenderCondicional y={7}/>
      <Fragmentos />
      <Conteiner>
        <h1>Aqui temos um conteiner abraçando as estruturas dentro dele:</h1>
        <AnotherComponent />
        <List />
      </Conteiner>
    </div>
  );
}

export default App;