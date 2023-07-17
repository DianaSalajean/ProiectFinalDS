# ProiectFinalDS

Proiectul este creat utilizand design pattern-ul Page Object model, cu framework-ul Selenium WebDriver( versiune 4.8.3).
Testele sunt rulate folosind TestNG.
Fiecare test case va deschide o instant de Google Chrome,iar aceasta se va inchide dupa fiecare rulare.
Fisierul pom.xml contine dependintele Maven( V 4.0.0) pentru Selenium (V 4.8.3),Chrome Driver, Firefox Driver, TestNG si DevTools(V.111), pentru intregul proiect. 
Proiectul este format din 2 pachete (pages si testCases)
-Pages-contine locatorii din pagini
-Testcases contine test case-urile pentru elementele din clasele din pachetul de pages.
Validarile contin si happy flows dar si negative flows, unde se verifica prezenta unor mesaje de eroare.
Suita de teste va aparea in tab-ul Run din Intellij si va arata asa: 
![Screenshot (5)](https://github.com/DianaSalajean/ProiectFinalDS/assets/139351423/6239e7a1-f09a-43e1-a6b3-42afb5195c00)
