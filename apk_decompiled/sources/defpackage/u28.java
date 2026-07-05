package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class u28 extends b3 implements Serializable {
    public static t28 g(b3 b3Var, b3 b3Var2, int i, bfj bfjVar, Class cls) {
        return new t28(b3Var, Collections.EMPTY_LIST, b3Var2, new s28(i, bfjVar, true), cls);
    }

    public static t28 h(b3 b3Var, Object obj, b3 b3Var2, int i, bfj bfjVar, Class cls) {
        return new t28(b3Var, obj, b3Var2, new s28(i, bfjVar, false), cls);
    }
}
