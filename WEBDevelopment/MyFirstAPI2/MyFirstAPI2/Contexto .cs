using MyFirstAPI2.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace MyFirstAPI2
{
    public class Contexto : DbContext
    {
        public Contexto() : base("DadosConexao") { }

        
    }
}