using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityConsulta
{
    class Program
    {
        static void Main(string[] args)
        {

            var turma = new Turma()
            {
                Nome = "ADSBPAN2B"
            };
            
            turma.Alunos.Add(new Aluno()
            {
                Nome = "Alex Sales",
                DataNascimento = new DateTime(1989, 06,27),
                ValorMensalidade = 1500
            });

            turma.Alunos.Add(new Aluno()
            {
                Nome = "Julio Oliveira",
                ValorMensalidade = 2498,
                DataNascimento = new DateTime(1984, 7, 10),                
            });

            var ctx = new Contexto();
            ctx.Turmas.Add(turma);

            ctx.SaveChanges();

        }
    }
}
