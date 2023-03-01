


const List = () => {
    
    const itens = [
        {id: 1, nome: "mateus"},
        {id: 2, nome: "caio"},
        {id:3 , nome: "marcelo"},
        {id:4 , nome: "Pedro"},
        {id:5 , nome: "mafalda"}
    ]

    return (
        <>
        <div>
            <h4>Listas em React</h4>
            {itens.map((itens) => (
            <>
            <p key={itens.id}>
                ID: {itens.id} - Nome: {itens.nome}
            </p>
            </>
            ))}
            <br/>
        </div>
        </>
    )
}

export default List;