import axios from 'axios';

const api = axios.create({
    baseURL: 'http://ec2-15-228-60-95.sa-east-1.compute.amazonaws.com',
});

export default api;