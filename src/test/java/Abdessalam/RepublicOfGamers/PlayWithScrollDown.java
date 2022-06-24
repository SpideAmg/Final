package Abdessalam.RepublicOfGamers;

import AbdessalamPages.RepublicOfGamersHomePage;
import base.CommonAPI;
import org.testng.annotations.Test;

    public class PlayWithScrollDown extends CommonAPI {
        @Test
        public void ArmoryCrate() {
            RepublicOfGamersHomePage RepublicOfGamers = new RepublicOfGamersHomePage(getDriver());

            RepublicOfGamers.clickCookiesAcceptBtn();


        }

    }