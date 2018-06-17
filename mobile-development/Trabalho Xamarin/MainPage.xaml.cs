using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Trabalho01
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();

            Picker pkParcelas = this.FindByName<Picker>("pkParcelas");
            List<string> Parcelas = new List<string>();
            Parcelas.Add("12");
            Parcelas.Add("24");
            Parcelas.Add("36");
            Parcelas.Add("48");
            Parcelas.Add("50");
            Parcelas.Add("62");

            pkParcelas.ItemsSource = Parcelas;
        }

        public void OntemSelected(object sender, EventArgs e)
        {
            Picker primaryKey = (Picker)sender;
            Entry entryTaxa = this.FindByName<Entry>("entryTaxa");

            if (primaryKey.SelectedIndex != -1 && primaryKey.SelectedInde > 0)
            {
                if (primaryKey.Items[primaryKey.SelectedIndex].Equals("12") || primaryKey.Items[primaryKey.SelectedIndex].Equals("24"))
                {
                    entryTaxa.Text = "0.02%";
                }
                else if (primaryKey.Items[primaryKey.SelectedIndex].Equals("36") || primaryKey.Items[primaryKey.SelectedIndex].Equals("48"))
                {
                    entryTaxa.Text = "0.04%";
                }
                else
                {
                    entryTaxa.Text = "0.06%";
                }
            }
        }

        public void Calcular(object sender, EventArgs e)
        {
            Entry entryValor = this.FindByName<Entry>("entryValor");
            Picker pkParcelas = this.FindByName<Picker>("pkParcelas");
            Entry entryTaxa = this.FindByName<Entry>("entryTaxa");
            Entry resultado = this.FindByName<Entry>("resultado");
            Double montante = 0, valor = 0, taxa = 0, parcelas = 0;

            if (entryValor.Text != null && !entryValor.Text.Equals("") && pkParcelas.SelectedIndex != -1
                && entryTaxa.Text != null && !entryTaxa.Text.Equals(""))
            {
                valor = Convert.ToDouble(entryValor.Text);
                taxa = Convert.ToDouble(entryTaxa.Text.Replace(" %", ""));
                parcelas = Convert.ToDouble(pkParcelas.SelectedItem);
                montante = valor * Math.Pow(1 + taxa, parcelas);

                resultado.Text = Convert.ToString(montante);
            }
            else
            {
                DisplayAlert("Atenção: ", "Preenchar todos os campos", "OK");
            }
        }

    }
}
