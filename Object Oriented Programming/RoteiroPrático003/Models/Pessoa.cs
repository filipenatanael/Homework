using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003.Models
{
    public class Pessoa
    {
        public string Nome { get; set; }
        public string DataDeNascimento { get; set; }
        public Endereco Endereco { get; set; }
        public string Raca { get; set; }
        public string Genero { get; set; }
        public string EStadoCivil { get; set; }
        public string CPF { get; set; }
        public string RG { get; set; }
        public string Curso { get; set; }
        public string DataDeMatricula { get; set; }
        public double Notas { get; set; }
        public string DataDeAdmissao { get; set; }
        public string Disciplina { get; set; }

        public void toString()
        {
            Console.WriteLine("\n\t\tNome: " + Nome + "\n\t\tData de Nascimento: " + DataDeNascimento + "\n\t\tEndereço: " + Endereco + "\n\t\tRaça: " + Raca +
                             "\n\t\tGenero: " + Genero + "\n\t\tEstado Cívil: " + EStadoCivil + "\n\t\tCPF: " + CPF + "\n\t\tRG: " + RG +
                             "\n\t\tCurso: " + Curso + "\n\t\tData da matricula: " + DataDeMatricula + "\n\t\tNota: " + Notas);
        }
    }
}
