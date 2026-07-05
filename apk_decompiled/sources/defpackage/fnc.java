package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fnc {
    public static final fnc E;
    public static final fnc F;
    public static final /* synthetic */ fnc[] G;

    /* JADX INFO: Fake field, exist only in values array */
    fnc EF0;

    static {
        fnc fncVar = new fnc("NONE", 0);
        fnc fncVar2 = new fnc("ZERO", 1);
        E = fncVar2;
        fnc fncVar3 = new fnc("SPACE", 2);
        F = fncVar3;
        G = new fnc[]{fncVar, fncVar2, fncVar3};
    }

    public static fnc valueOf(String str) {
        return (fnc) Enum.valueOf(fnc.class, str);
    }

    public static fnc[] values() {
        return (fnc[]) G.clone();
    }
}
