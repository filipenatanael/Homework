using RoteiroPrático003.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoteiroPrático003
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Estudante estudante = new Estudante();
            Faculdade faculdade = new Faculdade();
            Professor professor = new Professor();

            ConsoleKeyInfo opcao;

            do
            {
                Console.WriteLine("\n\t\t\tOpção para estudantes " +
                     "\n\n\t\t[F1] Adicioanr um estudante " +
                     "\n\t\t[F2] Mostrar dados dos estudantes " +
                     "\n\t\t[F3] Adicioanar uma nova disciplina para estudante" +
                     "\n\t\t[F4] Calcular Nota do aluno " +
                     "\n\n\t\t\tOpção do professor" +
                     "\n\n\t\t[F5] Adicionar professor " +
                     "\n\t\t[F6] Mostrar dados do professor" +
                     "\n\t\t[F7] Adicionar uma nova disciplina para o professor" +
                     "\n\t\t[F8] Adicionar Nota para p estudante " +
                     "\n\t\t[F10] Unidades/Faculdades cadastradas " +
                     "\n\t\t[ESC] Sair do programa");
                opcao = Console.ReadKey();
                Console.Clear();
                if (opcao.Key == ConsoleKey.F1)
                {
                    estudante.CadastrarAluno();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F2)
                {
                    estudante.ListarEstudantes();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F3)
                {
                    estudante.AdicionarDisciplinaParaOEstudante();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F5)
                {
                    professor.AdicionarProfessor();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F6)
                {
                    professor.ListarProfessor();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F7)
                {
                    professor.AdicionarDisciplina();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F8)
                {
                    estudante.AtribuirNotas();
                    Console.Clear();
                }

                if (opcao.Key == ConsoleKey.F10)
                {
                    faculdade.ListarCampus();
                    Console.Clear();
                }

            } while (opcao.Key != ConsoleKey.Escape);
        }
    }
}
