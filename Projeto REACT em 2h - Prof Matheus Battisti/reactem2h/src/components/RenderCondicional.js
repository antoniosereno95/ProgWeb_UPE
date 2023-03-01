

const RenderCondicional = (props) => {

    //Render condicional funciana da seguinte forma: voce coloca um condicional de JS, e , se ele for verdadeiro a estrutura html que estiver apos o E comercial(&& => AND). Pode-se verificar diversas coisas dentro do condicional, como operaçoes de verdadiero e falso entre outras coisaa mais.
    const x = 10;

    return (
        <>
        <fieldset>
            <div>
                <h4>Render condiconal</h4>
                <p> X = {x}</p>
                {x > 5 && <p>X é maior que 5!</p>}{/*Aqui temos um exemplo de renderizaçao condicional somente com uma estrutura de if padrao */}

                <hr/>

                <p>Render condicional com if/else</p>
                <p> Y = {props.y}</p>
                {props.y > 2 ? <p>Y é maior que dois</p> : <p>Y é menor que dois</p>}

            </div>
        </fieldset>
        </>
    );
}

export default RenderCondicional;