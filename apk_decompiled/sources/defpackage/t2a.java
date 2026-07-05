package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class t2a {
    public static final yl4 F;
    public static final LinkedHashMap G;
    public static final t2a H;
    public static final t2a I;
    public static final t2a J;
    public static final /* synthetic */ t2a[] K;
    public final String E;

    static {
        t2a t2aVar = new t2a("USAGE_POLICY", 0, "aup");
        H = t2aVar;
        t2a t2aVar2 = new t2a("PRIVACY_POLICY", 1, "privacy");
        I = t2aVar2;
        t2a t2aVar3 = new t2a("CONSUMER_TERMS", 2, "consumer-terms");
        J = t2aVar3;
        t2a[] t2aVarArr = {t2aVar, t2aVar2, t2aVar3, new t2a("COMMERCIAL_TERMS", 3, "commercial-terms")};
        K = t2aVarArr;
        gq6 gq6Var = new gq6(t2aVarArr);
        F = new yl4();
        int iD0 = tta.d0(x44.y(gq6Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : gq6Var) {
            linkedHashMap.put(((t2a) obj).E, obj);
        }
        G = linkedHashMap;
    }

    public t2a(String str, int i, String str2) {
        this.E = str2;
    }

    public static t2a valueOf(String str) {
        return (t2a) Enum.valueOf(t2a.class, str);
    }

    public static t2a[] values() {
        return (t2a[]) K.clone();
    }
}
