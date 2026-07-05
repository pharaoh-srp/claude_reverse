package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ykb extends jv8 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public ykb(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ykb.class != obj.getClass()) {
            return false;
        }
        ykb ykbVar = (ykb) obj;
        return this.b == ykbVar.b && this.c == ykbVar.c && this.d == ykbVar.d && Arrays.equals(this.e, ykbVar.e) && Arrays.equals(this.f, ykbVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((527 + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
