using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003.Models
{
    public class Estudante : Pessoa
    {
        private List<Pessoa> Cursos = new List<Pessoa>();
        private Pessoa Pessoa;

        public void CadastrarAluno()
        {
            Pessoa = new Pessoa();

            Console.WriteLine("\t\tInforme o Nome do estudante: ");
            Console.Write("\t\t");
            Pessoa.Nome = Console.ReadLine();

            Console.WriteLine("\t\tInforme a Data de Nascimento: ");
            Console.Write("\t\t");
            Pessoa.DataDeNascimento = Console.ReadLine();

            /*
             * 
             * Atribuir informações sobre o endereço.
             *
            */
            Console.WriteLine("\t\tInforme o Logradouro: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Logradouro = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Numero: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Numero = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Complemento: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Complemento = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Bairro: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Bairro = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Cidade: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Cidade = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Estado: ");
            Console.Write("\t\t");
            Pessoa.Endereco.Estado = Console.ReadLine();

            Console.WriteLine("\t\tInforme o CPF: ");
            Console.Write("\t\t");
            Pessoa.Endereco.CEP = Console.ReadLine();

            Console.WriteLine("\t\tInforme a Raça: ");
            Console.Write("\t\t");
            Pessoa.Raca = Console.ReadLine();

            Console.WriteLine("\t\tInforme Gênero M/F: ");
            Console.Write("\t\t");
            Pessoa.Genero = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Estado Civil: ");
            Console.Write("\t\t");
            Pessoa.EStadoCivil = Console.ReadLine();

            Console.WriteLine("\t\tInforme o CPF: ");
            Console.Write("\t\t");
            Pessoa.CPF = Console.ReadLine();

            Console.WriteLine("\t\tInforme o RG: ");
            Console.Write("\t\t");
            Pessoa.RG = Console.ReadLine();

            if (CPFValidator(Pessoa.CPF) == null)
            {
                Cursos.Add(Pessoa);
                Console.WriteLine("\t\tCadastro efetuado com sucesso!");
            }
            else
            {
                Console.WriteLine("\t\tCPF já cadastro!");
            }

            Console.ReadKey();
        }

        private object CPFValidator(string cpf)
        {
            foreach (Pessoa pessoa in Cursos)
            {
                if (pessoa.CPF == cpf)
                {
                    return pessoa;
                }
            }
            return null;
        }

        public void ListarEstudantes()
        {
            foreach (Pessoa pessoa in Cursos)
            {
                pessoa.toString();
            }
            Console.ReadKey();
        }
    }
}
