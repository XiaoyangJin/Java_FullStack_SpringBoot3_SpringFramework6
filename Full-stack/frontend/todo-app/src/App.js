import './App.css';
import Counter from './components/counter/Counter';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <Counter />

    </div>
  );
}

// function PlayWithProps(properties) {

//   console.log(properties);
//   console.log(properties.property1);
//   console.log(properties.property2);

//   return (
//     <div>Props</div>
//   )
// }

export default App;
