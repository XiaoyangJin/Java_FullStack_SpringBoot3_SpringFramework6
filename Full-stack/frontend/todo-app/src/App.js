import './App.css';
import Counter from './components/counter/Counter';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <Counter />
      <Counter />
      <Counter />
    </div>
  );
}

export default App;
