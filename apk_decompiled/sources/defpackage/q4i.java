package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q4i {
    public final int a;
    public final v3i b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        tpi.w(0);
        tpi.w(1);
        tpi.w(3);
        tpi.w(4);
    }

    public q4i(v3i v3iVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = v3iVar.a;
        this.a = i;
        boolean z2 = false;
        fd9.E(i == iArr.length && i == zArr.length);
        this.b = v3iVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4i.class == obj.getClass()) {
            q4i q4iVar = (q4i) obj;
            if (this.c == q4iVar.c && this.b.equals(q4iVar.b) && Arrays.equals(this.d, q4iVar.d) && Arrays.equals(this.e, q4iVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
