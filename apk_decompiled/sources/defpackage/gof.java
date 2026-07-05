package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public interface gof {
    void a(pl9 pl9Var, bz7 bz7Var);

    void c(pl9 pl9Var, bz7 bz7Var);

    default void f(pl9 pl9Var, rp4 rp4Var) {
        g(pl9Var, new tz9(25, rp4Var));
    }

    void g(pl9 pl9Var, bz7 bz7Var);

    void h(pl9 pl9Var, pl9 pl9Var2, KSerializer kSerializer);
}
