using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace App1
{
	public partial class MainPage : ContentPage
	{
		public MainPage()
		{
			InitializeComponent();

            Picker pickerMoedaDesejada = this.FindByName<Picker>("pickerMoedaDesejada");
            List<string> Moedas = new List<string>();
            Moedas.Add("USD");
            Moedas.Add("EUR");
            Moedas.Add("ARS");
            Moedas.Add("GBP");
            Moedas.Add("BTC");

            pickerMoedaDesejada.ItemsSource = Moedas;
        }

        public void OnItemSelected(object sender, EventArgs e)
        {
            Picker primaryKey = (Picker)sender;
            Entry entryValor = this.FindByName<Entry>("entryValorEmReais");

            if (primaryKey.SelectedIndex != -1 && primaryKey.SelectedIndex > 0)
            {
                if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Dolar"))
                {
                    entryValor.Text = "USD";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Euro"))
                {
                    entryValor.Text = "EUR";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Peso Argentino"))
                {
                    entryValor.Text = "ARS";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Libra Esterlina"))
                {
                    entryValor.Text = "GBP";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Betcoin"))
                {
                    entryValor.Text = "BTC";
                }
            }
        }


    }
}
