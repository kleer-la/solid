using System;

namespace OCP.StarbuzzCoffee.Model
{
    public class Expresso : Beverage
    {
        public override Decimal GetCost()
        {
            return 5m;
        }
    }
}