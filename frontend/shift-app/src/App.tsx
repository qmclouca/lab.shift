import { useState } from "react";
import { useEffect } from "react";
import ReactDOM from "react-dom";
import { useForm } from "react-hook-form";
import "./App.css";
import { makeRequest } from './core/utils/request';
import { Doctor } from './core/types/Doctor';
import { Patient } from './core/types/Patient';
import { ServiceOrder } from './core/types/ServiceOrder';

interface IFormInputs {
  name: string;
  doctor: string;
  healthInsurance: string;
  collectPost: string; 
}


const App = () => {
  
  const [doctorResponse, setDoctorResponse] = useState<Doctor>();
  const [patientResponse, setPatientResponse] = useState<Patient>();
  const [serviceOrderResponse, setServiceOrderResponse] = useState<ServiceOrder>();

  const {
    register,
    handleSubmit,
    formState: { errors }
  } = useForm<IFormInputs>();

   const onSubmit = (data: IFormInputs) => {
    alert(JSON.stringify(data)); //Axios send point
  };

  console.log(doctorResponse);
  console.log(patientResponse);
  console.log(serviceOrderResponse);

  useEffect(() => {
    //inserir Query Strings aqui para passar parâmetros de consulta ou inserção no banco de dados
    makeRequest({url: '/doctors'})
      .then(responseDoctors => setDoctorResponse(responseDoctors.data));      
    makeRequest({url: '/patients'})
      .then(responsePatients => setPatientResponse(responsePatients.data));
    makeRequest({url: '/collectionposts'})
      .then(reponseServiceOrderResponse => setServiceOrderResponse(reponseServiceOrderResponse.data));
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
