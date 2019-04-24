using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003.Models
{
    public class Endereco
    {
        public string Logradouro { get; set; }
        public string Numero { get; set; }
        public string Complemento { get; set; }
        public string Bairro { get; set; }
        public string Cidade { get; set; }
        public string Estado { get; set; }
        public string CEP { get; set; }

        public void AtribuirEndereco()
        {
            /*
             * 
             * Atribuir informações sobre o endereço.
             *
            */
            Console.WriteLine("\t\tInforme o Logradouro: ");
            Console.Write("\t\t");
            this.Logradouro = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Numero: ");
            Console.Write("\t\t");
            this.Numero = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Complemento: ");
            Console.Write("\t\t");
            this.Complemento = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Bairro: ");
            Console.Write("\t\t");
            this.Bairro = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Cidade: ");
            Console.Write("\t\t");
            this.Cidade = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Estado: ");
            Console.Write("\t\t");
            this.Estado = Console.ReadLine();

            Console.WriteLine("\t\tInforme o CPF: ");
            Console.Write("\t\t");
            this.CEP = Console.ReadLine();
        }

    }
}
