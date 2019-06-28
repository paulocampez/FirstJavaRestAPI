import React,{Component} from 'react';
import PropTypes from 'prop-types';
import Button from 'react-bootstrap/Button';



class TodoItem extends Component{
    getStyle = () =>{
        return {
            background: '#f4f4f4',
            padding: '10px',
            borderBottom: '1px #ccc dotted',
            textDecoration: 'none'
        }
    }
    render() {
        const {id, nome} = this.props.todo;

        return (
            <div style = {this.getStyle()}>
                <p>
                    <input type="checkbox" onChange={this.props.markComplete.bind(this,id)}/>{' '}
                    {nome}
                    <Button className ="btn" onClick = {this.props.delTodo.bind(this,id)} style={btnStyle} >x</Button>
                </p>
            </div>
        );
    }

}

TodoItem.propTypes ={
    todo: PropTypes.object.isRequired,
    markComplete: PropTypes.func.isRequired,
    delTodo:PropTypes.func.isRequired
}
const btnStyle ={
    background:'#ff0000',
    border:'none',
    padding:'5px 9px',
    borderRadius: '50px',
    cursor: 'pointer',
    float: 'right',
    color: '#fff',
}
export default TodoItem