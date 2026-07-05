package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ie3 extends ke3 {
    public final Object a;
    public final Object b;
    public final String c;

    public ie3(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        StringBuilder sb = new StringBuilder();
        Class<?> cls = obj.getClass();
        kce kceVar = jce.a;
        String strD = kceVar.b(cls).d();
        sb.append(strD == null ? kceVar.b(obj.getClass()).f() : strD);
        sb.append('_');
        int iHashCode = obj.hashCode();
        gb9.q(36);
        String string = Integer.toString(iHashCode, 36);
        string.getClass();
        sb.append(string);
        this(obj, obj2, sb.toString());
    }

    @Override // defpackage.ke3
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.ke3
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return x44.r(this.a, ie3Var.a) && x44.r(this.b, ie3Var.b) && x44.r(this.c, ie3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(configuration=");
        sb.append(this.a);
        sb.append(", instance=");
        sb.append(this.b);
        sb.append(", key=");
        return vb7.s(sb, this.c, ')');
    }

    public ie3(Object obj, Object obj2, String str) {
        obj.getClass();
        obj2.getClass();
        str.getClass();
        this.a = obj;
        this.b = obj2;
        this.c = str;
    }
}
