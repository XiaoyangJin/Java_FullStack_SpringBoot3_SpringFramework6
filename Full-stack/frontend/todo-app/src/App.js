import './App.css';
import FirstComponent from './components/learning-examples/FirstComponent'
import { FifthComponent } from './components/learning-examples/FirstComponent';
import SecondComponent from './components/learning-examples/SecondComponent';
import ThirdComponent from './components/learning-examples/ThirdComponent';
import FourthComponent from './components/learning-examples/FourthComponent';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <FirstComponent />
      <SecondComponent />
      <ThirdComponent />
      <FourthComponent />
      <FifthComponent />
    </div>
  );
}

export default App;
