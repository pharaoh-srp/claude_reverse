package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rok implements ub0, tr9, jrk {
    public Object E;

    public rok(int i) {
        switch (i) {
            case 4:
                this.E = new ArrayList();
                break;
            case 5:
                this.E = new Object();
                break;
            case 6:
            default:
                xub xubVar = x69.a;
                this.E = new xub();
                break;
            case 7:
                this.E = mpk.P(Boolean.FALSE);
                break;
        }
    }

    public static /* synthetic */ void k0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public abstract void A0(String[] strArr);

    public abstract double B0(long j, Object obj);

    public abstract float C0(long j, Object obj);

    public abstract void D0(Object obj, long j, boolean z);

    public abstract void E0(Object obj, long j, byte b);

    public abstract void F0(Object obj, long j, double d);

    public abstract void G0(Object obj, long j, float f);

    @Override // defpackage.tr9
    public void H(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.E).add((String) obj);
        }
    }

    public abstract boolean H0(long j, Object obj);

    public vik I0() {
        vik vikVar = ((umk) this.E).L;
        umk.c(vikVar);
        return vikVar;
    }

    public h1l J0() {
        h1l h1lVar = ((umk) this.E).P;
        umk.c(h1lVar);
        return h1lVar;
    }

    @Override // defpackage.tr9
    public void K(gh3 gh3Var, sxb sxbVar) {
    }

    public void K0() {
        wlk wlkVar = ((umk) this.E).N;
        umk.d(wlkVar);
        wlkVar.K0();
    }

    @Override // defpackage.jrk
    public wlk O() {
        wlk wlkVar = ((umk) this.E).N;
        umk.d(wlkVar);
        return wlkVar;
    }

    @Override // defpackage.jrk
    public qgk b0() {
        qgk qgkVar = ((umk) this.E).M;
        umk.d(qgkVar);
        return qgkVar;
    }

    @Override // defpackage.ub0
    public wc0 getAnnotations() {
        wc0 wc0Var = (wc0) this.E;
        if (wc0Var != null) {
            return wc0Var;
        }
        k0(1);
        throw null;
    }

    @Override // defpackage.tr9
    public void j() {
        A0((String[]) ((ArrayList) this.E).toArray(new String[0]));
    }

    @Override // defpackage.tr9
    public void j0(jh3 jh3Var) {
    }

    @Override // defpackage.jrk
    public s4i k() {
        return ((umk) this.E).J;
    }

    public abstract void l0(mkf mkfVar);

    @Override // defpackage.tr9
    public sr9 m(gh3 gh3Var) {
        return null;
    }

    public abstract void m0();

    public abstract void n0(k3a k3aVar, String str);

    public abstract void o0();

    public abstract oz9 p0(int i, int i2, int i3, long j);

    public abstract Object q0();

    public eyh r0() {
        return eyh.F;
    }

    public List s0(nz9 nz9Var, int i, long j) {
        xub xubVar = (xub) this.E;
        List list = (List) xubVar.b(i);
        if (list != null) {
            return list;
        }
        List listA = nz9Var.a(i);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((h5b) listA.get(i2)).u(j));
        }
        xubVar.i(i, arrayList);
        return arrayList;
    }

    public abstract Object t0();

    public void u0(k3a k3aVar, String str) {
        if (((k3a) this.E).compareTo(k3aVar) <= 0) {
            n0(k3aVar, str);
        }
    }

    public abstract bz7 v0(mkf mkfVar);

    public abstract void w0(gh2 gh2Var);

    public abstract void x0(Object obj);

    public abstract void y0(a6i a6iVar);

    public abstract void z0();

    @Override // defpackage.jrk
    public Context zza() {
        return ((umk) this.E).E;
    }

    @Override // defpackage.jrk
    public ql8 zzb() {
        return ((umk) this.E).R;
    }

    public rok(umk umkVar) {
        dgj.v(umkVar);
        this.E = umkVar;
    }

    public rok(wc0 wc0Var) {
        if (wc0Var != null) {
            this.E = wc0Var;
        } else {
            k0(0);
            throw null;
        }
    }

    public /* synthetic */ rok(Object obj) {
        this.E = obj;
    }
}
