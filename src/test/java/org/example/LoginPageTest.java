package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.example.common.Configuration.*;

/*
 * Класс LoginPageTest.java
 *
 * Содержит тест-кейс "Create Contact Person"
 * и тест-кейс "Create New Project".
 *
 * */

public class LoginPageTest extends BaseTest {


    @DisplayName("Create new Contact")
    @Test
    public void newContactTest() {
        new LoginPage(driver)
                .login(STUDENT_LOGIN, STUDENT_PASSWORD)
                .redirectToNewContactPage()
                .clickButtonCreateNewContact()
                .enteringContactInfo(LAST_NAME, FIRST_NAME, JOB)
                .checkSavingNewContact();
    }

    @DisplayName("Create new Project")
    @Test
    public void newProjectTest() {
        new LoginPage(driver)
                .login(STUDENT_LOGIN, STUDENT_PASSWORD)
                .redirectToAllProjectPage()
                .redirectToCreatingProjPage()
                .enterDataOfProj(NAME_PROJ)
                .checkSavingResult(NAME_PROJ);
    }
}