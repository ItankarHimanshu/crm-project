import { useEffect, useState } from "react";
import API from "../api/api";

function Customers() {

  const [customers,setCustomers] = useState([]);
  const [name,setName] = useState("");

  const loadCustomers = async () => {

    const res = await API.get("/customers");

    setCustomers(res.data);
  };

  const addCustomer = async () => {

    await API.post("/customers",{name});

    loadCustomers();
  };

  useEffect(()=>{
    loadCustomers();
  },[]);

  return (

    <div>

      <h2>Customers</h2>

      <input
        placeholder="Customer name"
        onChange={(e)=>setName(e.target.value)}
      />

      <button onClick={addCustomer}>Add</button>

      <ul>

        {customers.map(c => (
          <li key={c.id}>{c.name}</li>
        ))}

      </ul>

    </div>
  );
}

export default Customers;