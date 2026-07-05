package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t7i {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(y3i y3iVar, x3i x3iVar) {
        if (this.c > 0) {
            y3iVar.a(this.d, this.e, this.f, this.g, x3iVar);
            this.c = 0;
        }
    }

    public final void b(y3i y3iVar, long j, int i, int i2, int i3, x3i x3iVar) {
        fd9.L("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(y3iVar, x3iVar);
            }
        }
    }

    public final void c(xd7 xd7Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        xd7Var.p(bArr, 0, 10);
        xd7Var.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
