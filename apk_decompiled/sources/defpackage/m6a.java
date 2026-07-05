package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m6a extends o6a {
    public final String a;
    public final ekh b;
    public final v6a c;

    public m6a(String str, ekh ekhVar, v6a v6aVar) {
        this.a = str;
        this.b = ekhVar;
        this.c = v6aVar;
    }

    public static m6a c(m6a m6aVar, ekh ekhVar) {
        String str = m6aVar.a;
        v6a v6aVar = m6aVar.c;
        m6aVar.getClass();
        return new m6a(str, ekhVar, v6aVar);
    }

    @Override // defpackage.o6a
    public final v6a a() {
        return this.c;
    }

    @Override // defpackage.o6a
    public final ekh b() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6a)) {
            return false;
        }
        m6a m6aVar = (m6a) obj;
        return this.a.equals(m6aVar.a) && x44.r(this.b, m6aVar.b) && x44.r(this.c, m6aVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ekh ekhVar = this.b;
        int iHashCode2 = (iHashCode + (ekhVar != null ? ekhVar.hashCode() : 0)) * 31;
        v6a v6aVar = this.c;
        return iHashCode2 + (v6aVar != null ? v6aVar.hashCode() : 0);
    }

    public final String toString() {
        return vb7.s(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
