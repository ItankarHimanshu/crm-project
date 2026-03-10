import {useEffect,useState} from "react";
import API from "../api/api";

function Sales(){

  const [sales,setSales] = useState([]);

  const load = async()=>{

    const res = await API.get("/sales");

    setSales(res.data);
  };

  useEffect(()=>{
    load();
  },[]);

  return(

    <div>

      <h2>Sales</h2>

      {sales.map(s=>(
        <p key={s.id}>{s.amount}</p>
      ))}

    </div>
  );
}

export default Sales;