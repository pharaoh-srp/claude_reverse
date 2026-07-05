package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class qnc implements mnc {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public qnc(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= MTTypesetterKt.kLineSkipLimitMultiplier) & (f2 >= MTTypesetterKt.kLineSkipLimitMultiplier) & (f3 >= MTTypesetterKt.kLineSkipLimitMultiplier)) || !(f4 >= MTTypesetterKt.kLineSkipLimitMultiplier)) {
            z29.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.mnc
    public final float a() {
        return this.e;
    }

    @Override // defpackage.mnc
    public final float b(fu9 fu9Var) {
        return fu9Var == fu9.E ? this.b : this.d;
    }

    @Override // defpackage.mnc
    public final float c(fu9 fu9Var) {
        return fu9Var == fu9.E ? this.d : this.b;
    }

    @Override // defpackage.mnc
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qnc)) {
            return false;
        }
        qnc qncVar = (qnc) obj;
        return va6.b(this.b, qncVar.b) && va6.b(this.c, qncVar.c) && va6.b(this.d, qncVar.d) && va6.b(this.e, qncVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + vb7.b(this.d, vb7.b(this.c, Float.hashCode(this.b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        ebh.v(this.b, sb, ", top=");
        ebh.v(this.c, sb, ", end=");
        ebh.v(this.d, sb, ", bottom=");
        sb.append((Object) va6.c(this.e));
        sb.append(')');
        return sb.toString();
    }
}
