import React from 'react';
import './App.css';

function App() {
  const officeSpaces = [
    {
      name: 'DBS',
      rent: 50000,
      address: 'Chennai'
    },
    {
      name: 'WeWork',
      rent: 75000,
      address: 'Mumbai'
    }
  ];

  const imageUrl = "https://images.unsplash.com/photo-1521737604893-d14cc237f11d?w=500&auto=format&fit=crop";

  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>

      <img src={imageUrl} width="25%" height="25%" alt="Modern office space" />

      {officeSpaces.map((office, index) => (
        <div key={index}>
          <h2>Name: {office.name}</h2>

          <h3 style={{ color: office.rent <= 60000 ? 'red' : 'green' }}>
            Rent: Rs. {office.rent}
          </h3>
          
          <h3>Address: {office.address}</h3>
          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;