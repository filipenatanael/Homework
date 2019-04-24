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

            Console.WriteLine("\t\tInsira o nome do Aluno: ");
            Console.Write("\t\t");
            Pessoa.Nome = Console.ReadLine();

            Console.WriteLine("\t\tInsira o Data de nascimento do Aluno: ");
            Console.Write("\t\t");
            Pessoa.DataDeNascimento = Console.ReadLine();

            Console.WriteLine("\t\tInsira o Endereço completo do Aluno: ");
            Console.Write("\t\t");
            Pessoa.Endereco = Console.ReadLine();

            Console.WriteLine("\t\tQual a Raça: ");
            Console.Write("\t\t");
            Pessoa.Raca = Console.ReadLine();

            Console.WriteLine("\t\tGênero M ou F: ");
            Console.Write("\t\t");
            Pessoa.Genero = Console.ReadLine();

            Console.WriteLine("\t\tEstado Civil: ");
            Console.Write("\t\t");
            Pessoa.EStadoCivil = Console.ReadLine();

            Console.WriteLine("\t\tInsira o CPF: ");
            Console.Write("\t\t");
            Pessoa.CPF = Console.ReadLine();

            Console.WriteLine("\t\tInsira o RG: ");
            Console.Write("\t\t");
            Pessoa.RG = Console.ReadLine();

            if (CPFValidator(Pessoa.CPF) == null)
            {
                Cursos.Add(Pessoa);
                Console.WriteLine("\t\tCadastro efetuado com sucesso!");
            }
            else
            {
                Console.WriteLine("\t\tCPF digitado ja cadastro!");
            }
            Console.ReadKey();
        }

        private object CPFValidator(string cPF)
        {
            throw new NotImplementedException();
        }
    }
}
