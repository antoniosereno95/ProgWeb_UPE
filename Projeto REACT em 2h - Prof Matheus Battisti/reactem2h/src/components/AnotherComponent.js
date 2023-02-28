

const AnotherComponent = () => {

    const handleClick = () => {
        console.log("Clicou no botao");
    }

    return (
        <>
        <fieldset>
            <div>
                <p>Another Componente</p>
                <button
                onClick={handleClick}
                >Evento de Click</button>

                <hr></hr>

                <button 
                onClick={() => console.log("teste")}
                >Evento de Elemento</button>
            </div>
        </fieldset>
        </>
    );
}

export default AnotherComponent;