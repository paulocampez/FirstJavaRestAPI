import React from 'react'
import Funcionario from '../components/Funcionario';

const UserTable = props => (
  <table className="table table-striped table-condensed">
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
      {props.users.length > 0 ? (
        props.users.map(user => (
            <Funcionario 
                key={user.id}
                user={user} 
            />
        ))
      ) : (
        <tr>
          <td colSpan={3}>No users</td>
        </tr>
      )}
    </tbody>
  </table>
)

export default UserTable