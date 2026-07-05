package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f3h {
    public static final f3h E;
    public static final f3h F;
    public static final f3h G;
    public static final /* synthetic */ f3h[] H;

    static {
        f3h f3hVar = new f3h("LEFT", 0);
        E = f3hVar;
        f3h f3hVar2 = new f3h("CENTER", 1);
        F = f3hVar2;
        f3h f3hVar3 = new f3h("RIGHT", 2);
        G = f3hVar3;
        H = new f3h[]{f3hVar, f3hVar2, f3hVar3};
    }

    public static f3h valueOf(String str) {
        return (f3h) Enum.valueOf(f3h.class, str);
    }

    public static f3h[] values() {
        return (f3h[]) H.clone();
    }
}
