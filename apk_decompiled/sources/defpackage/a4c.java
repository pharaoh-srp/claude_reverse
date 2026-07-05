package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a4c {
    public static final a4c E;
    public static final a4c F;
    public static final a4c G;
    public static final /* synthetic */ a4c[] H;

    static {
        a4c a4cVar = new a4c("Disabled", 0);
        E = a4cVar;
        a4c a4cVar2 = new a4c("BlankSuggestion", 1);
        F = a4cVar2;
        a4c a4cVar3 = new a4c("Duplicate", 2);
        G = a4cVar3;
        H = new a4c[]{a4cVar, a4cVar2, a4cVar3};
    }

    public static a4c valueOf(String str) {
        return (a4c) Enum.valueOf(a4c.class, str);
    }

    public static a4c[] values() {
        return (a4c[]) H.clone();
    }
}
