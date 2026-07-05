package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class exg implements y3i {
    public final y3i a;
    public final bxg b;
    public dxg g;
    public jw7 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = tpi.b;
    public final ssc c = new ssc();

    public exg(y3i y3iVar, bxg bxgVar) {
        this.a = y3iVar;
        this.b = bxgVar;
    }

    @Override // defpackage.y3i
    public final void a(long j, int i, int i2, int i3, x3i x3iVar) {
        int i4;
        if (this.g == null) {
            this.a.a(j, i, i2, i3, x3iVar);
            return;
        }
        fd9.C("DRM on subtitles is not supported", x3iVar == null);
        int i5 = (this.e - i3) - i2;
        try {
            i4 = i5;
        } catch (RuntimeException e) {
            e = e;
            i4 = i5;
        }
        try {
            this.g.b(this.f, i4, i2, cxg.c, new gp5(this, j, i));
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (!this.i) {
                throw runtimeException;
            }
            ysj.v("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
        }
        int i6 = i4 + i2;
        this.d = i6;
        if (i6 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // defpackage.y3i
    public final void b(ssc sscVar, int i, int i2) {
        if (this.g == null) {
            this.a.b(sscVar, i, i2);
            return;
        }
        h(i);
        sscVar.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.y3i
    public final int f(og5 og5Var, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.f(og5Var, i, z);
        }
        h(i);
        int i2 = og5Var.read(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        sz6.n();
        return 0;
    }

    @Override // defpackage.y3i
    public final void g(jw7 jw7Var) {
        jw7Var.o.getClass();
        String str = jw7Var.o;
        fd9.E(gkb.f(str) == 3);
        boolean zEquals = jw7Var.equals(this.h);
        bxg bxgVar = this.b;
        if (!zEquals) {
            this.h = jw7Var;
            this.g = bxgVar.a(jw7Var) ? bxgVar.c(jw7Var) : null;
        }
        dxg dxgVar = this.g;
        y3i y3iVar = this.a;
        if (dxgVar == null) {
            y3iVar.g(jw7Var);
            return;
        }
        iw7 iw7VarA = jw7Var.a();
        iw7VarA.n = gkb.k("application/x-media3-cues");
        iw7VarA.j = str;
        iw7VarA.s = Long.MAX_VALUE;
        iw7VarA.L = bxgVar.e(jw7Var);
        qy1.n(iw7VarA, y3iVar);
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
