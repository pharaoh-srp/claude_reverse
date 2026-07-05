package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class woj extends bk0 {
    public final umk a;
    public final jsk b;

    public woj(umk umkVar) {
        dgj.v(umkVar);
        this.a = umkVar;
        jsk jskVar = umkVar.T;
        umk.b(jskVar);
        this.b = jskVar;
    }

    @Override // defpackage.zwk
    public final int b(String str) {
        dgj.s(str);
        return 25;
    }

    @Override // defpackage.zwk
    public final void c(String str, String str2, Bundle bundle) {
        jsk jskVar = this.a.T;
        umk.b(jskVar);
        jskVar.W0(str, str2, bundle);
    }

    @Override // defpackage.zwk
    public final void d(String str) {
        umk umkVar = this.a;
        xoj xojVarH = umkVar.h();
        umkVar.R.getClass();
        xojVarH.P0(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.zwk
    public final void e(String str) {
        umk umkVar = this.a;
        xoj xojVarH = umkVar.h();
        umkVar.R.getClass();
        xojVarH.T0(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.zwk
    public final void f(Bundle bundle) {
        jsk jskVar = this.b;
        ((umk) jskVar.E).R.getClass();
        jskVar.n1(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.zwk
    public final String g() {
        vxk vxkVar = ((umk) this.b.E).S;
        umk.b(vxkVar);
        xxk xxkVar = vxkVar.G;
        if (xxkVar != null) {
            return xxkVar.a;
        }
        return null;
    }

    @Override // defpackage.zwk
    public final String h() {
        return (String) this.b.K.get();
    }

    @Override // defpackage.zwk
    public final Map i(String str, String str2, boolean z) {
        jsk jskVar = this.b;
        if (jskVar.O().V0()) {
            jskVar.b0().J.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (s4i.f()) {
            jskVar.b0().J.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        wlk wlkVar = ((umk) jskVar.E).N;
        umk.d(wlkVar);
        wlkVar.O0(atomicReference, 5000L, "get user properties", new vvk(jskVar, atomicReference, str, str2, z, 0));
        List<e1l> list = (List) atomicReference.get();
        if (list == null) {
            jskVar.b0().J.c("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        bp0 bp0Var = new bp0(list.size());
        for (e1l e1lVar : list) {
            Object objZza = e1lVar.zza();
            if (objZza != null) {
                bp0Var.put(e1lVar.F, objZza);
            }
        }
        return bp0Var;
    }

    @Override // defpackage.zwk
    public final String j() {
        return (String) this.b.K.get();
    }

    @Override // defpackage.zwk
    public final void k(String str, String str2, Bundle bundle) {
        jsk jskVar = this.b;
        ((umk) jskVar.E).R.getClass();
        jskVar.X0(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // defpackage.zwk
    public final String l() {
        vxk vxkVar = ((umk) this.b.E).S;
        umk.b(vxkVar);
        xxk xxkVar = vxkVar.G;
        if (xxkVar != null) {
            return xxkVar.b;
        }
        return null;
    }

    @Override // defpackage.zwk
    public final List m(String str, String str2) {
        jsk jskVar = this.b;
        if (jskVar.O().V0()) {
            jskVar.b0().J.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (s4i.f()) {
            jskVar.b0().J.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        wlk wlkVar = ((umk) jskVar.E).N;
        umk.d(wlkVar);
        wlkVar.O0(atomicReference, 5000L, "get conditional user properties", new me2(jskVar, atomicReference, str, str2, 3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return h1l.F1(list);
        }
        jskVar.b0().J.c("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    @Override // defpackage.zwk
    public final long zza() {
        h1l h1lVar = this.a.P;
        umk.c(h1lVar);
        return h1lVar.U1();
    }
}
