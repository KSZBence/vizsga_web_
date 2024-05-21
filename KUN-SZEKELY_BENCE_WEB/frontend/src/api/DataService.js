import axios from "axios";
export default class DataService {
  apiroot = "http://localhost:8000/api/";
  get(link, callback) {
    axios
      .get(this.apiroot+link)
      .then(function (response) {
        callback(response)
      })
      .catch(function (error) {
        console.log(error);
      })
      .finally(function () {
      });
  }
}
