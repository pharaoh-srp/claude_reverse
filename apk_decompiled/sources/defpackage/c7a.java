package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c7a {
    public static final c7a E;
    public static final c7a F;
    public static final c7a G;
    public static final /* synthetic */ c7a[] H;

    static {
        c7a c7aVar = new c7a("URL", 0);
        E = c7aVar;
        c7a c7aVar2 = new c7a("EMAIL", 1);
        F = c7aVar2;
        c7a c7aVar3 = new c7a("WWW", 2);
        G = c7aVar3;
        H = new c7a[]{c7aVar, c7aVar2, c7aVar3};
    }

    public static c7a valueOf(String str) {
        return (c7a) Enum.valueOf(c7a.class, str);
    }

    public static c7a[] values() {
        return (c7a[]) H.clone();
    }
}
