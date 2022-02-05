package junit.ex2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Запускать тесты с аннотацией @RunWith с Suite.class,
// А Suite.class говорит использовать тесты, которые надо запускать
// через запятую, хранятся в контейнере, т.е. как шаблон
@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class})
public class NewTestSuite {
}
