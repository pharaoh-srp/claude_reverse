package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i4d {
    public static final i4d E;
    public static final /* synthetic */ i4d[] F;
    public static final /* synthetic */ gq6 G;

    static {
        i4d i4dVar = new i4d("Free", 0);
        E = i4dVar;
        i4d[] i4dVarArr = {i4dVar, new i4d("Pro", 1), new i4d("Max", 2)};
        F = i4dVarArr;
        G = new gq6(i4dVarArr);
    }

    public static i4d valueOf(String str) {
        return (i4d) Enum.valueOf(i4d.class, str);
    }

    public static i4d[] values() {
        return (i4d[]) F.clone();
    }
}
