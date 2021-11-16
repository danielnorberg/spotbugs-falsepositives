public final class Repro2_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR {

  public Repro2_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR() {
    // Spotbugs yields:

    // [ERROR] Low: Overridable method foo is called from constructor new
    // Repro2_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR().
    // [Repro2_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR] At
    // Repro2_FalsePositive_MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR.java:[line 16]
    // MC_OVERRIDABLE_METHOD_CALL_IN_CONSTRUCTOR

    // https://spotbugs.readthedocs.io/en/stable/bugDescriptions.html#mc-an-overridable-method-is-called-from-a-constructor-mc-overridable-method-call-in-constructor

    // But this class is final and thus the method foo() cannot be overridden.

    foo();
  }

  void foo() {}
}
