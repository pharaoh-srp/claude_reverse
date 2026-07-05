package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qag {
    public final String a;
    public final Object b;
    public final int c;

    public qag(int i, Object obj, String str) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qag)) {
            return false;
        }
        qag qagVar = (qag) obj;
        return this.a.equals(qagVar.a) && x44.r(this.b, qagVar.b) && this.c == qagVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotEntry(key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", position=");
        return vb7.l(this.c, ")", sb);
    }
}
