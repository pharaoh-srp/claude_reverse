package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class y9e {
    public static final zl4 E;
    public static final /* synthetic */ y9e[] F;
    public static final /* synthetic */ gq6 G;

    static {
        y9e[] y9eVarArr = {new y9e("MM_IMAGES", 0), new y9e("MM_PDF", 1)};
        F = y9eVarArr;
        G = new gq6(y9eVarArr);
        E = new zl4(17);
    }

    public static y9e valueOf(String str) {
        return (y9e) Enum.valueOf(y9e.class, str);
    }

    public static y9e[] values() {
        return (y9e[]) F.clone();
    }
}
