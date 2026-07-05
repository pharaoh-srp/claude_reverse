package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jaj {
    public static final jaj E;
    public static final jaj F;
    public static final /* synthetic */ jaj[] G;

    static {
        jaj jajVar = new jaj("SHARE", 0);
        E = jajVar;
        jaj jajVar2 = new jaj("PUBLISH", 1);
        F = jajVar2;
        G = new jaj[]{jajVar, jajVar2};
    }

    public static jaj valueOf(String str) {
        return (jaj) Enum.valueOf(jaj.class, str);
    }

    public static jaj[] values() {
        return (jaj[]) G.clone();
    }
}
