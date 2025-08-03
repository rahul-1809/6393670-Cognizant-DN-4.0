import React from 'react';

// This component receives the 'players' array as a prop.
function ListofPlayers({ players }) {
  // Use the filter() method with an arrow function to get players with scores <= 70.
  const playersBelow70 = players.filter(player => player.score <= 70);

  return (
    <div>
      {/* List of All Players */}
      <h1>List of Players</h1>
      <ul>
        {/* Use the map() method to display each player */}
        {players.map((player, index) => (
          <li key={index}>
            Mr. {player.name} <span>{player.score}</span>
          </li>
        ))}
      </ul>

      <hr />

      {/* List of Players with Scores less than 70 */}
      <h1>List of Players having Scores Less than 70</h1>
      <ul>
        {/* Map over the filtered list */}
        {playersBelow70.map((player, index) => (
          <li key={index}>
            Mr. {player.name} <span>{player.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;