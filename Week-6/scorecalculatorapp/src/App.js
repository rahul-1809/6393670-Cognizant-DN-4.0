import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name="Ravi Kumar" School="Delhi Public School" Total={455} goal={500} />
    </div>
  );
}

export default App;