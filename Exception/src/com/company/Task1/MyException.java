package com.company.Task1;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "MyException getMessage();";
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}



   /*
   $x("//*[@title='Contact Us']")
   $("#Contact Us")

   $x("//*[@name='submit_search']")
   $"[class=\"btn btn-default button-search\"]"

   $x("//*[@class='icon-phone']")
   $("[class='icon-phone']")

   $x("//*[@class='shop-phone']")
   $x("//*[@class='shop-phone']")

   $x("//*[@title='Women']")
   $("#Women")

   $x("//*[@class='sf-with-ul']")
   $("[class='sf-with-ul']")

   $x("//*[@title='T-shirts']")
   $("#T-shirts")

   $x("//*[@id='search_query_top']")
   $("#search_query_top")

   $x("//*[@class='page-heading']")
   x("[class='page-heading']")

   $x("//*[@class='page-subheading']")
   $("[class='page-subheading']")

   $x("//*[@id='email']")
   $("#email")

   $x("//*[@id='passwd']")
   $("#passwd")

   $x("//*[@class='icon-lock left']")
   $("[class='icon-lock left']")

   $x("//*[@title='Recover your forgotten password']")
   $("#Recover your forgotten password")

   $x("//*[@for='email']")
   $("[for='email']")

   $x("//*[@for='passwd']")
   $("[for='passwd']")

   $x("//*[@for='email_create']")
   $("[for='email_create']")

   $x("//*[@id='email_create']")
   $("#email_create")

   $x("//*[@class='icon-user left']")
   $("[class='icon-user left']")

   x("//*[@title='View my shopping cart']")
   $("#View my shopping cart")

   $x("//*[@class='img-responsive']")
   $("[class='img-responsive']")

   $x("//*[@class='logo img-responsive']")
   $("[class='logo img-responsive']")

   $x("//*[@class='col-sm-4 clearfix']")
   $("[class='col-sm-4 clearfix']")

   $x("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")
   $("[class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']")

   $x("//*[@class='navigation-pipe']")
   $("[class='navigation-pipe']")

   $x("//*[@class='col-xs-12 col-sm-6']")
   $("[class='col-xs-12 col-sm-6']")

   $x("//*[@id='newsletter-input']")
   $("#newsletter-input")

   $x("//*[@class='form-group']")
   $("[class='form-group']")

   $x("//*[@class='icon-map-marker']")
   $("[class='icon-map-marker']")
































    */






