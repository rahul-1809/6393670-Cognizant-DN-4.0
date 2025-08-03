import React, { Component } from 'react';

class EventManager extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 1, // Initial counter set to 1 as in the image
    };
    this.handleIncrementClick = this.handleIncrementClick.bind(this);
    this.decrementCounter = this.decrementCounter.bind(this);
  }

  incrementCounter() {
    this.setState({ counter: this.state.counter + 1 });
  }

  sayHello() {
    // This method is still called but doesn't produce a visible alert
    console.log('Hello! The counter will now increase.');
  }

  handleIncrementClick() {
    this.sayHello();
    this.incrementCounter();
  }

  decrementCounter() {
    this.setState({ counter: this.state.counter - 1 });
  }

  sayWelcome(message) {
    alert(message);
  }

  handleSyntheticClick(event) {
    alert('I was clicked');
  }

  render() {
    return (
      <div className="event-manager">
        <h3>{this.state.counter}</h3>
        <div className="button-stack">
            <button onClick={this.handleIncrementClick}>Increment</button>
            <button onClick={this.decrementCounter}>Decrement</button>
            <button onClick={() => this.sayWelcome('Welcome')}>Say welcome</button>
            <button onClick={this.handleSyntheticClick}>Click on me</button>
        </div>
      </div>
    );
  }
}

export default EventManager;