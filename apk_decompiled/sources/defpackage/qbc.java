package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class qbc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final byte m;
    public final byte n;
    public final byte o;

    public qbc(pbc pbcVar) {
        int i = pbcVar.a;
        ByteBuffer byteBuffer = pbcVar.b;
        fd9.E(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        dg2 dg2Var = new dg2(bArr, iRemaining);
        this.g = dg2Var.g(3);
        dg2Var.n();
        boolean zF = dg2Var.f();
        this.a = zF;
        if (zF) {
            dg2Var.g(5);
            this.b = false;
            this.h = false;
        } else {
            if (dg2Var.f()) {
                dg2Var.o(64);
                if (dg2Var.f()) {
                    int i2 = 0;
                    while (!dg2Var.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        dg2Var.o(i2);
                    }
                }
                boolean zF2 = dg2Var.f();
                this.b = zF2;
                if (zF2) {
                    dg2Var.o(47);
                }
            } else {
                this.b = false;
            }
            this.h = dg2Var.f();
            int iG = dg2Var.g(5);
            for (int i3 = 0; i3 <= iG; i3++) {
                dg2Var.o(12);
                if (i3 == 0) {
                    if (dg2Var.g(5) > 7) {
                        dg2Var.f();
                    }
                } else if (dg2Var.g(5) > 7) {
                    dg2Var.n();
                }
                if (this.b) {
                    dg2Var.n();
                }
                if (this.h && dg2Var.f()) {
                    if (i3 == 0) {
                        dg2Var.g(4);
                    } else {
                        dg2Var.o(4);
                    }
                }
            }
        }
        int iG2 = dg2Var.g(4);
        int iG3 = dg2Var.g(4);
        dg2Var.o(iG2 + 1);
        dg2Var.o(iG3 + 1);
        if (this.a) {
            this.c = false;
        } else {
            this.c = dg2Var.f();
        }
        if (this.c) {
            dg2Var.o(4);
            dg2Var.o(3);
        }
        dg2Var.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            dg2Var.o(4);
            boolean zF3 = dg2Var.f();
            if (zF3) {
                dg2Var.o(2);
            }
            if (dg2Var.f()) {
                this.d = true;
            } else {
                this.d = dg2Var.f();
            }
            if (!this.d || dg2Var.f()) {
                this.e = true;
            } else {
                this.e = dg2Var.f();
            }
            if (zF3) {
                this.f = dg2Var.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        dg2Var.o(3);
        boolean zF4 = dg2Var.f();
        if (this.g == 2 && zF4) {
            this.i = dg2Var.f();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = dg2Var.f();
        } else {
            this.j = false;
        }
        if (dg2Var.f()) {
            this.m = (byte) dg2Var.g(8);
            this.n = (byte) dg2Var.g(8);
            this.o = (byte) dg2Var.g(8);
        } else {
            this.m = (byte) 0;
            this.n = (byte) 0;
            this.o = (byte) 0;
        }
        if (this.j) {
            dg2Var.n();
            this.k = false;
            this.l = false;
        } else if (this.m == 1 && this.n == 13 && this.o == 0) {
            this.k = false;
            this.l = false;
        } else {
            dg2Var.n();
            int i4 = this.g;
            if (i4 == 0) {
                this.k = true;
                this.l = true;
            } else if (i4 == 1) {
                this.k = false;
                this.l = false;
            } else if (this.i) {
                boolean zF5 = dg2Var.f();
                this.k = zF5;
                if (zF5) {
                    this.l = dg2Var.f();
                } else {
                    this.l = false;
                }
            } else {
                this.k = true;
                this.l = false;
            }
            if (this.k && this.l) {
                dg2Var.g(2);
            }
        }
        dg2Var.n();
    }
}
