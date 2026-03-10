import { Link } from "react-router-dom";

function Navbar() {

  return (
    <div style={{padding:20, background:"#333", color:"#fff"}}>

      <Link to="/dashboard" style={{marginRight:10}}>Dashboard</Link>
      <Link to="/customers" style={{marginRight:10}}>Customers</Link>
      <Link to="/leads" style={{marginRight:10}}>Leads</Link>
      <Link to="/tasks" style={{marginRight:10}}>Tasks</Link>
      <Link to="/sales">Sales</Link>

    </div>
  );
}

export default Navbar;