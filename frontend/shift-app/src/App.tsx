import React from "react";
import { useEffect } from "react";
import ReactDOM from "react-dom";
import { useForm } from "react-hook-form";

import "./App.css";

interface IFormInputs {
  name: string;
  doctor: string;
  healthInsurance: string;
  collectPost: string;
  
}

const App = () => {
  const {
    register,
    handleSubmit,
    formState: { errors }
  } = useForm<IFormInputs>();

   const onSubmit = (data: IFormInputs) => {
    alert(JSON.stringify(data)); //Axios send point
  };

  useEffect(() => {
    fetch('http://localhost:3000/doctors')
      .then(responseDoctors => responseDoctors.json())
      .then(responseDoctors => console.log(responseDoctors));      
    fetch('http://localhost:3000/patients')
      .then(responsePatients => responsePatients.json())
      .then(responsePatients => console.log(responsePatients));
    fetch('http://localhost:3000/collectionposts')
      .then(responseCollectionPosts => responseCollectionPosts.json())
      .then(reponseCollectionPosts => console.log(reponseCollectionPosts));
    }, []);

  return (
    <div className="App">
      <div className= "title1">
        <h1>Cadastro de Ordens de Serviços</h1>
      </div>
      <form onSubmit={handleSubmit(onSubmit)}>
        <div>
          <label>Cliente:</label>
          <input {...register("name", {required: true})} placeholder="Nome Completo do Paciente" />
          {errors?.name && <p>{errors.name.message}</p>}
        </div>

        <div>
          <label>Médico:</label>
          <input {...register("doctor", {required: true})} placeholder="Nome Completo do Médico solicitante" />
          {errors?.doctor && <p>{errors.doctor.message}</p>}
        </div>
      
        <div>
          <label>Convênio:</label>
          <input {...register("healthInsurance", {required: true})} placeholder="Plano de saúde do cliente" />
          {errors?.healthInsurance && <p>{errors.healthInsurance.message}</p>}
        </div>

        <div>
          <label>Posto de coleta:</label>
          <input {...register("collectPost", {required: true})} placeholder="Descrição do posto de coleta (ex: Nome do posto)" />
          {errors?.collectPost && <p>{errors.collectPost.message}</p>}
        </div>
       
        <input type="submit"  />
      </form>
    </div>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);

export default App;
