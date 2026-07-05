package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mud {
    public static final mud E;
    public static final /* synthetic */ mud[] F;

    static {
        mud mudVar = new mud("DEFAULT", 0);
        E = mudVar;
        F = new mud[]{mudVar, new mud("SIGNED", 1), new mud("FIXED", 2)};
    }

    public static mud valueOf(String str) {
        return (mud) Enum.valueOf(mud.class, str);
    }

    public static mud[] values() {
        return (mud[]) F.clone();
    }
}
