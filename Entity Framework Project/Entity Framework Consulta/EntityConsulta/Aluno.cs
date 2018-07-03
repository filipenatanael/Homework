using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityConsulta
{
    public class Aluno
    {
        public int Id { get; set; }

        public string Nome { get; set; }

        public DateTime DataNascimento { get; set; }

        public decimal ValorMensalidade { get; set; }

        public int TurmaId { get; set; }

        public Turma Turma { get; set; }

    }
}
