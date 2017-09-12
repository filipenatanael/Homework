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

            //Inicializar();
            /*
            var aluno = new Aluno() { Nome = "Jose Antonio", DataNascimento = new DateTime(1979, 06, 27), ValorMensalidade = 2000, TurmaId = 2};
            var ctx = new Contexto();
            ctx.Alunos.Add(aluno);
            ctx.SaveChanges();
            */

            Alterando();

        }
        static void Inicializar()
        {

            var turma = new Turma(){Nome = "ADSBPAN2B"};

            turma.Alunos.Add(new Aluno()
            {
                Nome = "Alex Sales",
                DataNascimento = new DateTime(1989, 06, 27),
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
        static void Alterando()
        {
            var ctx = new Contexto();
            Aluno aluno = ctx.Alunos.Single(p => p.Id == 4);
            aluno.ValorMensalidade = 3000;
            ctx.SaveChanges();
        }
  



    }
}
