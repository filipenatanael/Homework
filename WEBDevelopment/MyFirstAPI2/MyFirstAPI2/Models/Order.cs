using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MyFirstAPI2.Models
{
    public class Order
    {

        public int Id { get; set; }
        public string Name { get; set; }

        public int CustomerId { get; set; }

        public Customer Customer { get; set; }
    }
}