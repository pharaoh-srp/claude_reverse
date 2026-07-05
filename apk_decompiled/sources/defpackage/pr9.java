package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public enum pr9 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final LinkedHashMap F;
    public final int E;

    static {
        pr9[] pr9VarArrValues = values();
        int iD0 = tta.d0(pr9VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (pr9 pr9Var : pr9VarArrValues) {
            linkedHashMap.put(Integer.valueOf(pr9Var.E), pr9Var);
        }
        F = linkedHashMap;
    }

    pr9(int i) {
        this.E = i;
    }
}
