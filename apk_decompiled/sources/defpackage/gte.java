package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gte extends lte {
    public static final egg e = new egg(d54.f, 0, null, null, null, null, null, 0, null, null, null, 0, qeh.c, null, 61438);
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(String str) {
        super(null);
        str.getClass();
        this.d = str;
    }

    @Override // defpackage.lte
    public final egg a(nte nteVar) {
        return nteVar.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gte) && x44.r(this.d, ((gte) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return ij0.j("Link(destination=", this.d, ")");
    }
}
