package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jce {
    public static final kce a;

    static {
        kce kceVar = null;
        try {
            kceVar = (kce) lce.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kceVar == null) {
            kceVar = new kce();
        }
        a = kceVar;
    }

    public static pl9 a(Class cls) {
        return a.b(cls);
    }

    public static eo9 b(Class cls) {
        kce kceVar = a;
        pl9 pl9VarB = kceVar.b(cls);
        List list = Collections.EMPTY_LIST;
        return kceVar.k(pl9VarB);
    }
}
