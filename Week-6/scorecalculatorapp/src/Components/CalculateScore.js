import React from 'react';
import '../Stylesheets/mystyle.css'; 

const CalculateScore = ({ Name, School, Total, goal }) => {
  
  const scorePercentage = (Total / goal) * 100;

  return (
    <div className="score-card">
      <h1 className="student-name">{Name}</h1>
      <p className="school-name">{School}</p>
      <h2 className="score-display">
        Score: {scorePercentage.toFixed(2)}%
      </h2>
      <p>Total Marks: {Total} / {goal}</p>
    </div>
  );
};

export default CalculateScore;