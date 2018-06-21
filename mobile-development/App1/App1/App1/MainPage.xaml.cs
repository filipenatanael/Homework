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
            Moedas.Add("Dolar");
            Moedas.Add("Euro");
            Moedas.Add("Peso Argentino");
            Moedas.Add("Libra Esterlina");
            Moedas.Add("Bitcoin");

            pickerMoedaDesejada.ItemsSource = Moedas;
        }

        public void OnItemSelected(object sender, EventArgs e)
        {
            Picker primaryKey = (Picker)sender;
            Entry entryMoeda = this.FindByName<Entry>("entryMoeda");

            if (primaryKey.SelectedIndex != -1 && primaryKey.SelectedIndex > 0)
            {
                if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Dolar"))
                {
                    entryMoeda.Text = "USD";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Euro"))
                {
                    entryMoeda.Text = "EUR";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Peso Argentino"))
                {
                    entryMoeda.Text = "ARS";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Libra Esterlina"))
                {
                    entryMoeda.Text = "GBP";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("Bitcoin"))
                {
                    entryMoeda.Text = "BTC";
                }
            }
        }

        public void Calcular(object sender, EventArgs e)
        {
            Entry entryMoeda = this.FindByName<Entry>("entryMoeda");
            Entry entryValor = this.FindByName<Entry>("entryValorEmReais");
            Entry resultado = this.FindByName<Entry>("resultado");
            Picker pickerMoedaDesejada = this.FindByName<Picker>("pickerMoedaDesejada");



        }


    }
}
