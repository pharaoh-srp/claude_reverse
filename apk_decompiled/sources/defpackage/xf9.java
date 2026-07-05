package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf9 {
    public final Object a;
    public final Object b;

    public xf9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf9)) {
            return false;
        }
        xf9 xf9Var = (xf9) obj;
        return x44.r(this.a, xf9Var.a) && x44.r(this.b, xf9Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = 0;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 instanceof Enum) {
            iHashCode = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return iHashCode + iOrdinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
