import { useState } from "react";
import { useEffect } from "react";
import ReactDOM from "react-dom";
import "./App.css";
import { makeRequest } from './core/utils/request';
import { Doctor } from './core/types/Doctor';
import { Patient } from './core/types/Patient';
import { ServiceOrder } from './core/types/ServiceOrder';

const App = () => {
  
  const [doctorResponse, setDoctorResponse] = useState<Doctor>();
  const [patientResponse, setPatientResponse] = useState<Patient>();
  const [serviceOrderResponse, setServiceOrderResponse] = useState<ServiceOrder>();

  //As variáveis doctorResponse, patientResponse e serviceOrderResponse possuem
  //todos os dados necessários para popular o formulário com dropdowns
  //com os dados de doutores, pacientes e ordens de serviço previamente
  //cadastradas no backend
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


  const handleSubmit =  (event: React.FormEvent<HTMLFormElement>) => {
     event.preventDefault();
     const payload = {
        client: patientResponse,
        doctor: doctorResponse,
        healthInsurance: serviceOrderResponse?.healthInsurance,
        collectionPost: serviceOrderResponse?.collectionPost        
     }
     makeRequest({method:'POST', url: '/examserviceorders', data: payload})
  }

  return (
    <div className="App">
      <div className= "title1">
        <h1>Cadastro de Ordens de Serviços</h1>
      </div>
      <form onSubmit={handleSubmit}> 
        <>

        <div>
          <label>Cliente:</label>
          <input placeholder="Nome Completo do Paciente" />
        </div>

        <div>
          <label>Médico:</label>
          <input placeholder="Nome Completo do Médico solicitante" />
        </div>
      
        <div>
          <label>Convênio:</label>
          <input placeholder="Plano de saúde do cliente" />
        </div>

        <div>
          <label>Posto de coleta:</label>
          <input placeholder="Descrição do posto de coleta (ex: Nome do posto)" />
        </div>
        </>
        <input type="submit"  />
      </form>
    </div>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);

export default App;
