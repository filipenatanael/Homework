using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003.Models
{
    public class Faculdade : Pessoa
    {
        private List<Faculdade> Campus = new List<Faculdade>();

        public void ListarCampus()
        {
            Faculdade campus1 = new Faculdade()
            {
                Nome = "FUMEC",
                Endereco = "R. Cobre, 200 - Cruzeiro, Belo Horizonte - MG, 30310-190",
                Curso = "Gestão da Tecnologia da Informação," + " Psicologia e" + " Ciência da Computação",
            };

            Faculdade campus2 = new Faculdade()
            {
                Nome = "UNA Barro Preto",
                Endereco = "Rua dos Goitacazes, 1159 - Barro Preto, Belo Horizonte - MG, 30190-051",
                Curso = "Sistema da Informação," + " Redes e" + " ADS",
            };

            Campus.Add(campus1);
            Campus.Add(campus2);

            Console.WriteLine("\t\tCampus: ");
            Console.WriteLine("\n\n\t" + campus1.Nome + ":\n\tCursos:" + campus1.Curso + "\n\t|" + campus1.Endereco +
                              "\n\n\t" + campus2.Nome + ":\n\tCursos:" + campus2.Curso + "\n\t|" + campus2.Endereco);
            Console.ReadKey();
        }
    }
}
