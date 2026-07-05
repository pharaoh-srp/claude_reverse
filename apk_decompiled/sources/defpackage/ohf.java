package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ohf {
    public final nhf a;
    public final nhf b;
    public final boolean c;

    public ohf(nhf nhfVar, nhf nhfVar2, boolean z) {
        this.a = nhfVar;
        this.b = nhfVar2;
        this.c = z;
    }

    public static ohf a(ohf ohfVar, nhf nhfVar, nhf nhfVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            nhfVar = ohfVar.a;
        }
        if ((i & 2) != 0) {
            nhfVar2 = ohfVar.b;
        }
        if ((i & 4) != 0) {
            z = ohfVar.c;
        }
        ohfVar.getClass();
        return new ohf(nhfVar, nhfVar2, z);
    }

    public final nhf b() {
        return this.b;
    }

    public final nhf c() {
        return this.a;
    }

    public final long d() {
        return mwa.m(this.a.b, this.b.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohf)) {
            return false;
        }
        ohf ohfVar = (ohf) obj;
        return x44.r(this.a, ohfVar.a) && x44.r(this.b, ohfVar.b) && this.c == ohfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return y6a.p(sb, this.c, ')');
    }
}
