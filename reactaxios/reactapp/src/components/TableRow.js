import React, { Component } from 'react';

class TableRow extends Component {
  render() {
    return (
        <tr>
        <td>{this.props.obj.nome}</td>
        <td>{this.props.obj.cargo}</td>
        <td>{this.props.obj.cpf}</td>
        <td>{this.props.obj.data_cad}</td>
        <td>{this.props.obj.salario}</td>
        <td>{this.props.obj.uf_nasc}</td>
        <td>{this.props.obj.status}</td>
        </tr>
    );
  }
}

export default TableRow;