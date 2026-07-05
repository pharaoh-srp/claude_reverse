package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk5 implements c07, zz7 {
    public static final bk5 E = new bk5();

    @Override // defpackage.c07
    public final Object a(Object obj) {
        kt6 kt6Var = (kt6) obj;
        kt6Var.getClass();
        uj5.n(kt6Var);
        return kt6Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return new m08(1, uj5.class, "redactErrorEventInPlace", "redactErrorEventInPlace(Lcom/datadog/android/rum/model/ErrorEvent;)Lcom/datadog/android/rum/model/ErrorEvent;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c07) && (obj instanceof zz7)) {
            return d().equals(((zz7) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
