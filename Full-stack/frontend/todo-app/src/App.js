import './App.css';
import { Component } from 'react';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <FirstComponent />
      <SecondComponent></SecondComponent>
      <ThirdComponent></ThirdComponent>
      <FourthComponent></FourthComponent>
    </div>
  );
}

// function components
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

// class components
class ThirdComponent extends Component {
  //method
  render() {
    return (
      <div className="ThirdComponent">Third Component</div>
    )
  }
}

class FourthComponent extends Component {
  //method
  render() {
    return (
      <>
        <div className="FourthComponent">Fourth Component</div>
        <div className="FourthComponent">Fourth Component</div>
      </>
    )
  }
}

export default App;
