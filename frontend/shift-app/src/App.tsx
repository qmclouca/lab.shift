import React from "react";
import ReactDOM from "react-dom";
import { useForm } from "react-hook-form";

import "./App.css";

interface IFormInputs {
  name: string;
  doctor: string;
  healthInsurance: string;
  collectPost: string;
}

function App() {
  const {
    register,
    handleSubmit,
    formState: { errors }
  } = useForm<IFormInputs>();

  const onSubmit = (data: IFormInputs) => {
    alert(JSON.stringify(data));
  };

  return (
    <div className="App">
      <div className= "title1">
        <h1>Cadastro de Ordens de Serviços</h1>
      </div>
      <form onSubmit={handleSubmit(onSubmit)}>
        <div>
          <label>Cliente:</label>
          <input {...register("name")} placeholder="Nome Completo do Paciente" />
          {errors?.name && <p>{errors.name.message}</p>}
        </div>

        <div>
          <label>Médico:</label>
          <input {...register("doctor")} placeholder="Nome Completo do Médico solicitante" />
          {errors?.doctor && <p>{errors.doctor.message}</p>}
        </div>

        <div>
          <label>Convênio:</label>
          <input {...register("healthInsurance")} placeholder="Plano de saúde do cliente" />
          {errors?.healthInsurance && <p>{errors.healthInsurance.message}</p>}
        </div>

        <div>
          <label>Posto de coleta:</label>
          <input {...register("collectPost")} placeholder="Descrição do posto de coleta (ex: Nome do posto)" />
          {errors?.collectPost && <p>{errors.collectPost.message}</p>}
        </div>
       
        <input type="submit" />
      </form>
    </div>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);

export default App;
