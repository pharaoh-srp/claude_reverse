package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ywe {
    public float a = MTTypesetterKt.kLineSkipLimitMultiplier;
    public boolean b = true;
    public iuj c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywe)) {
            return false;
        }
        ywe yweVar = (ywe) obj;
        return Float.compare(this.a, yweVar.a) == 0 && this.b == yweVar.b && x44.r(this.c, yweVar.c);
    }

    public final int hashCode() {
        int iP = fsh.p(Float.hashCode(this.a) * 31, 31, this.b);
        iuj iujVar = this.c;
        return (iP + (iujVar == null ? 0 : iujVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
