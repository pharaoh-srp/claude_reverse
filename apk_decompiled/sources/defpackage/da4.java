package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface da4 {
    default Object a(Class cls) {
        return i(qzd.a(cls));
    }

    default Set d(qzd qzdVar) {
        return (Set) g(qzdVar).get();
    }

    default jvd e(Class cls) {
        return h(qzd.a(cls));
    }

    jvd g(qzd qzdVar);

    jvd h(qzd qzdVar);

    default Object i(qzd qzdVar) {
        jvd jvdVarH = h(qzdVar);
        if (jvdVarH == null) {
            return null;
        }
        return jvdVarH.get();
    }
}
