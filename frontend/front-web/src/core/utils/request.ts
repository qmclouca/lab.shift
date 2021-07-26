import axios, { AxiosRequestConfig } from 'axios';

const BASE_URL = 'http://localhost:8080';

//interceptar requisições não autorizadas
axios.interceptors.response.use(function(response) {
    return response;
}, function (error) { //qualquer status fora do código 2XX
    return Promise.reject(error);
});

export const makeRequest = (params: AxiosRequestConfig) => {
    return axios({
        ...params,
        baseURL: BASE_URL
    });
}