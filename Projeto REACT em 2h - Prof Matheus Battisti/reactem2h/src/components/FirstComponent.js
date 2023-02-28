

function FirstComponent() {//algum comentario.

    return (
        <>
        <fieldset>
            <div className="firstcomponent">
                <p>Primeiro Componente</p>
                {/* Algum comentario em JSX*/}
                <label htmlFor="name">Nome:</label>
                <input type="text" name="name" />
                <br/><br/>
                <label htmlFor="sobrenome">Sobrenome:</label>
                <input type="text" name="sobrenome"/>
            </div>
        </fieldset>
        </>
    );
}

export default FirstComponent;