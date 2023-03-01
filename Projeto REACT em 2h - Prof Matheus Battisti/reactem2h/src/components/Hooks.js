import { useState, useEffect } from "react";


const Hooks = () => {

    //o hook useeffect é como um use state so que ele é automatico, e o gatilho dele é qualquer açao utilizada, normalmente utilizado para carregar dados de uma api externa ou de servidores externos quando o usuario acessa uma pagina e os dados desa certa api externa tem que ser buscados para aparecerem atualizados.
    useEffect(() => {
        console.log("testando o useEffect!")
    });

    const [idade, setIdade] = useState(27) //invocaçao do metodo UseState

    const changeAge = () => {
        setIdade(idade + 2)
    }
    const resetIdade = () => {
        setIdade(27)
    }

    return (
        <>
        <br/>
        <fieldset>
            <div>
                <p><strong>Idade = </strong>{idade}</p>
                <br/>
                <button
                onClick={changeAge}
                >Mudar Idade(+2)</button>
                <button
                onClick={resetIdade}
                >Reset Idade</button>
            </div>
        </fieldset>
        </>
    );
}

export default Hooks;