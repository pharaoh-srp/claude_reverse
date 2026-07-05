package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwh implements axh {
    public final String a;
    public final String b;

    public xwh(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwh)) {
            return false;
        }
        xwh xwhVar = (xwh) obj;
        return x44.r(this.a, xwhVar.a) && this.b.equals(xwhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("CompleteFailure(errorType=", this.a, ", errorMessage=", this.b, ")");
    }
}
