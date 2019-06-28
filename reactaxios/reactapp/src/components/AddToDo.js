import  React,{Component} from 'react'
import Button from 'react-bootstrap/Button';

class AddToDo extends Component{
    state = {
        nome:''
    }
    onsubmitEvent = (e) =>{
        e.preventDefault();
        this.props.addTodo(this.state.nome);
        this.setState({nome:''});

    }
    onchangeEvent =(e) =>{
        this.setState({[e.target.name]:e.target.value});
    }
    render(){
        return(
            <form onSubmit={this.onsubmitEvent} style={{display:'flex'}}>
                <input
                    type= "text"
                    sytle={{flex: '10', padding: '5px', width:'260px'}}
                    name="nome"
                    placeholder="Add to do.."
                    value ={this.state.nome}
                    onChange={this.onchangeEvent}
                />
                <Button as="input" type="submit" value="Submit" />

            </form>
        )

    }
}

export default AddToDo