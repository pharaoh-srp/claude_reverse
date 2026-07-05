package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dlb {
    public final Object a;
    public final Object b;

    public dlb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlb)) {
            return false;
        }
        dlb dlbVar = (dlb) obj;
        return x44.r(this.a, dlbVar.a) && x44.r(this.b, dlbVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAppToolPayload(input=" + this.a + ", output=" + this.b + ")";
    }
}
