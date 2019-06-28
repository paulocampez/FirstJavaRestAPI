import React, { Component, useState, Fragment } from 'react'
import UserTable from './tables/UserTable'
import axios from 'axios'

class App extends Component {

  state = {
    users:[]
}

componentDidMount(){
  axios.get('http://localhost:8080/home').then(res =>this.setState({users:res.data}));
}

render(){
	return (
		<div className="container">
			<h1>CRUD</h1>
			<div className="flex-row">
				<div className="flex-large">
					<h2>Funcionarios</h2>
					<UserTable users={this.state.users}/>
				</div>
			</div>
		</div>
	)
}
}
export default App