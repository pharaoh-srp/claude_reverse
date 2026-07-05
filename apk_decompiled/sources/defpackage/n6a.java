package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n6a extends o6a {
    public final String a;
    public final ekh b;
    public final v6a c;

    public n6a(String str, ekh ekhVar, v6a v6aVar) {
        this.a = str;
        this.b = ekhVar;
        this.c = v6aVar;
    }

    @Override // defpackage.o6a
    public final v6a a() {
        return this.c;
    }

    @Override // defpackage.o6a
    public final ekh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a)) {
            return false;
        }
        n6a n6aVar = (n6a) obj;
        return x44.r(this.a, n6aVar.a) && x44.r(this.b, n6aVar.b) && x44.r(this.c, n6aVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ekh ekhVar = this.b;
        int iHashCode2 = (iHashCode + (ekhVar != null ? ekhVar.hashCode() : 0)) * 31;
        v6a v6aVar = this.c;
        return iHashCode2 + (v6aVar != null ? v6aVar.hashCode() : 0);
    }

    public final String toString() {
        return vb7.s(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }

    public /* synthetic */ n6a(String str, ekh ekhVar, int i) {
        this(str, (i & 2) != 0 ? null : ekhVar, (v6a) null);
    }
}
