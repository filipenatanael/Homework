using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using App1.Model;
namespace App1.Services
{
    public class CotacaoService
    {
        private HttpClient _client = new HttpClient();
        private List<Cotacao> _cotacao;
        public async Task<List<Cotacao>> GetCotacaoAsync(int _userId)
        {
            string url = string.Format("http://http://jsonplaceholder.typicode.com/users/" + _cotacao);
            if (_cotacao <= 0)
            {
                return null;
            }
            else
            {
                var response = await _client.GetAsync(url);
                if (response.StatusCode == HttpStatusCode.NotFound)
                {
                    _cotacao = new List<Cotacao>();
                }
                else
                {
                    var content = await response.Content.ReadAsStringAsync();
                    var usuarios = JsonConvert.DeserializeObject<List<Cotacao>>(content);
                    _cotacao = new List<Cotacao>(usuarios);
                }
                return _cotacao;
            }
        }
        public async Task<List<Cotacao>> GetUsuariosAsync()
        {
            try
            {
                string url = string.Format("http://jsonplaceholder.typicode.com/users/");
                var response = await _client.GetAsync(url);
                if (response.StatusCode == HttpStatusCode.NotFound)
                {
                    _cotacao = new List<Cotacao>();
                }
                else
                {
                    var content = await response.Content.ReadAsStringAsync();
                    var usuarios = JsonConvert.DeserializeObject<List<Cotacao>>(content);
                    _cotacao = new List<Cotacao>(usuarios);
                }
                return _cotacao;
            }
            catch (Exception ex)
            {
                throw ex;
            }
        }
    }
}