package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class frd {
    public static final frd E;
    public static final frd F;
    public static final /* synthetic */ frd[] G;

    /* JADX INFO: Fake field, exist only in values array */
    frd EF0;

    static {
        frd frdVar = new frd("PRETTY", 0);
        frd frdVar2 = new frd("DEBUG", 1);
        E = frdVar2;
        frd frdVar3 = new frd("NONE", 2);
        F = frdVar3;
        G = new frd[]{frdVar, frdVar2, frdVar3};
    }

    public static frd valueOf(String str) {
        return (frd) Enum.valueOf(frd.class, str);
    }

    public static frd[] values() {
        return (frd[]) G.clone();
    }
}
