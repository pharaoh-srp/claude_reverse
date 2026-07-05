package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface q68 {
    Object a(pz7 pz7Var, Object obj);

    boolean b(bz7 bz7Var);

    boolean c(e69 e69Var);

    default q68 d(q68 q68Var) {
        return q68Var == o68.a ? this : new b74(this, q68Var);
    }
}
