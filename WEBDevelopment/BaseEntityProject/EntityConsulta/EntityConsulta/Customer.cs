using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityConsulta
{
    public class Customer
    {

        public Customer()
        {
            listOfOrders = new List<Order>();
        }

        public int Id { get; set; }
        public string Name { get; set; }
        public int ZipCode { get; set; }
        public string Email { get; set; }
        public string PhoneNumber { get; set; }

        public List<Order> listOfOrders { get; set; }




    }
}
