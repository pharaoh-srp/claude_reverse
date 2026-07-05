package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uli {
    public final int a;
    public final int b;
    public final nme c;
    public final Integer d;

    public uli(int i, int i2, nme nmeVar, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = nmeVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uli)) {
            return false;
        }
        uli uliVar = (uli) obj;
        return this.a == uliVar.a && this.b == uliVar.b && x44.r(this.c, uliVar.c) && x44.r(this.d, uliVar.d);
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, Integer.hashCode(this.a) * 31, 31);
        nme nmeVar = this.c;
        int iHashCode = (iC + (nmeVar == null ? 0 : nmeVar.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = vb7.v("UsageLimitUiModel(labelRes=", ", percent=", this.a, this.b, ", resetTime=");
        sbV.append(this.c);
        sbV.append(", subtitleRes=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
