public class TestCallback {
  public static void Callback() {
    Callee callee = new Callee();
    Caller caller = new Caller(callee);
    caller.go();
}
}