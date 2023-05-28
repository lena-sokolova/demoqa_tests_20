package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FillFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void successTest() {
        open ("/automation-practice-form");
//        executeJavaScript("$('footer').remove()");
//        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Sokolova");
        $("#userEmail").setValue("e.sokolova@example.com");
        $x("//div[text()='Female']").click();
        $("#userNumber").setValue("8900707070");
        $("#dateOfBirthInput").click();

        $("#submit").click();

        $("#userName").shouldHave(text(""));
        $("#userName").shouldHave(text(""));
        $("#userName").shouldHave(text(""));
        $("#userName").shouldHave(text(""));

    }

}
