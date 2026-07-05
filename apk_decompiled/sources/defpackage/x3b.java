package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x3b {
    public static final x3b E;
    public static final x3b F;
    public static final /* synthetic */ x3b[] G;

    static {
        x3b x3bVar = new x3b("SetAll", 0);
        E = x3bVar;
        x3b x3bVar2 = new x3b("BottomSpacer", 1);
        F = x3bVar2;
        G = new x3b[]{x3bVar, x3bVar2};
    }

    public static x3b valueOf(String str) {
        return (x3b) Enum.valueOf(x3b.class, str);
    }

    public static x3b[] values() {
        return (x3b[]) G.clone();
    }
}
