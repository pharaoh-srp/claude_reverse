package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a6b {
    public static final a6b E;
    public static final a6b F;
    public static final /* synthetic */ a6b[] G;

    static {
        a6b a6bVar = new a6b("Width", 0);
        E = a6bVar;
        a6b a6bVar2 = new a6b("Height", 1);
        F = a6bVar2;
        G = new a6b[]{a6bVar, a6bVar2};
    }

    public static a6b valueOf(String str) {
        return (a6b) Enum.valueOf(a6b.class, str);
    }

    public static a6b[] values() {
        return (a6b[]) G.clone();
    }
}
