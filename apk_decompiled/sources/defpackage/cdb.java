package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cdb {
    public final e0g a;
    public final e0g b;

    public cdb(e0g e0gVar, e0g e0gVar2) {
        this.a = e0gVar;
        this.b = e0gVar2;
    }

    public final cdb a(e0g e0gVar) {
        if (e0gVar == null) {
            e0gVar = this.a;
        }
        return new cdb(e0gVar, this.b);
    }

    public final e0g b() {
        return this.b;
    }

    public final e0g c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof cdb)) {
            cdb cdbVar = (cdb) obj;
            if (x44.r(this.a, cdbVar.a) && x44.r(this.b, cdbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
