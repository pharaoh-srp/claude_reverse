package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r4i {
    public static final r4i b;
    public final nz8 a;

    static {
        iz8 iz8Var = nz8.F;
        b = new r4i(vde.I);
        tpi.w(0);
    }

    public r4i(vde vdeVar) {
        this.a = nz8.q(vdeVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            nz8 nz8Var = this.a;
            if (i2 >= nz8Var.size()) {
                return false;
            }
            q4i q4iVar = (q4i) nz8Var.get(i2);
            boolean[] zArr = q4iVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (q4iVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r4i.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r4i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
