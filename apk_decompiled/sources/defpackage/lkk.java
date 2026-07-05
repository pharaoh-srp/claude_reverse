package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lkk implements klk {
    public final h8k a;
    public final xxi b;

    public lkk(xxi xxiVar, h8k h8kVar) {
        byi byiVar = ock.a;
        this.b = xxiVar;
        this.a = h8kVar;
    }

    public static lkk j(xxi xxiVar, h8k h8kVar) {
        byi byiVar = ock.a;
        return new lkk(xxiVar, h8kVar);
    }

    @Override // defpackage.klk
    public final zdk a() {
        h8k h8kVar = this.a;
        if (h8kVar instanceof zdk) {
            return ((zdk) h8kVar).n();
        }
        mdk mdkVar = (mdk) ((zdk) h8kVar).j(5);
        boolean zH = mdkVar.F.h();
        zdk zdkVar = mdkVar.F;
        if (!zH) {
            return zdkVar;
        }
        zdkVar.getClass();
        zkk.c.a(zdkVar.getClass()).b(zdkVar);
        zdkVar.e();
        return mdkVar.F;
    }

    @Override // defpackage.klk
    public final void b(Object obj) {
        this.b.getClass();
        vnk vnkVar = ((zdk) obj).zzc;
        if (vnkVar.e) {
            vnkVar.e = false;
        }
        byi byiVar = ock.a;
        throw ij0.e(obj);
    }

    @Override // defpackage.klk
    public final void c(Object obj, w9h w9hVar) {
        throw ij0.e(obj);
    }

    @Override // defpackage.klk
    public final int d(zdk zdkVar) {
        return zdkVar.zzc.hashCode();
    }

    @Override // defpackage.klk
    public final boolean e(zdk zdkVar, zdk zdkVar2) {
        return zdkVar.zzc.equals(zdkVar2.zzc);
    }

    @Override // defpackage.klk
    public final boolean f(Object obj) {
        throw ij0.e(obj);
    }

    @Override // defpackage.klk
    public final void g(Object obj, byte[] bArr, int i, int i2, po0 po0Var) {
        zdk zdkVar = (zdk) obj;
        if (zdkVar.zzc == vnk.f) {
            zdkVar.zzc = vnk.b();
        }
        throw ij0.e(obj);
    }

    @Override // defpackage.klk
    public final void h(Object obj, Object obj2) {
        olk.p(obj, obj2);
    }

    @Override // defpackage.klk
    public final int i(h8k h8kVar) {
        vnk vnkVar = ((zdk) h8kVar).zzc;
        int i = vnkVar.d;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < vnkVar.a; i2++) {
            int i3 = vnkVar.b[i2] >>> 3;
            w9k w9kVar = (w9k) vnkVar.c[i2];
            int iO = xak.o(8);
            int iO2 = xak.o(i3) + xak.o(16);
            int iO3 = xak.o(24);
            int iG = w9kVar.g();
            iC += iO + iO + iO2 + gkk.c(iG, iG, iO3);
        }
        vnkVar.d = iC;
        return iC;
    }
}
