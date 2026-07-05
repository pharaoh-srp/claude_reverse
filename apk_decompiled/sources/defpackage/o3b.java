package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o3b {
    public static final bm4 E;
    public static final o3b F;
    public static final o3b G;
    public static final o3b H;
    public static final o3b I;
    public static final /* synthetic */ o3b[] J;

    static {
        o3b o3bVar = new o3b("Loading", 0);
        F = o3bVar;
        o3b o3bVar2 = new o3b("Connecting", 1);
        G = o3bVar2;
        o3b o3bVar3 = new o3b("Connected", 2);
        H = o3bVar3;
        o3b o3bVar4 = new o3b("Disconnected", 3);
        I = o3bVar4;
        J = new o3b[]{o3bVar, o3bVar2, o3bVar3, o3bVar4};
        E = new bm4();
    }

    public static o3b valueOf(String str) {
        return (o3b) Enum.valueOf(o3b.class, str);
    }

    public static o3b[] values() {
        return (o3b[]) J.clone();
    }
}
