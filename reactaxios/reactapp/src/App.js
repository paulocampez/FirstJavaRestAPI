import React, { Component } from 'react'
import UserTable from './tables/UserTable'
import axios from 'axios'
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';
import Create from './components/Create';
import Index from './components/Index';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

class App extends Component {

  state = {
    users:[]
}

componentDidMount(){
  axios.get('http://localhost:8080/home').then(res =>this.setState({users:res.data}));
}


render() { 
  return (
    <Router>
      <div className="container">
        <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <a className="navbar-brand">React Axios App</a>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav mr-auto">
              <li className="nav-item"><Link to={'/create'} className="nav-link">Create</Link></li>
              <li className="nav-item"><Link to={'/index'} className="nav-link">List</Link></li>
            </ul>
            <hr />
          </div>
        </nav>
        <Switch>
            <Route exact path='/create' component={ Create } />
            <Route path='/index' component={ Index } />
        </Switch>
      </div>
    </Router>
  );
}
}
export default App