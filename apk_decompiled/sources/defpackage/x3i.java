package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x3i {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public x3i(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3i.class != obj.getClass()) {
            return false;
        }
        x3i x3iVar = (x3i) obj;
        return this.a == x3iVar.a && this.c == x3iVar.c && this.d == x3iVar.d && Arrays.equals(this.b, x3iVar.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
