using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MyFirstAPI2.Models
{
    public class Laboratory
    {

        public Laboratory() {
             
        }
        
        public int Id { get; set; }
   
        public string Nome { get; set; }

        public List<Software> listOfSoftwares { get; set; }
    }
}