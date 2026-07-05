package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface q5b extends xa9 {
    p5b J0(int i, int i2, Map map, bz7 bz7Var, bz7 bz7Var2);

    default p5b U(int i, int i2, Map map, bz7 bz7Var) {
        return J0(i, i2, map, null, bz7Var);
    }
}
