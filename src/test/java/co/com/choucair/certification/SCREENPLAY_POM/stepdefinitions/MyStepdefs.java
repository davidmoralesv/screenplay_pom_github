package co.com.choucair.certification.SCREENPLAY_POM.stepdefinitions;

import co.com.choucair.certification.SCREENPLAY_POM.step.PopupValidationSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class MyStepdefs {

    @Steps
    PopupValidationSteps popupValidationSteps;

    @Dado("que Andres ingresa a la app XTTT")
    public void queAndresIngresaALaAppXTTT() {
        popupValidationSteps.abrirUrl();
    }

    @Entonces("verifica que pudo ingresar correctamente")
    public void verificaQuePudoIngresarCorrectamente() {
        popupValidationSteps.verificarHome();
    }

    @Cuando("digita sus credenciales e ingresa a la app")
    public void digitaSusCredencialesEIngresaALaApp(List<List<String>> credenciales) {
        popupValidationSteps.login_colorlib(credenciales.get(0).get(0), credenciales.get(0).get(1));
    }
}
