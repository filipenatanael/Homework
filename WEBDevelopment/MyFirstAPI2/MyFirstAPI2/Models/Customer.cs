using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MyFirstAPI2.Models
{
    public class Customer
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public int ZipCode { get; set; }
        public string Email { get; set; }
        public string PhoneNumber { get; set; }



        public List<Order> listOfOrders { get; set; }

       


    }
}

//public int OrderId { get; set; }
// public Order Order { get; set; }