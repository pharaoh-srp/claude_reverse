package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class xg8 implements xd7, yd7, cec {
    public long E;
    public Object F;

    public xg8(xd7 xd7Var, long j) {
        this.F = xd7Var;
        fd9.E(xd7Var.getPosition() >= j);
        this.E = j;
    }

    public static void x(xg8 xg8Var) {
        xg8Var.E = 0L;
    }

    @Override // defpackage.xd7
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((xd7) this.F).a(bArr, 0, i2, z);
    }

    @Override // defpackage.xd7
    public boolean c(int i, boolean z) {
        return ((xd7) this.F).c(i, true);
    }

    @Override // defpackage.xd7
    public boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((xd7) this.F).d(bArr, i, i2, z);
    }

    @Override // defpackage.xd7
    public long e() {
        return ((xd7) this.F).e() - this.E;
    }

    @Override // defpackage.xd7
    public void f(int i) {
        ((xd7) this.F).f(i);
    }

    @Override // defpackage.xd7
    public int g(int i) {
        return ((xd7) this.F).g(i);
    }

    @Override // defpackage.xd7
    public long getLength() {
        return ((xd7) this.F).getLength() - this.E;
    }

    @Override // defpackage.xd7
    public long getPosition() {
        return ((xd7) this.F).getPosition() - this.E;
    }

    @Override // defpackage.xd7
    public int h(byte[] bArr, int i, int i2) {
        return ((xd7) this.F).h(bArr, i, i2);
    }

    @Override // defpackage.yd7
    public void j() {
        ((yd7) this.F).j();
    }

    @Override // defpackage.xd7
    public void k() {
        ((xd7) this.F).k();
    }

    @Override // defpackage.xd7
    public void l(int i) {
        ((xd7) this.F).l(i);
    }

    @Override // defpackage.yd7
    public y3i n(int i, int i2) {
        return ((yd7) this.F).n(i, i2);
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        ire ireVar = (ire) this.F;
        ((AtomicLong) ireVar.G).set(this.E);
    }

    @Override // defpackage.xd7
    public void p(byte[] bArr, int i, int i2) {
        ((xd7) this.F).p(bArr, i, i2);
    }

    @Override // defpackage.yd7
    public void q(vef vefVar) {
        ((yd7) this.F).q(new glg(this, vefVar, vefVar));
    }

    public long r(float f, long j, boolean z) {
        long jI;
        long j2 = this.E;
        if (z) {
            jI = fcc.i(j2, j);
            this.E = jI;
        } else {
            jI = fcc.i(j2, j);
        }
        if ((((ukc) this.F) == null ? fcc.d(jI) : Math.abs(u(jI))) < f) {
            return 9205357640488583168L;
        }
        ukc ukcVar = (ukc) this.F;
        long j3 = this.E;
        if (ukcVar == null) {
            return fcc.h(this.E, fcc.j(f, fcc.b(fcc.d(j3), j3)));
        }
        float fU = u(j3) - (Math.signum(u(this.E)) * f);
        long j4 = this.E;
        ukc ukcVar2 = (ukc) this.F;
        ukc ukcVar3 = ukc.F;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ukcVar2 == ukcVar3 ? j4 & 4294967295L : j4 >> 32));
        if (((ukc) this.F) != ukcVar3) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fU)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fU)) << 32);
    }

    @Override // defpackage.og5
    public int read(byte[] bArr, int i, int i2) {
        return ((xd7) this.F).read(bArr, i, i2);
    }

    @Override // defpackage.xd7
    public void readFully(byte[] bArr, int i, int i2) {
        ((xd7) this.F).readFully(bArr, i, i2);
    }

    public boolean t(long j) {
        long jI = fcc.i(this.E, j);
        double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jI & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jI >> 32))))) * 180.0f)) / 3.141592653589793d;
        ukc ukcVar = (ukc) this.F;
        int i = ukcVar == null ? -1 : f3i.a[ukcVar.ordinal()];
        if (i != 1) {
            if (i != 2 || dAtan2 <= 30.0d) {
                return false;
            }
        } else if (dAtan2 >= 30.0d) {
            return false;
        }
        return true;
    }

    public float u(long j) {
        return Float.intBitsToFloat((int) (((ukc) this.F) == ukc.F ? j >> 32 : j & 4294967295L));
    }

    public wg8 v() {
        gmf gmfVar = new gmf(16);
        while (true) {
            String strO = ((BufferedSource) this.F).O(this.E);
            this.E -= (long) strO.length();
            if (strO.length() == 0) {
                return gmfVar.v();
            }
            int iF0 = bsg.F0(strO, ':', 1, 4);
            if (iF0 != -1) {
                skj.a(gmfVar, strO.substring(0, iF0), strO.substring(iF0 + 1));
            } else if (strO.charAt(0) == ':') {
                skj.a(gmfVar, "", strO.substring(1));
            } else {
                skj.a(gmfVar, "", strO);
            }
        }
    }

    public void w(long j) {
        this.E = j;
    }

    public void y(ukc ukcVar) {
        this.F = ukcVar;
    }

    public /* synthetic */ xg8(Object obj, long j) {
        this.F = obj;
        this.E = j;
    }

    public /* synthetic */ xg8(long j, Object obj) {
        this.E = j;
        this.F = obj;
    }

    public /* synthetic */ xg8(ukc ukcVar, int i) {
        this((Object) ((i & 1) != 0 ? null : ukcVar), 0L);
    }
}
