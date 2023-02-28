import Images from "./Images";
import dog from '../assets/dachshund-720p.jpg'
import morar from '../assets/sunrise-portugal-lisbon.jpg'

const AnotherComponent = () => {

    const handleClickMorar = () => {
        console.log("hueheu");
    }

    return (
        <>
        <fieldset>
            <div>
                <p>Another Componente</p>
                <button
                onClick={handleClickMorar}
                >Veja onde eu vou MORAR</button>
                <br/>
                <img src={morar} alt="portugal ao nascer do sol"></img>

                <hr></hr>

                <button 
                onClick={() => console.log("teste")}
                >Veja qual sera meu PET</button>
                <br/>
                <img src={dog} alt="dogue"></img>
                
                <hr></hr>

                
            </div>
        </fieldset>
        </>
    );
}

export default AnotherComponent;