package defpackage;

import io.sentry.config.a;
import io.sentry.protocol.DebugImage;

/* JADX INFO: loaded from: classes2.dex */
public final class hw1 implements xcc, dsb {
    public long E;
    public long F;
    public Object G;
    public Object H;

    public hw1(long j, int i) {
        fd9.M(((ow) this.G) == null);
        this.E = j;
        this.F = j + ((long) i);
    }

    @Override // defpackage.dsb
    public boolean a(long j) {
        cu9 cu9Var = (cu9) ((xhf) this.G).a();
        if (cu9Var == null) {
            return true;
        }
        sif sifVar = (sif) this.H;
        long j2 = this.F;
        if (!cu9Var.n() || !uif.a(sifVar, j2)) {
            return false;
        }
        if (!((tif) sifVar).c(cu9Var, j, this.E, unb.M, false)) {
            return true;
        }
        this.E = j;
        return true;
    }

    @Override // defpackage.dsb
    public void b() {
        rhf rhfVar = ((tif) ((sif) this.H)).h;
        if (rhfVar != null) {
            rhfVar.a();
        }
    }

    @Override // defpackage.dsb
    public boolean c(long j, phf phfVar, int i) {
        cu9 cu9Var = (cu9) ((xhf) this.G).a();
        if (cu9Var == null) {
            return false;
        }
        sif sifVar = (sif) this.H;
        long j2 = this.F;
        if (!cu9Var.n()) {
            return false;
        }
        tif tifVar = (tif) sifVar;
        ci ciVar = tifVar.f;
        if (ciVar != null) {
            ciVar.i(Boolean.FALSE, cu9Var, new fcc(j), phfVar);
        }
        this.E = j;
        return uif.a(tifVar, j2);
    }

    @Override // defpackage.xcc
    public long d(xd7 xd7Var) {
        long j = this.F;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.F = -1L;
        return j2;
    }

    @Override // defpackage.dsb
    public boolean e(long j, phf phfVar) {
        cu9 cu9Var = (cu9) ((xhf) this.G).a();
        if (cu9Var == null) {
            return true;
        }
        sif sifVar = (sif) this.H;
        long j2 = this.F;
        if (!cu9Var.n() || !uif.a(sifVar, j2)) {
            return false;
        }
        if (!((tif) sifVar).c(cu9Var, j, this.E, phfVar, false)) {
            return true;
        }
        this.E = j;
        return true;
    }

    @Override // defpackage.dsb
    public boolean f(long j) {
        cu9 cu9Var = (cu9) ((xhf) this.G).a();
        if (cu9Var == null) {
            return false;
        }
        sif sifVar = (sif) this.H;
        long j2 = this.F;
        if (!cu9Var.n()) {
            return false;
        }
        tif tifVar = (tif) sifVar;
        if (tifVar.c(cu9Var, j, this.E, unb.M, false)) {
            this.E = j;
        }
        return uif.a(tifVar, j2);
    }

    public DebugImage g() {
        long j = this.E;
        String str = (String) this.H;
        if (str.isEmpty()) {
            return null;
        }
        DebugImage debugImage = new DebugImage();
        debugImage.setCodeId(str);
        debugImage.setCodeFile((String) this.G);
        String strB = a.b(str);
        if (strB != null) {
            str = strB;
        }
        debugImage.setDebugId(str);
        debugImage.setImageAddr(String.format("0x%x", Long.valueOf(j)));
        debugImage.setImageSize(this.F - j);
        debugImage.setType("elf");
        return debugImage;
    }

    @Override // defpackage.xcc
    public vef k() {
        fd9.M(this.E != -1);
        return new z91((zm7) this.G, this.E, 1);
    }

    @Override // defpackage.xcc
    public void l(long j) {
        long[] jArr = (long[]) ((i49) this.H).F;
        this.F = jArr[tpi.d(jArr, j, true)];
    }

    public hw1(String str, byte[] bArr, long j, long j2) {
        this.G = str;
        this.H = bArr;
        this.E = j;
        this.F = j2;
    }
}
