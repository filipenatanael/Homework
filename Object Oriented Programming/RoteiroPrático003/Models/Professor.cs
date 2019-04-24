using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003.Models
{
    public class Professor : Pessoa
    {

        private List<Pessoa> disciplinas = new List<Pessoa>();
        private Pessoa professor;

        public void AdicionarProfessor()
        {
            professor = new Pessoa();

            Console.WriteLine("\t\tInforme o nome do Professor: ");
            Console.Write("\t\t");
            professor.Nome = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Data de nascimento: ");
            Console.Write("\t\t");
            professor.DataDeNascimento = Console.ReadLine();

            professor.Endereco.AtribuirEndereco();

            Console.WriteLine("\t\tRaça: ");
            Console.Write("\t\t");
            professor.Raca = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Gênero M/F: ");
            Console.Write("\t\t");
            professor.Genero = Console.ReadLine();

            Console.WriteLine("\t\tInforme o Estado Civil: ");
            Console.Write("\t\t");
            professor.EStadoCivil = Console.ReadLine();

            Console.WriteLine("\t\tInforme o CPF: ");
            Console.Write("\t\t");
            professor.CPF = Console.ReadLine();

            Console.WriteLine("\t\tInforme o RG: ");
            Console.Write("\t\t");
            professor.RG = Console.ReadLine();

            if (CPFValidator(professor.CPF) == null)
            {
                disciplinas.Add(professor);
                Console.WriteLine("\t\tCadastro efetuado com sucesso!");
            }
            else
            {
                Console.WriteLine("\t\tCPF digitado ja cadastro!");
            }
            Console.ReadKey();
        }

        public void AdicionarDisciplina()
        {
            Console.WriteLine("\t\tInforme a aisciplina: ");
            Console.Write("\t\t");
            professor.Disciplina = Console.ReadLine();

            Console.WriteLine("\t\tData de Admissão: ");
            Console.Write("\t\t");
            professor.DataDeAdmissao = Console.ReadLine();

            disciplinas.Add(professor);
            Console.ReadKey();
        }

        private object CPFValidator(string cpf)
        {
            foreach (Pessoa pessoa in disciplinas)
            {
                if (pessoa.CPF == cpf)
                {
                    return pessoa;
                }
            }
            return null;
        }

        public void ListarProfessor()
        {
            Console.WriteLine("\t\tNome: " + professor.Nome + "\n\t\tData de Nascimento: " + professor.DataDeNascimento + "\n\t\tEndereço: " + professor.Endereco +
                               "\n\t\tRaça: " + professor.Raca + "\n\t\tGenero: " + professor.Genero + "\n\t\tEstado Cívil: " + professor.EStadoCivil +
                               "\n\t\tCPF: " + professor.CPF + "\n\t\tRG: " + professor.RG + "\n\t\tDisciplina: " + professor.Disciplina +
                               "\n\t\tData de admissão: " + professor.DataDeAdmissao);
            Console.ReadKey();
        }

    }
}
