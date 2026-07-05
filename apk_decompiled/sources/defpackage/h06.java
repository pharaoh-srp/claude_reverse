package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public enum h06 {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set F;
    public static final Set G;
    public final boolean E;

    static {
        h06[] h06VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (h06 h06Var : h06VarArrValues) {
            if (h06Var.E) {
                arrayList.add(h06Var);
            }
        }
        F = w44.t1(arrayList);
        G = mp0.Z0(values());
    }

    h06(boolean z) {
        this.E = z;
    }
}
