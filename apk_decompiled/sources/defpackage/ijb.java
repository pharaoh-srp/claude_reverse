package defpackage;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class ijb {
    public final int a;
    public final String b;
    public final cg5 c;
    public final Instant d;
    public final String e;
    public final long f;
    public final h26 g;

    public ijb(int i, String str, cg5 cg5Var, Instant instant, String str2, long j, h26 h26Var) {
        this.a = i;
        this.b = str;
        this.c = cg5Var;
        this.d = instant;
        this.e = str2;
        this.f = j;
        this.g = h26Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijb)) {
            return false;
        }
        ijb ijbVar = (ijb) obj;
        return this.b.equals(ijbVar.b) && this.c.equals(ijbVar.c) && this.d.equals(ijbVar.d) && x44.r(this.e, ijbVar.e) && this.f == ijbVar.f && x44.r(this.g, ijbVar.g) && this.a == ijbVar.a;
    }

    public final int hashCode() {
        int i = ebh.i(this.d, kgh.l(this.b.hashCode() * 31, 31, this.c.a), 31);
        String str = this.e;
        int iE = vb7.e((i + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
        h26 h26Var = this.g;
        return Integer.hashCode(this.a) + ((iE + (h26Var != null ? h26Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(id='");
        sb.append(this.b);
        sb.append("', dataOrigin=");
        sb.append(this.c);
        sb.append(", lastModifiedTime=");
        sb.append(this.d);
        sb.append(", clientRecordId=");
        sb.append(this.e);
        sb.append(", clientRecordVersion=");
        sb.append(this.f);
        sb.append(", device=");
        sb.append(this.g);
        sb.append(", recordingMethod=");
        return vb7.r(sb, this.a, ')');
    }
}
