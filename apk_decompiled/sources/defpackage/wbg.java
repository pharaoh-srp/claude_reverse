package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wbg implements fcg {
    public final String a;
    public final String b;
    public final boolean c;
    public final tbg d;

    public wbg(String str, String str2, boolean z, tbg tbgVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = tbgVar;
    }

    @Override // defpackage.fcg
    public final String a() {
        return this.a;
    }

    @Override // defpackage.fcg
    public final String b() {
        return this.b;
    }

    @Override // defpackage.fcg
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wbg.class != obj.getClass()) {
            return false;
        }
        wbg wbgVar = (wbg) obj;
        return x44.r(this.a, wbgVar.a) && x44.r(this.b, wbgVar.b) && this.c == wbgVar.c && this.d == wbgVar.d;
    }

    @Override // defpackage.fcg
    public final tbg getDuration() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + fsh.p((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }
}
