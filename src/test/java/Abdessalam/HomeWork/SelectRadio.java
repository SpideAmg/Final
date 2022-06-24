package Abdessalam.HomeWork;

import AbdessalamPages.ShittyPage;
import base.CommonAPI;
import org.testng.annotations.Test;

    public class SelectRadio extends CommonAPI {
        @Test
        public void SelectRadio() {
            ShittyPage ShittyPage = new ShittyPage(getDriver());

            ShittyPage.selectRadio1();
            waitFor(2);
            ShittyPage.selectRadio2();
            waitFor(2);
            ShittyPage.selectRadio3();
            waitFor(2);




        }
    }