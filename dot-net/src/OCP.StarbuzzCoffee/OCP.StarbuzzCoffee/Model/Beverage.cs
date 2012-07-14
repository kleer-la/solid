using System;

namespace OCP.StarbuzzCoffee.Model
{
    public abstract class Beverage
    {
        public string Description { get; set; }
        public abstract Decimal GetCost();
    }
}