import './App.css';
import {useState, useEffect} from 'react';
import {BsTrash, BsBookmarckCheck, BsBookmarckCheckFill } from 'react-icons/bs';

const API = "http://localhost:5000";

export default function App(){

    const [title, setTitle] =  useState("");
    const [time, setTime] = useState("");
    const [listaDeTodos, setListaDeTodos] = useState([]); //aqui inicia ocm uma lista vazia para que eu possa colocar objetos TO-DO´s dentro dessa array.
    const[loading, setLoading] = useState(false);



    return (
        <>
            <div className='App'>
                <div className='todo-header'>
                    <h1>Projeto TO-DO´s React</h1>
                </div>
                <div className='form-todo'>
                    <p>Formulario</p>
                </div>
                <div className='list-todo'>
                    <h2>Lista de Tarefas:</h2>
                    {listaDeTodos.length === 0 && <p>Não ha tarefas a serem exibidas</p>}
                </div>
            </div>
        </>
    );
}