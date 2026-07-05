package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mpg extends wpg {
    public final String a;
    public final long b;

    public mpg(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpg)) {
            return false;
        }
        mpg mpgVar = (mpg) obj;
        return this.a.equals(mpgVar.a) && this.b == mpgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("Error(message=", this.a, ", timestamp=", this.b);
        sbW.append(")");
        return sbW.toString();
    }
}
