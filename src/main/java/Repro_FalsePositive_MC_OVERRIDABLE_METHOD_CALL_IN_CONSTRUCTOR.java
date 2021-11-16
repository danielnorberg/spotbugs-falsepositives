public class Repro_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR {
  interface Foo {
    default void foo() {}
  }

  static final class Bar implements Foo {

    public Bar() {

      // Spotbugs yields:

      // [ERROR] Low: Overridable method foo is called from constructor new
      // Repro_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR$Bar().
      // [Repro_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR$Bar]
      // At Repro_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR.java:[line 9]
      // MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR

      // https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html#mc-an-overridable-method-is-called-from-a-constructor-mc-overridable-method-call-in-constructor

      // But the class Bar is final and thus the method foo() cannot be overridden.

      foo();
    }
  }
}
