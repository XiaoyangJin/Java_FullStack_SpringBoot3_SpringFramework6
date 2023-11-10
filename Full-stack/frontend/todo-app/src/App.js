import './App.css';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      My Todo Application
      <FirstComponent></FirstComponent>
    </div>
  );
}

function FirstComponent() {
  return (
    <div className="FirstComponent">First Component</div>
  )
}

export default App;
