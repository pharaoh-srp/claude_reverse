package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface oph {
    default void b(ao5 ao5Var) {
        e(ao5Var != null ? Integer.valueOf(ao5Var.a(9)) : null);
    }

    qw c();

    void d(Integer num);

    void e(Integer num);

    Integer g();

    void h(Integer num);

    default ao5 k() {
        Integer numL = l();
        if (numL != null) {
            return new ao5(numL.intValue(), 9);
        }
        return null;
    }

    Integer l();

    Integer m();

    void p(qw qwVar);

    void u(Integer num);

    Integer v();

    Integer w();

    void x(Integer num);
}
