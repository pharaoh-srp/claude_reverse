package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v5c {
    public static final v5c E;
    public static final v5c F;
    public static final /* synthetic */ v5c[] G;

    static {
        v5c v5cVar = new v5c("Width", 0);
        E = v5cVar;
        v5c v5cVar2 = new v5c("Height", 1);
        F = v5cVar2;
        G = new v5c[]{v5cVar, v5cVar2};
    }

    public static v5c valueOf(String str) {
        return (v5c) Enum.valueOf(v5c.class, str);
    }

    public static v5c[] values() {
        return (v5c[]) G.clone();
    }
}
