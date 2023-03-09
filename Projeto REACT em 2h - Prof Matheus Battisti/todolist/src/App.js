import './App.css';
import {useState, useEffect} from 'react';
import {BsTrash, BsBookmarckCheck, BsBookmarckCheckFill } from 'react-icons/bs';

const API = "http://localhost:5000";

export default function App(){

    const [title, setTitle] =  useState("");
    const [time, setTime] = useState("");
    const [listaDeTodos, setListaDeTodos] = useState([]); //aqui inicia ocm uma lista vazia para que eu possa colocar objetos TO-DO´s dentro dessa array.
    const[loading, setLoading] = useState(false);

    //load todo befora page load
    useEffect(()=>{
        const loadData = async() => {

            setLoading(true);

            const res = await fetch(API + '/todos')
            .then((res)=>res.json())
            .then((data)=>data)
            .catch((Err)=>console.log(Err));

            setLoading(false);

            setListaDeTodos(res);
        }
        loadData();
    },
    []);


    const handleSubmit = async (event) =>{ //issoaqui é o controller do input que no caso é um formulario com diversos eventos de input dentro dele
        event.preventDefault();

        const todo = {
            id: Math.floor(Math.random() * (1000 - 1 + 1) + 1), //gera um numero aleatorio entre 1 e 1000
            title: title,
            time: time,
            done: false
        };

        //envio para a API
        await fetch(API + "/todos", {
            method: 'POST',
            body: JSON.stringify(todo),
            headers: {
                "Content-Type": "applicacion/json"
            }
        });
        
        setTitle("");
        setTime("");

        console.log(todo)
        console.log("envio do formulario de nova tarefa");
    }

    return ( 
        <>
            <div className='App'>
                <div className='todo-header'>
                    <h1>Projeto TO-DO´s React</h1>
                </div>
                <div className='form-todo'>
                    <h2>Insira sua proxima tarefa:</h2>
                    <form onSubmit={handleSubmit}>
                        <div className='form-control'>
                            <label htmlFor='title'>O que voce vai fazer?</label>
                            <input
                            type="text"
                            name="title"
                            placeholder='Titulo da tarefa'
                            onChange={(event)=>{setTitle(event.target.value)}}
                            value={title || ""}
                            required 
                            />
                            <br/>
                            <label htmlFor='time'>Duração:</label>
                            <input
                            type="text"
                            name="time"
                            placeholder='Tempo de realizaçao da tarefa'
                            onChange={(event)=>{setTime(event.target.value)}}
                            value={time || ""}
                            required 
                            />
                        </div>
                        <input type='submit' value="Criar Tarefa" />
                    </form>
                </div>
                <hr></hr>
                <div className='list-todo'>
                    <h2>Lista de Tarefas:</h2>
                    {listaDeTodos.length === 0 && <p>Não há tarefas a serem exibidas</p>}
                    {listaDeTodos.map((todo) =>(
                        <>
                            <div className='todo' key={todo.id}>
                                {todo.title}
                            </div>
                        </>
                    ))}
                </div>
            </div>
        </>
    );
}