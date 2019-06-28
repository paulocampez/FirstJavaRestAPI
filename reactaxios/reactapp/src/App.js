import React, { Component } from 'react';
import { BrowserRouter as Router } from 'react-router-dom'
import { Route } from 'react-router-dom'
import Header from './components/layout/Header'
import AddToDo from './components/AddToDo'
import Todos from './components/Todos'

import './App.css';
import axios from 'axios'

class App extends Component {
  state = {
      todos:[]

  }

   addTodo = (title) =>{
        axios.post('http://localhost:8080/home',{
            title: title,
            completed: false

        }).then(res=> this.setState({todos:[...this.state.todos,res.data]}));
    }
    //Toggle complete
    delTodo =(id) =>{
        axios.delete(`http://localhost:8080/home/$cpf`).then(res => this.setState({todos:[...this.state.todos.filter(todo => todo.id !== id)]}));

    }
    markComplete = (id)=>{
        this.setState({todos:this.state.todos.map(todo =>{
            if(todo.id === id){
                todo.completed =!todo.completed
            }
            return todo;
        })
        });
    }

  render() {
    return (
        <Router>
            <div className="App">
                <div className="container">
                    <Header/>
                    <Route exact path="/" render={props => (
                            <React.Fragment>

                                <AddToDo addTodo={this.addTodo}/>
                                <Todos todos={this.state.todos} markComplete={this.markComplete}
                                       delTodo={this.delTodo}/>

                            </React.Fragment>

                        )}/>
                </div>
            </div>
        </Router>
    );
}
  getTitles() {
    return this.state.todos.map(item => item.nome)
  }
  componentDidMount(){
      axios.get('http://localhost:8080/home')
        .then(res =>this.setState({todos:res.data}));
  }
}


export default App;
