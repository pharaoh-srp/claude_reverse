package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p9c {
    public static final p9c E;
    public static final p9c F;
    public static final p9c G;
    public static final /* synthetic */ p9c[] H;

    static {
        p9c p9cVar = new p9c("FORCE_FLEXIBILITY", 0);
        E = p9cVar;
        p9c p9cVar2 = new p9c("NULLABLE", 1);
        F = p9cVar2;
        p9c p9cVar3 = new p9c("NOT_NULL", 2);
        G = p9cVar3;
        H = new p9c[]{p9cVar, p9cVar2, p9cVar3};
    }

    public static p9c valueOf(String str) {
        return (p9c) Enum.valueOf(p9c.class, str);
    }

    public static p9c[] values() {
        return (p9c[]) H.clone();
    }
}
