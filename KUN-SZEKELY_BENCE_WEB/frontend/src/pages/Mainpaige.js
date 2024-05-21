import DataService from "../api/DataService";
import Szo from "../components/Szo";

export default function MainPaige(props) {
    
  return (
    <div>
      <div className="navbar">
        <h2>Szótár</h2>
      </div>
      <div>
        <h3>szavak</h3>
        <label for="temak">Válassz témát:</label>

        <select name="temak" id="temak">
        <option>--válassz--</option>
        </select>
      </div>
      <div className="main">
         <div><Szo></Szo></div>
         <div><Szo></Szo></div>
      </div>
    </div>
  );
}
