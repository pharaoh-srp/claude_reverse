package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkh {
    public final String a;
    public String b;
    public boolean c = false;
    public hrc d = null;

    public qkh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final hrc a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final void d(hrc hrcVar) {
        this.d = hrcVar;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkh)) {
            return false;
        }
        qkh qkhVar = (qkh) obj;
        return x44.r(this.a, qkhVar.a) && x44.r(this.b, qkhVar.b) && this.c == qkhVar.c && x44.r(this.d, qkhVar.d);
    }

    public final void f(String str) {
        this.b = str;
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        hrc hrcVar = this.d;
        return iP + (hrcVar == null ? 0 : hrcVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return y6a.p(sb, this.c, ')');
    }
}
