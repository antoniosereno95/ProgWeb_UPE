

const RenderCondicional = () => {

    //Render condicional funciana da seguinte forma: voce coloca um condicional de JS, e , se ele for verdadeiro a estrutura html que estiver apos o E comercial(&& => AND). Pode-se verificar diversas coisas dentro do condicional, como operaçoes de verdadiero e falso entre outras coisaa mais.
    const x = 10;

    return (
        <>
            <div>
                <h4>Render condiconal</h4>
                {x > 5 && <p>X é maior que 5!</p>}
            </div>
        </>
    );
}

export default RenderCondicional;