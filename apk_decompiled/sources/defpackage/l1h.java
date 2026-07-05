package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l1h {
    public final String a;
    public final int b;
    public final int c;

    public l1h(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1h)) {
            return false;
        }
        l1h l1hVar = (l1h) obj;
        return x44.r(this.a, l1hVar.a) && this.b == l1hVar.b && this.c == l1hVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + vb7.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return vb7.r(sb, this.c, ')');
    }
}
