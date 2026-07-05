package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a4a {
    public static final a4a E;
    public static final a4a F;
    public static final a4a G;
    public static final a4a H;
    public static final a4a I;
    public static final /* synthetic */ a4a[] J;

    static {
        a4a a4aVar = new a4a("DESTROYED", 0);
        E = a4aVar;
        a4a a4aVar2 = new a4a("INITIALIZED", 1);
        F = a4aVar2;
        a4a a4aVar3 = new a4a("CREATED", 2);
        G = a4aVar3;
        a4a a4aVar4 = new a4a("STARTED", 3);
        H = a4aVar4;
        a4a a4aVar5 = new a4a("RESUMED", 4);
        I = a4aVar5;
        J = new a4a[]{a4aVar, a4aVar2, a4aVar3, a4aVar4, a4aVar5};
    }

    public static a4a valueOf(String str) {
        return (a4a) Enum.valueOf(a4a.class, str);
    }

    public static a4a[] values() {
        return (a4a[]) J.clone();
    }
}
