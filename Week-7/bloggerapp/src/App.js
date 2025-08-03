import React, { useState } from 'react';
import './App.css';
import { books, courses, blogs } from './data.js';
import BookDetails from './components/BookDetails';
import CourseDetails from './components/CourseDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  const [show, setShow] = useState({
    courses: true,
    books: true,
    blogs: true,
  });

  const toggleComponent = (component) => {
    setShow((prevState) => ({
      ...prevState,
      [component]: !prevState[component],
    }));
  };

  return (
    <div className="App">
      <div className="controls">
        <button onClick={() => toggleComponent('courses')}>
          {show.courses ? 'Hide' : 'Show'} Courses
        </button>
        <button onClick={() => toggleComponent('books')}>
          {show.books ? 'Hide' : 'Show'} Books
        </button>
        <button onClick={() => toggleComponent('blogs')}>
          {show.blogs ? 'Hide' : 'Show'} Blogs
        </button>
      </div>

      <div className="container">
        {show.courses && (
          <div className="column">
            <CourseDetails courses={courses} />
          </div>
        )}

        {show.books && (
          <div className="column">
            <BookDetails books={books} />
          </div>
        )}

        {show.blogs && (
          <div className="column">
            <BlogDetails blogs={blogs} />
          </div>
        )}
      </div>
    </div>
  );
}

export default App;