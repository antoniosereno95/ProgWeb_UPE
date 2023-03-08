import './App.css';
import {useState, useEffect} from 'react';
import {BsTrash, BsBookmarckCheck, BsBookmarckCheckFill } from 'react-icons/bs';

const API = "http://localhost:5000";

export default function App(){

    const [title, setTitle] =  useState("");
    const [time, setTime] = useState("");
    const [todos, setTodos] = useState({}); //aqui inicia ocm uma lista vazia para que eu possa colocar objetos TO-DO´s dentro dessa array.
    const[loading, setLoading] = useState(false);

    

    return (
        <>
            <div className='App'>
                <h1>TO-DO´s</h1>
            </div>
        </>
    );
}