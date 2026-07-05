package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class epe {
    public final Long a;
    public final Long b;
    public final fpe c;

    public epe(Long l, Long l2, fpe fpeVar) {
        this.a = l;
        this.b = l2;
        this.c = fpeVar;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        Long l = this.a;
        if (l != null) {
            grc.A(l, qh9Var, "encoded_body_size");
        }
        Long l2 = this.b;
        if (l2 != null) {
            grc.A(l2, qh9Var, "decoded_body_size");
        }
        fpe fpeVar = this.c;
        if (fpeVar != null) {
            qh9Var.o("headers", fpeVar.a());
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epe)) {
            return false;
        }
        epe epeVar = (epe) obj;
        return x44.r(this.a, epeVar.a) && x44.r(this.b, epeVar.b) && x44.r(this.c, epeVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        fpe fpeVar = this.c;
        return iHashCode2 + (fpeVar != null ? fpeVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Request(encodedBodySize=" + this.a + ", decodedBodySize=" + this.b + ", headers=" + this.c + ")";
    }

    public /* synthetic */ epe(fpe fpeVar) {
        this(null, null, fpeVar);
    }
}
