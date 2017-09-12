using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityConsulta
{
    public class Contexto : DbContext
    {

        public Contexto():base("conexao")
        {}

        public DbSet<Aluno> Alunos { get; set; }

        public DbSet<Turma> Turmas { get; set; }
    }
}
