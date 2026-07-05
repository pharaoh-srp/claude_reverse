package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xi3 {
    public static final lyk G;
    public static final LinkedHashMap H;
    public static final LinkedHashMap I;
    public static final xi3 J;
    public static final /* synthetic */ xi3[] K;
    public static final /* synthetic */ gq6 L;
    public final String E;
    public final int F;

    static {
        xi3 xi3Var = new xi3(0, 400, "INVALID_REQUEST_ERROR", "invalid_request_error");
        xi3 xi3Var2 = new xi3(1, 403, "PERMISSION_ERROR", "permission_error");
        xi3 xi3Var3 = new xi3(2, 429, "RATE_LIMIT_ERROR", "rate_limit_error");
        J = xi3Var3;
        xi3[] xi3VarArr = {xi3Var, xi3Var2, xi3Var3, new xi3(3, 529, "OVERLOADED_ERROR", "overloaded_error")};
        K = xi3VarArr;
        gq6 gq6Var = new gq6(xi3VarArr);
        L = gq6Var;
        G = new lyk(28);
        int iD0 = tta.d0(x44.y(gq6Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : gq6Var) {
            linkedHashMap.put(((xi3) obj).E, obj);
        }
        H = linkedHashMap;
        gq6 gq6Var2 = L;
        int iD02 = tta.d0(x44.y(gq6Var2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD02 >= 16 ? iD02 : 16);
        for (Object obj2 : gq6Var2) {
            linkedHashMap2.put(Integer.valueOf(((xi3) obj2).F), obj2);
        }
        I = linkedHashMap2;
    }

    public xi3(int i, int i2, String str, String str2) {
        this.E = str2;
        this.F = i2;
    }

    public static xi3 valueOf(String str) {
        return (xi3) Enum.valueOf(xi3.class, str);
    }

    public static xi3[] values() {
        return (xi3[]) K.clone();
    }

    public final String a() {
        return this.E;
    }
}
