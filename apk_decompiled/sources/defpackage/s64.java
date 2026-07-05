package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s64 {
    public static final s64 a = new s64();

    public final iqb a(iqb iqbVar, vo1 vo1Var) {
        return iqbVar.B(new ko8(vo1Var));
    }

    public final iqb b(iqb iqbVar, float f, boolean z) {
        if (f <= 0.0d) {
            z29.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return iqbVar.B(new hw9(f, z));
    }
}
