package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vm3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public vm3(float f, float f2, float f3, float f4, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm3)) {
            return false;
        }
        vm3 vm3Var = (vm3) obj;
        return va6.b(this.a, vm3Var.a) && va6.b(this.b, vm3Var.b) && va6.b(this.c, vm3Var.c) && va6.b(this.d, vm3Var.d) && clh.a(this.e, vm3Var.e);
    }

    public final int hashCode() {
        int iB = vb7.b(this.d, vb7.b(this.c, vb7.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
        dlh[] dlhVarArr = clh.b;
        return Long.hashCode(this.e) + iB;
    }

    public final String toString() {
        String strC = va6.c(this.a);
        String strC2 = va6.c(this.b);
        String strC3 = va6.c(this.c);
        String strC4 = va6.c(this.d);
        String strD = clh.d(this.e);
        StringBuilder sbR = kgh.r("ClaudeWidgetDimens(size=", strC, ", padding=", strC2, ", spacing=");
        kgh.u(sbR, strC3, ", iconSize=", strC4, ", textSize=");
        return ij0.m(sbR, strD, ")");
    }
}
