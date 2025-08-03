import './App.css';
// Import the component for flag=true
import ListofPlayers from './components/ListofPlayers';

// Import the components for flag=false
import { OddPlayers, EvenPlayers, ListofIndianPlayers, IndianPlayersList } from './components/IndianPlayers';

function App() {
  // Use this flag to switch between the two views.
  // Set to 'true' to see the list of players and scores.
  // Set to 'false' to see the destructured and merged player lists.
  const flag = false;

  // Declare an array of 11 players with names and scores.
  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 84 },
    { name: 'Jadeja', score: 64 },
    { name: 'Raina', score: 75 },
    { name: 'Rohit', score: 80 },
  ];

  // This is the list of players for the destructuring example.
  const IndianTeam = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

  if (flag) {
    return (
      <div className="App">
        {/* Pass the players array as a prop */}
        <ListofPlayers players={players} />
      </div>
    );
  } else {
    return (
      <div className="App">
        {/* Pass the IndianTeam array to the destructuring components */}
        <OddPlayers players={IndianTeam} />
        <hr />
        <EvenPlayers players={IndianTeam} />
        <hr />
        {/* Pass the merged IndianPlayersList to its component */}
        <ListofIndianPlayers players={IndianPlayersList} />
      </div>
    );
  }
}

export default App;