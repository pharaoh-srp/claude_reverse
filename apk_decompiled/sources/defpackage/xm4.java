package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xm4 {
    public final gw9 a;
    public final int b;
    public final pt c;
    public final rt d;

    public /* synthetic */ xm4(gw9 gw9Var, int i, pt ptVar, rt rtVar, int i2) {
        this(gw9Var, i, (i2 & 4) != 0 ? null : ptVar, (i2 & 8) != 0 ? null : rtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm4)) {
            return false;
        }
        xm4 xm4Var = (xm4) obj;
        return this.a == xm4Var.a && this.b == xm4Var.b && x44.r(this.c, xm4Var.c) && x44.r(this.d, xm4Var.d);
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, this.a.hashCode() * 31, 31);
        pt ptVar = this.c;
        int iHashCode = (iC + (ptVar == null ? 0 : Integer.hashCode(ptVar.a))) * 31;
        rt rtVar = this.d;
        return iHashCode + (rtVar != null ? Integer.hashCode(rtVar.a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public xm4(gw9 gw9Var, int i, pt ptVar, rt rtVar) {
        this.a = gw9Var;
        this.b = i;
        this.c = ptVar;
        this.d = rtVar;
    }
}
