package co.com.choucair.step;

import co.com.choucair.pageobject.ColorlibLoginPage;
import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

    ColorlibLoginPage colorlibLoginPage;

    @Step
    public void abrirUrl() {
        colorlibLoginPage.open();
    }

    @Step
    public void login_colorlib(String strUsuario, String strPass) {
        colorlibLoginPage.IngresarDatos(strUsuario, strPass);
        colorlibLoginPage.VerificarHome();
    }

    @Step
    public void verificarHome(){
        colorlibLoginPage.VerificarHome();
    }
}
