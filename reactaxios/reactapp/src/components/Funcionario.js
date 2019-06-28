import React from 'react'

const Funcionario = props => (
    <tr key={props.user.id}>
        <td>{props.user.nome}</td>
        <td>{props.user.cargo}</td>
        <td>{props.user.cpf}</td>
        <td>{props.user.data_cad}</td>
        <td>{props.user.salario}</td>
        <td>{props.user.uf_nasc}</td>
        <td>{props.user.status}</td>
    </tr>
)

export default Funcionario