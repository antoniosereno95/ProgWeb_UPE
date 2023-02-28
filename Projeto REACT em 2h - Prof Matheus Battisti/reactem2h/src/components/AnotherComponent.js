import { useState } from 'react';
import dog from '../assets/dachshund-720p.jpg'
import morar from '../assets/sunrise-portugal-lisbon.jpg'

const AnotherComponent = () => {

    const [imagem , setImagem] = useState();
    const [imagem2 , setImagem2] = useState();

    const handleClickMorar = () => {
       if(imagem === morar){
        setImagem();
       }else{
         setImagem(morar)
       }
       
    }
    const handleClickPet = () => {
        if(imagem2 === dog){
            setImagem2();
           }else{
             setImagem2(dog)
           }
    }

    return (
        <>
        <br/>
        <fieldset>
            <div>
                <hr></hr>
                <p>Fotinhas</p>
                <hr></hr>
                <button
                onClick={handleClickMorar}
                >Veja onde eu vou MORAR</button>
                <br/>
                <img src={imagem}></img>

                <hr></hr>

                <button 
                onClick={handleClickPet}
                >Veja qual sera meu PET</button>
                <br/>
                <img src={imagem2}></img>

                <hr></hr>

                
            </div>
        </fieldset>
        </>
    );
}

export default AnotherComponent;