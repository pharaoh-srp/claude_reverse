package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ati {
    public static final ati E;
    public static final /* synthetic */ ati[] F;

    /* JADX INFO: Fake field, exist only in values array */
    ati EF0;

    static {
        ati atiVar = new ati("STRICT", 0);
        ati atiVar2 = new ati("LOG", 1);
        ati atiVar3 = new ati("QUIET", 2);
        E = atiVar3;
        F = new ati[]{atiVar, atiVar2, atiVar3};
    }

    public static ati valueOf(String str) {
        return (ati) Enum.valueOf(ati.class, str);
    }

    public static ati[] values() {
        return (ati[]) F.clone();
    }
}
