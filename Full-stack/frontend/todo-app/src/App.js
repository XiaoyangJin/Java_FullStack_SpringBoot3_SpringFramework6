import './App.css';
import LearningComponent from './components/learning-examples/LearningComponent';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <LearningComponent />
    </div>
  );
}

export default App;
