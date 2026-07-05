package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z4c implements a5c {
    public static final z4c E;
    public static final z4c F;
    public static final z4c G;
    public static final z4c H;
    public static final /* synthetic */ z4c[] I;

    static {
        z4c z4cVar = new z4c("NO_RESOURCES", 0);
        E = z4cVar;
        z4c z4cVar2 = new z4c("NO_INITIAL_RESOURCES", 1);
        F = z4cVar2;
        z4c z4cVar3 = new z4c("NOT_SETTLED_YET", 2);
        G = z4cVar3;
        z4c z4cVar4 = new z4c("UNKNOWN", 3);
        H = z4cVar4;
        I = new z4c[]{z4cVar, z4cVar2, z4cVar3, z4cVar4};
    }

    public static z4c valueOf(String str) {
        return (z4c) Enum.valueOf(z4c.class, str);
    }

    public static z4c[] values() {
        return (z4c[]) I.clone();
    }
}
