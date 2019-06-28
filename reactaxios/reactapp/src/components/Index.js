import React, { Component } from 'react';
import axios from 'axios';
import TableRow from './TableRow';

export default class Index extends Component {

  constructor(props) {
      super(props);
      this.state = {serverports: []};
    }
    componentDidMount(){
      axios.get('http://localhost:8080/home')
      .then(response => {
        this.setState({ serverports: response.data });
      })
      .catch(function (error) {
        console.log(error);
      })
    }
    tabRow(){
        return this.state.serverports.map(function(object, i){
            return <TableRow obj={object} key={i} />;
        });
    }

    render() {
      return (
        <div className="container">
            <table className="table table-striped">
              <thead>
                <tr>
                <th>Nome</th>
                <th>Cargo</th>
                <th>Cpf</th>
                <th>Data de Cadastro</th>
                <th>Salario</th>
                <th>UF</th>
                <th>Status</th>
                </tr>
              </thead>
              <tbody>
                {this.tabRow()}
              </tbody>
            </table>
        </div>
      );
    }
  }