package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class hmc {
    public final long a;
    public final qnc b;

    public hmc() {
        long jO = d4c.o(4284900966L);
        qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 3);
        this.a = jO;
        this.b = qncVarB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hmc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hmc hmcVar = (hmc) obj;
        return d54.c(this.a, hmcVar.a) && x44.r(this.b, hmcVar.b);
    }

    public final int hashCode() {
        int i = d54.i;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        y6a.q(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
