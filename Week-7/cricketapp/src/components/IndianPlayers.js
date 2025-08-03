import React from 'react';

// --- Components for Destructuring ---

// Component for Odd Players
// It uses array destructuring directly in the function parameters.
export function OddPlayers({ players }) {
  const [first, , third, , fifth] = players;
  return (
    <div>
      <h1>Odd Players</h1>
      <ul>
        <li>First: {first}</li>
        <li>Third: {third}</li>
        <li>Fifth: {fifth}</li>
      </ul>
    </div>
  );
}

// Component for Even Players
export function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;
  return (
    <div>
      <h1>Even Players</h1>
      <ul>
        <li>Second: {second}</li>
        <li>Fourth: {fourth}</li>
        <li>Sixth: {sixth}</li>
      </ul>
    </div>
  );
}


// --- Component for Merging Arrays ---

// Define two separate player arrays.
const T20Players = ['First Player', 'Second Player', 'Third Player'];
const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

// Merge the two arrays using the ES6 spread '...' operator.
export const IndianPlayersList = [...T20Players, ...RanjiTrophyPlayers];

// This component receives the merged list and displays it.
export function ListofIndianPlayers({ players }) {
  return (
    <div>
      <h1>List of Indian Players Merged:</h1>
      <ul>
        {players.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
}