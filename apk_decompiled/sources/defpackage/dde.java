package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dde implements zpf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dde(String str, String str2, String str3, String str4) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.zpf
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde)) {
            return false;
        }
        dde ddeVar = (dde) obj;
        return x44.r(this.a, ddeVar.a) && this.b.equals(ddeVar.b) && this.c.equals(ddeVar.c) && x44.r(this.d, ddeVar.d);
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return "refusal_paused_notice";
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 961, 31, this.b), 31, this.c);
        String str = this.d;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vb7.t(kgh.r("RefusalPausedNotice(id=", this.a, ", parentAgentId=null, originalModel=", this.b, ", fallbackModel="), this.c, ", category=", this.d, ")");
    }
}
