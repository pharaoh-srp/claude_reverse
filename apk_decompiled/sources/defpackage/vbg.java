package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vbg implements sbg {
    public final fcg a;
    public final ua2 b;

    public vbg(fcg fcgVar, ua2 ua2Var) {
        this.a = fcgVar;
        this.b = ua2Var;
    }

    public final void a() {
        ua2 ua2Var = this.b;
        if (ua2Var.s() instanceof q6c) {
            ua2Var.resumeWith(ecg.E);
        }
    }

    public final fcg b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vbg.class == obj.getClass()) {
            vbg vbgVar = (vbg) obj;
            return x44.r(this.a, vbgVar.a) && this.b == vbgVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
