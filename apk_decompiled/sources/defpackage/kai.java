package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kai {
    public static final iai E;
    public static final gai F;
    public static final jai G;
    public static final hai H;
    public static final /* synthetic */ kai[] I;

    static {
        iai iaiVar = new iai();
        E = iaiVar;
        gai gaiVar = new gai();
        F = gaiVar;
        jai jaiVar = new jai();
        G = jaiVar;
        hai haiVar = new hai();
        H = haiVar;
        I = new kai[]{iaiVar, gaiVar, jaiVar, haiVar};
    }

    public static kai b(fhi fhiVar) {
        fhiVar.getClass();
        return fhiVar.b0() ? F : ljk.f(nkk.b(false, null, 24), yb5.A(fhiVar), s9i.c) ? H : G;
    }

    public static kai valueOf(String str) {
        return (kai) Enum.valueOf(kai.class, str);
    }

    public static kai[] values() {
        return (kai[]) I.clone();
    }

    public abstract kai a(fhi fhiVar);
}
