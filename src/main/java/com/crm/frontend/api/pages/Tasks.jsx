import {useEffect,useState} from "react";
import API from "../api/api";

function Tasks(){

  const [tasks,setTasks] = useState([]);

  const load = async()=>{

    const res = await API.get("/tasks");

    setTasks(res.data);
  };

  useEffect(()=>{
    load();
  },[]);

  return(

    <div>

      <h2>Tasks</h2>

      {tasks.map(t=>(
        <p key={t.id}>{t.title}</p>
      ))}

    </div>
  );
}

export default Tasks;