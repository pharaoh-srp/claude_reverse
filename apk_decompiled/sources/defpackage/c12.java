package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c12 implements h12 {
    public final rz7 a;

    public c12(rz7 rz7Var) {
        this.a = rz7Var;
    }

    @Override // defpackage.h12
    public final d54 a(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1644876569);
        e18Var.p(false);
        return null;
    }

    @Override // defpackage.h12
    public final d54 b(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-816136960);
        e18Var.p(false);
        return null;
    }

    @Override // defpackage.h12
    public final long c(a12 a12Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-707277432);
        long j = ((d54) this.a.invoke(a12Var, e18Var, Integer.valueOf(i & 14))).a;
        e18Var.p(false);
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c12) && x44.r(this.a, ((c12) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Borderless(contentColor=" + this.a + ")";
    }

    public /* synthetic */ c12() {
        this(b12.F);
    }
}
