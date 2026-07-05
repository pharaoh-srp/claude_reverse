package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qw {
    public static final qw E;
    public static final /* synthetic */ qw[] F;

    /* JADX INFO: Fake field, exist only in values array */
    qw EF0;

    static {
        qw qwVar = new qw("AM", 0);
        qw qwVar2 = new qw("PM", 1);
        E = qwVar2;
        F = new qw[]{qwVar, qwVar2};
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) F.clone();
    }
}
