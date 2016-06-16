package org.acme.insurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Policy")
@org.kie.api.definition.type.Description("Policy Object")
public class Policy implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Request Date")
   private java.util.Date requestDate;

   @org.kie.api.definition.type.Label("Policy Type")
   private java.lang.String policyType;

   @org.kie.api.definition.type.Label("Vehicle Year")
   private java.lang.Integer vehicleYear;

   @org.kie.api.definition.type.Label("Price")
   private java.lang.Integer price;

   @org.kie.api.definition.type.Label("Price Discount")
   private java.lang.Integer priceDiscount;

   @org.kie.api.definition.type.Label("Driver")
   private org.acme.insurance.Driver driver;

   public Policy()
   {
   }

   public java.util.Date getRequestDate()
   {
      return this.requestDate;
   }

   public void setRequestDate(java.util.Date requestDate)
   {
      this.requestDate = requestDate;
   }

   public java.lang.String getPolicyType()
   {
      return this.policyType;
   }

   public void setPolicyType(java.lang.String policyType)
   {
      this.policyType = policyType;
   }

   public java.lang.Integer getVehicleYear()
   {
      return this.vehicleYear;
   }

   public void setVehicleYear(java.lang.Integer vehicleYear)
   {
      this.vehicleYear = vehicleYear;
   }

   public java.lang.Integer getPrice()
   {
      return this.price;
   }

   public void setPrice(java.lang.Integer price)
   {
      this.price = price;
   }

   public java.lang.Integer getPriceDiscount()
   {
      return this.priceDiscount;
   }

   public void setPriceDiscount(java.lang.Integer priceDiscount)
   {
      this.priceDiscount = priceDiscount;
   }

   public org.acme.insurance.Driver getDriver()
   {
      return this.driver;
   }

   public void setDriver(org.acme.insurance.Driver driver)
   {
      this.driver = driver;
   }

   public String toString()
   {
      StringBuilder sBuilder = new StringBuilder("Policy =");
      sBuilder.append("\n\tpolicyType : " + policyType);
      sBuilder.append("\n\tprice : " + price);
      sBuilder.append("\n\tpriceDiscount : " + priceDiscount);
      sBuilder.append("\n\trequestDate : " + requestDate);
      sBuilder.append("\n\tvehicle year : " + vehicleYear);
      sBuilder.append("\n\tdriver : " + driver);
      return sBuilder.toString();
   }

   public Policy(java.util.Date requestDate, java.lang.String policyType,
         java.lang.Integer vehicleYear, java.lang.Integer price,
         java.lang.Integer priceDiscount, org.acme.insurance.Driver driver)
   {
      this.requestDate = requestDate;
      this.policyType = policyType;
      this.vehicleYear = vehicleYear;
      this.price = price;
      this.priceDiscount = priceDiscount;
      this.driver = driver;
   }

}