package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u5i implements t5i {
    public final Object a;
    public final Object b;

    public u5i(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.t5i
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.t5i
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t5i)) {
            return false;
        }
        t5i t5iVar = (t5i) obj;
        return x44.r(this.a, t5iVar.b()) && x44.r(this.b, t5iVar.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
