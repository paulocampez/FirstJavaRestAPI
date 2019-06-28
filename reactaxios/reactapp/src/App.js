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
     
        <nav>

          <div className="toggle" id="navbarSupportedContent"><i className="fas fa-bars menu"></i></div>
            <ul className="navbar-nav mr-auto">
              <li className=""><Link to={'/create'} className="">Create</Link></li>
              <li className=""><Link to={'/index'} className="">List</Link></li>
            </ul>
            <hr />

        </nav>
        <div className="container">
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