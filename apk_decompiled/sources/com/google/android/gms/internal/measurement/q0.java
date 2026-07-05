package com.google.android.gms.internal.measurement;

import defpackage.b0l;
import defpackage.bnh;
import defpackage.gkk;
import defpackage.ij0;
import defpackage.nxk;
import defpackage.p0l;
import defpackage.suk;
import defpackage.usk;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements b0l {
    public final l0 a;

    public q0(l0 l0Var) {
        this.a = l0Var;
    }

    public static q0 i(l0 l0Var) {
        return new q0(l0Var);
    }

    @Override // defpackage.b0l
    public final boolean a(Object obj) {
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.b0l
    public final void b(Object obj, byte[] bArr, int i, int i2, usk uskVar) {
        n0 n0Var = (n0) obj;
        if (n0Var.zzb == p0l.f) {
            n0Var.zzb = p0l.e();
        }
        throw ij0.e(obj);
    }

    @Override // defpackage.b0l
    public final void c(Object obj) {
        p0l p0lVar = ((n0) obj).zzb;
        if (p0lVar.e) {
            p0lVar.e = false;
        }
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.b0l
    public final int d(n0 n0Var) {
        p0l p0lVar = n0Var.zzb;
        int i = p0lVar.d;
        if (i != -1) {
            return i;
        }
        int iM = 0;
        for (int i2 = 0; i2 < p0lVar.a; i2++) {
            int i3 = p0lVar.b[i2] >>> 3;
            iM += m0.m(3, (suk) p0lVar.c[i2]) + gkk.e(i3, m0.t(16), m0.t(8) << 1);
        }
        p0lVar.d = iM;
        return iM;
    }

    @Override // defpackage.b0l
    public final boolean e(n0 n0Var, n0 n0Var2) {
        return n0Var.zzb.equals(n0Var2.zzb);
    }

    @Override // defpackage.b0l
    public final void f(Object obj, Object obj2) {
        r0.b(obj, obj2);
    }

    @Override // defpackage.b0l
    public final void g(Object obj, bnh bnhVar) {
        ij0.x(obj);
        throw null;
    }

    @Override // defpackage.b0l
    public final int h(n0 n0Var) {
        return n0Var.zzb.hashCode();
    }

    @Override // defpackage.b0l
    public final n0 zza() {
        l0 l0Var = this.a;
        if (l0Var instanceof n0) {
            return (n0) ((n0) l0Var).e(4);
        }
        nxk nxkVar = (nxk) ((n0) l0Var).e(5);
        boolean zO = nxkVar.F.o();
        n0 n0Var = nxkVar.F;
        if (!zO) {
            return n0Var;
        }
        n0Var.m();
        return nxkVar.F;
    }
}
