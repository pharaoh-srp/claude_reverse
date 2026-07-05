package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface hn0 {
    void a(int i, Object obj);

    void b(Object obj);

    default void c() {
        Object objJ = j();
        tc4 tc4Var = objJ instanceof tc4 ? (tc4) objJ : null;
        if (tc4Var != null) {
            tc4Var.i();
        }
    }

    void d(int i, int i2, int i3);

    void e(int i, int i2);

    void g();

    void h(int i, Object obj);

    default void i() {
    }

    Object j();

    default void k(pz7 pz7Var, Object obj) {
        pz7Var.invoke(j(), obj);
    }
}
