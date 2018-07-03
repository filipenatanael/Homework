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

            var ctx = new Contexto();


            /*
            var customer = new Customer();
            customer.Name = "Carlos dos santos";
            

            ctx.Customers.Add(customer);
            ctx.SaveChanges();
            */

            var consult = ctx.Customers.Where(employee => employee.Name == "Carlos dos santos");

            foreach (Customer C in consult)
            {
                Console.WriteLine(C.Name + ' ' + C.PhoneNumber + ' ' + C.Email);
                Console.ReadKey();
            }





            /*
            var aluno = new Aluno() { Nome = "Jose Antonio", DataNascimento = new DateTime(1979, 06, 27), ValorMensalidade = 2000, TurmaId = 2};
            var ctx = new Contexto();
            ctx.Alunos.Add(aluno);
            ctx.SaveChanges();
            */



        }
        
       



    }
}
