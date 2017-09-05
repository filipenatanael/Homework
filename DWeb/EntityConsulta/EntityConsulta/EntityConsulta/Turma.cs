using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityConsulta
{
    public class Turma
    {

        public Turma()
        {
            Alunos = new List<Aluno>();
        }

        public int Id { get; set; }

        public string Nome { get; set; }

        public List<Aluno> Alunos{ get; set; }
    }
}
