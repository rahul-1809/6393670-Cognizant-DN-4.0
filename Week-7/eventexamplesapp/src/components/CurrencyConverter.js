import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState(80); // Default amount from image
  const [currency, setCurrency] = useState('Euro'); // Default currency from image

  // This handler simulates the calculation shown in the image's alert box
  const handleSubmit = (event) => {
    event.preventDefault();
    const result = amount * 80; // Simple multiplication as implied by the image
    alert(`Converting to ${currency} Amount is ${result}`);
  };

  return (
    <div>
      <h2 style={{ color: 'green', fontWeight: 'bold' }}>
        Currency Convertor!!!
      </h2>
      <form onSubmit={handleSubmit}>
        <div className="form-row">
          <label>Amount:</label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div><br/>
        <div className="form-row">
          <label>Currency:</label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div><br/>
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;