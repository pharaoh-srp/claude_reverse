package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface wti {
    float a(ge2 ge2Var, y9d y9dVar, float f, float f2);

    float b(ge2 ge2Var, y9d y9dVar, float f, float f2);

    List c(ge2 ge2Var, pa1 pa1Var);

    boolean d(yd2 yd2Var);

    default List e(pa1 pa1Var, yd2 yd2Var) {
        pa1Var.getClass();
        return null;
    }

    List f(yd2 yd2Var, float f, float f2, pa1 pa1Var);

    List g(ge2 ge2Var, float f, float f2, qa1 qa1Var);
}
