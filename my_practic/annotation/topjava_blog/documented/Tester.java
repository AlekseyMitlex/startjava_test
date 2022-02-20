package annotation.topjava_blog.documented;

// Как видно на скриншоте, для метода doSomeTestNotDocumented()
// отсутствует информация о типе аннотации, но эта информация предоставляется
// для метода doSomeTestDocumented(). Причина этому @Documented, прикрепленная
// к нашей аннотации @TestDocumented. @TestNotDocumented не использует эту аннотацию.
public class Tester {
    @TestDocumented(doTestDocument = "codewarEtc.etc.Hello DOC with annotation")
    public void doSomeTestDocumented() {
        System.out.println("Test for annotation with 'Documented'");
    }

    @TestNotDocumented(doTestNoDocument = "codewarEtc.etc.Hello DOC without annotation")
    public void doSomeTestNotDocumented() {
        System.out.println("Test for annotation without 'Documented'");
    }
}
