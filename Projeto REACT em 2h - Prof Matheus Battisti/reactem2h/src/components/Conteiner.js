


const Conteiner = ({ children }) => {

    //O conceito de ocnteiner é o seguinte: iremos utilizar uma funçao do react como se fosse uma estrutura normal do HTML, podendo assim, organizar melhor as coisas em tele e ter algumas configuraçoes, principalmente sobre CSS, em um só lugar! assim, nao precisanod configurar elemento por elemento, mesmo sabendo que é sim necessario criar layouts pra todas as estruturas HTML esxistentes usando um CSS basicão.
    //AI agora com a desestruturaçao das props recebidas pela funcao Conteiner, nesse caso utilizaremos a props "children" para que possamos colocar indeterminadas coisas dentro do conteiner sem preocupaçoes maiores.
    //--->>> Sem a utilizacao da propriedade CHILDREN o conteiner nao consegue "abraçar" nem exibir os componentes comportados dentro dele.
    //-->ai desse jeito, usando o children, as estruturas HTML colocadas dentro da funcao conteiner podem ser implementadas ou alocadas diretamente no arquivo do App.js, oq é otimo e otimizado em determinadas situaçoes. Uma dessas situaçoes é de um formulario de login onde eu quero eu toda sua estrutura fique centralizada na tela, ai eu faço uma funçao login, sem me preocupar com o css dela, e apartir do momento em que eu coloco a estruturaçao do login dentro do conteiner, a funcao login vai absolver todas as propriedades CSS ja setadas na funçao Conteiner

    return (
        <>
        <fieldset>
            <div className="conteiner">
                {children}
            </div>
        </fieldset>
        </>
    );
}

export default Conteiner;