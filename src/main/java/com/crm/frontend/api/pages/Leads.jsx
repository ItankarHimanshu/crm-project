import { useEffect,useState } from "react";
import API from "../api/api";

function Leads(){

  const [leads,setLeads] = useState([]);

  const load = async()=>{

    const res = await API.get("/leads");

    setLeads(res.data);
  };

  useEffect(()=>{
    load();
  },[]);

  return(

    <div>

      <h2>Leads</h2>

      {leads.map(l=>(
        <p key={l.id}>{l.name}</p>
      ))}

    </div>
  );
}

export default Leads;