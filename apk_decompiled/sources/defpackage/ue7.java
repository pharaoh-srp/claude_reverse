package defpackage;

import android.content.SharedPreferences;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ue7 implements z47 {
    public long E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public ue7(vik vikVar, long j) {
        this.I = vikVar;
        dgj.s("health_monitor");
        dgj.o(j > 0);
        this.F = "health_monitor:start";
        this.G = "health_monitor:count";
        this.H = "health_monitor:value";
        this.E = j;
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.H;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            hwe hweVar = (hwe) it.next();
            hweVar.cancel();
            hwe hweVarB = hweVar.b();
            if (hweVarB != null) {
                ((z4e) this.F).q.addLast(hweVarB);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // defpackage.z47
    public g4e b() throws IOException {
        gwe gweVarE;
        long j;
        gwe gweVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.H).isEmpty() && !((z4e) this.F).a(null)) {
                    a();
                    iOException.getClass();
                    throw iOException;
                }
                if (((z4e) this.F).l.V) {
                    throw new IOException("Canceled");
                }
                tk5 tk5Var = ((q7h) this.G).a;
                long jNanoTime = System.nanoTime();
                long j2 = this.E - jNanoTime;
                if (((CopyOnWriteArrayList) this.H).isEmpty() || j2 <= 0) {
                    gweVarE = e();
                    j = 250000000;
                    this.E = jNanoTime + 250000000;
                } else {
                    j = j2;
                    gweVarE = null;
                }
                if (gweVarE == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.H;
                    if (copyOnWriteArrayList.isEmpty() || (gweVar = (gwe) ((LinkedBlockingDeque) this.I).poll(j, timeUnit)) == null) {
                        gweVarE = null;
                    } else {
                        copyOnWriteArrayList.remove(gweVar.a);
                        gweVarE = gweVar;
                    }
                    if (gweVarE == null) {
                    }
                }
                boolean z = false;
                if (gweVarE.b == null && gweVarE.c == null) {
                    a();
                    if (!gweVarE.a.a()) {
                        gweVarE = gweVarE.a.g();
                    }
                    if (gweVarE.b == null && gweVarE.c == null) {
                        z = true;
                    }
                    if (z) {
                        return gweVarE.a.c();
                    }
                }
                Throwable th = gweVarE.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        mwa.p(iOException, th);
                    }
                }
                hwe hweVar = gweVarE.b;
                if (hweVar != null) {
                    ((z4e) this.F).q.addFirst(hweVar);
                }
            } finally {
                a();
            }
        }
    }

    @Override // defpackage.z47
    public z4e c() {
        return (z4e) this.F;
    }

    public long d(long j) {
        a80 a80Var = (a80) this.H;
        long j2 = this.E;
        if (!((Boolean) ((loh) this.G).a()).booleanValue()) {
            return j;
        }
        float[] fArr = (float[]) this.I;
        long j3 = ((g79) ((loh) this.F).a()).a;
        nwa.e(fArr, d5i.b(j2) * ((int) (j3 >> 32)), d5i.c(j2) * ((int) (j3 & 4294967295L)), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, ((Number) a80Var.e()).floatValue(), ((Number) a80Var.e()).floatValue(), 1276);
        return yfd.a0(nwa.b((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), fArr));
    }

    public gwe e() {
        hwe le7Var;
        z4e z4eVar = (z4e) this.F;
        if (z4eVar.a(null)) {
            try {
                le7Var = z4eVar.b();
            } catch (Throwable th) {
                le7Var = new le7(th);
            }
            if (le7Var.a()) {
                return new gwe(le7Var, (Throwable) null, 6);
            }
            if (le7Var instanceof le7) {
                return ((le7) le7Var).a;
            }
            ((CopyOnWriteArrayList) this.H).add(le7Var);
            ((q7h) this.G).d().c(new te7(blj.b + " connect " + z4eVar.j.h.h(), le7Var, this), 0L);
        }
        return null;
    }

    public void f() {
        vik vikVar = (vik) this.I;
        vikVar.K0();
        ((umk) vikVar.E).R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = vikVar.T0().edit();
        editorEdit.remove((String) this.G);
        editorEdit.remove((String) this.H);
        editorEdit.putLong((String) this.F, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public ue7(z4e z4eVar, q7h q7hVar) {
        q7hVar.getClass();
        this.F = z4eVar;
        this.G = q7hVar;
        this.E = Long.MIN_VALUE;
        this.H = new CopyOnWriteArrayList();
        this.I = new LinkedBlockingDeque();
    }

    public ue7(loh lohVar, loh lohVar2) {
        this.F = lohVar;
        this.G = lohVar2;
        this.H = zh4.a(1.0f);
        this.I = nwa.a();
        this.E = d5i.b;
    }
}
