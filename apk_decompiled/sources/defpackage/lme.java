package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lme implements nme {
    public final int a;
    public final int b;

    public lme(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lme)) {
            return false;
        }
        lme lmeVar = (lme) obj;
        return this.a == lmeVar.a && this.b == lmeVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("HoursMinutes(hours=", ", minutes=", this.a, this.b, ")");
    }
}
