package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xac {
    public final int a;
    public final Integer b;

    public xac(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xac)) {
            return false;
        }
        xac xacVar = (xac) obj;
        return this.a == xacVar.a && x44.r(this.b, xacVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
