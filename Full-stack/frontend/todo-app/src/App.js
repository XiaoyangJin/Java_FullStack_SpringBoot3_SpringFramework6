import './App.css';
import Counter from './components/counter/Counter';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <Counter by={1} />
      <Counter by={3} />
      <Counter by="5" />

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

function PlayWithProps({ property1, property2 }) {
  console.log(property1);
  console.log(property2);

  return (
    <div>Props</div>
  )
}

export default App;
