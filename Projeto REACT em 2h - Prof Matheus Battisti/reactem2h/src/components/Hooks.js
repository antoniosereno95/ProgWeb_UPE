import { useState } from "react";


const Hooks = () => {

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
                <p>Idade = {idade}</p>
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