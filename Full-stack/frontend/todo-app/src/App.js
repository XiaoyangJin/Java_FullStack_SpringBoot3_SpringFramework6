import './App.css';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <FirstComponent></FirstComponent>
      <SecondComponent></SecondComponent>
    </div>
  );
}

function FirstComponent() {
  return (
    <div className="FirstComponent">First Component</div>
  )
}

function SecondComponent() {
  return (
    <div className="SecondComponent">Second Component</div>
  )
}

export default App;
