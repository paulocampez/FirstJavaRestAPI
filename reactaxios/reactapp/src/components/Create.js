import React, { Component } from 'react';
import axios from 'axios';

export default class Create extends Component {

    constructor(props) {
        super(props);
        this.onChangeNome = this.onChangeNome.bind(this);
        this.onChangeCargo = this.onChangeCargo.bind(this);
        this.onChangeDate = this.onChangeDate.bind(this);
        this.onChangeCpf = this.onChangeCpf.bind(this);
        this.onChangeUF = this.onChangeUF.bind(this);
        this.onChangeSalary = this.onChangeSalary.bind(this);
        this.onChangeStatus = this.onChangeStatus.bind(this);
        this.onSubmit = this.onSubmit.bind(this);

        this.state = {
            name: '',
            nome: '',
            cpf: '',
            data_cad: '',
            cargo: '',
            uf_nasc: '',
            salario: 0.0,
            status:  ''
        }
    }
    onChangeNome(e){
        this.setState({
            nome: e.target.value
    });
    }
    onChangeCargo(e){
        this.setState({
            cargo: e.target.value
    });
    }
    onChangeDate(e){
        this.setState({
            data_cad: e.target.value
    });
    }
    onChangeUF(e){
        this.setState({
            uf_nasc: e.target.value
    });
    }
    onChangeSalary(e){
        this.setState({
            salario: e.target.value
    });
    }
    onChangeStatus(e){
        this.setState({
            status: e.target.value
    });
    }
    onChangeCpf(e){
        this.setState({
            cpf: e.target.value
    });
    }
    onSubmit(e) {
        e.preventDefault();
        const serverport = {
            nome: this.state.nome,
            cpf: this.state.cpf,
            data_cad:  this.state.data_cad,
            cargo:  this.state.cargo,
            uf_nasc:  this.state.uf_nasc,
            salario: this.state.salario,
            status:  this.state.status
        }
        axios.post('http://localhost:8080/home', serverport)
        .then(res => console.log(res.data));
        
        this.setState({
            name: '',
            nome: '',
            cpf: '',
            data_cad: '',
            cargo: '',
            uf_nasc: '',
            salario: 0.0,
            status:  ''
        });
    }

    render() {
        return (
            <div style={{marginTop: 50}}>
                <h3>Criar Funcionario</h3>
                <form onSubmit={this.onSubmit}>
                    <div className="form-group">
                        <label>Nome:  </label>
                        <input type="text" className="form-control" value={this.state.nome}  onChange={this.onChangeNome}/>
                    </div>
                    <div className="form-group">
                        <label>Cargo: </label>
                        <input type="text" className="form-control" value={this.state.cargo}  onChange={this.onChangeCargo}/>
                    </div>
                    <div className="form-group">
                        <label>CPF: </label>
                        <input type="text" className="form-control" value={this.state.cpf}  onChange={this.onChangeCpf}/>
                    </div>
                    <div className="form-group">
                        <label>Data: </label>
                        <input type="text" className="form-control" value={this.state.data_cad}  onChange={this.onChangeDate}/>
                    </div>
                    <div className="form-group">
                        <label>UF: </label>
                        <input type="text" className="form-control" value={this.state.uf_nasc}  onChange={this.onChangeUF}/>
                    </div>
                    <div className="form-group">
                        <label>Salario: </label>
                        <input type="number" className="form-control" value={this.state.salario}  onChange={this.onChangeSalary}/>
                    </div>
                    <div className="form-group">
                        <label>Status: </label>
                        <input type="text" className="form-control" value={this.state.status}  onChange={this.onChangeStatus}/>
                    </div>
                    <div className="form-group">
                        <input type="submit" value="Adicionar Funcionario" className="btn btn-primary"/>
                    </div>
                </form>
            </div>
        )
    }
}