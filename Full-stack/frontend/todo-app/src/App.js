import './App.css';
import LearningComponent from './components/learning-examples/LearningComponent';
import LearningJavaScript from './components/learning-examples/LearningJavaScript';

// All components we wrote shoud be child components of App component
function App() {
  return (
    <div className="App">
      <LearningComponent />
      <LearningJavaScript />
    </div>
  );
}

export default App;
