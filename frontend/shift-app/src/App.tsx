import React from "react";
import ReactDOM from "react-dom";
import { useForm } from "react-hook-form";

import "./App.css";

interface IFormInputs {
  firstName: string;
  lastName: string;
  isDeveloper: boolean;
  email: string;
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
      <form onSubmit={handleSubmit(onSubmit)}>
        <div>
          <label>First Name</label>
          <input {...register("firstName")} placeholder="Kotaro" />
          {errors?.firstName && <p>{errors.firstName.message}</p>}
        </div>

        <div>
          <label>Last Name</label>
          <input {...register("lastName")} placeholder="Sugawara" />
        </div>

        <div>
          <label htmlFor="isDeveloper">Is an developer?</label>
          <input
            type="checkbox"
            {...register("isDeveloper")}
            placeholder="luo"
            value="yes"
          />
        </div>

        <div>
          <label htmlFor="email">Email</label>
          <input
            {...register("email")}
            placeholder="bluebill1049@hotmail.com"
            type="email"
          />
        </div>
        <input type="submit" />
      </form>
    </div>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);

export default App;
