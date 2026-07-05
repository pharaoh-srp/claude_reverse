package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public enum z1h {
    VERSION_CODE(0),
    DATA(1);

    public static final LinkedHashMap F;
    public final short E;

    static {
        z1h[] z1hVarArrValues = values();
        int iD0 = tta.d0(z1hVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (z1h z1hVar : z1hVarArrValues) {
            linkedHashMap.put(new vci(z1hVar.E), z1hVar);
        }
        F = linkedHashMap;
    }

    z1h(short s) {
        this.E = s;
    }
}
