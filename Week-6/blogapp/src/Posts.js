import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    console.error("Caught an error:", error, info);
    this.setState({ error: "An error occurred in a child component." });
  }

  async loadPosts() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }
      const data = await response.json();
      this.setState({ posts: data });
    } catch (error) {
      console.error("Failed to load posts:", error);
      this.setState({ error: 'Failed to load posts. Please check your connection.' });
    }
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <div>Error: {error}</div>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {posts.map(post => (
          <article key={post.id} style={{ borderBottom: '1px solid #ccc', marginBottom: '20px', paddingBottom: '20px' }}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </article>
        ))}
      </div>
    );
  }
}

export default Posts;