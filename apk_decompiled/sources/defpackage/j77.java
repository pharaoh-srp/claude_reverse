package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j77 implements mee {
    public final v77 E;
    public boolean F;

    public j77(v77 v77Var) {
        this.E = v77Var;
    }

    @Override // defpackage.mee
    public final void a() {
        c();
    }

    @Override // defpackage.mee
    public final void b() {
        c();
    }

    public final void c() {
        String str;
        boolean zB;
        Context context;
        if (this.F) {
            return;
        }
        this.F = true;
        sfa sfaVar = sfa.DEBUG;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str2 = "releasing ExoPlayer " + this.E;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "ClaudeVideoPlayer", str2);
                }
            }
        }
        v77 v77Var = this.E;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(v77Var)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(tpi.a);
        sb.append("] [");
        HashSet hashSet = k7b.a;
        synchronized (k7b.class) {
            str = k7b.b;
        }
        sb.append(str);
        sb.append("]");
        ysj.n("ExoPlayerImpl", sb.toString());
        v77Var.F();
        v77Var.y.h(false);
        v77Var.z.g(false);
        v77Var.A.d(false);
        xv8 xv8Var = v77Var.E;
        if (xv8Var != null && Build.VERSION.SDK_INT >= 34 && (context = (Context) ((WeakReference) xv8Var.F).get()) != null) {
            context.unregisterDeviceIdChangeListener((u77) xv8Var.G);
        }
        co1 co1Var = v77Var.D;
        ((k1h) co1Var.f).a.removeCallbacksAndMessages(null);
        ((v77) co1Var.a).x((utg) co1Var.b);
        d87 d87Var = v77Var.l;
        if (d87Var.n0 || !d87Var.N.getThread().isAlive()) {
            zB = true;
        } else {
            d87Var.n0 = true;
            hf4 hf4Var = new hf4(d87Var.T);
            d87Var.L.b(7, hf4Var).b();
            zB = hf4Var.b(d87Var.Y);
        }
        if (!zB) {
            v77Var.m.e(10, new ep5(26));
        }
        v77Var.m.d();
        v77Var.j.a.removeCallbacksAndMessages(null);
        yp5 yp5Var = v77Var.u;
        hp5 hp5Var = v77Var.s;
        CopyOnWriteArrayList<wc1> copyOnWriteArrayList2 = (CopyOnWriteArrayList) yp5Var.c.E;
        for (wc1 wc1Var : copyOnWriteArrayList2) {
            if (wc1Var.b == hp5Var) {
                wc1Var.c = true;
                copyOnWriteArrayList2.remove(wc1Var);
            }
        }
        j6d j6dVar = v77Var.d0;
        if (j6dVar.p) {
            v77Var.d0 = j6dVar.a();
        }
        j6d j6dVarS = v77.s(v77Var.d0, 1);
        v77Var.d0 = j6dVarS;
        j6d j6dVarC = j6dVarS.c(j6dVarS.b);
        v77Var.d0 = j6dVarC;
        j6dVarC.q = j6dVarC.s;
        v77Var.d0.r = 0L;
        hp5 hp5Var2 = v77Var.s;
        k1h k1hVar = hp5Var2.h;
        k1hVar.getClass();
        k1hVar.d(new fc(13, hp5Var2));
        v77Var.y();
        Surface surface = v77Var.P;
        if (surface != null) {
            surface.release();
            v77Var.P = null;
        }
        i12 i12Var = fd5.b;
        v77Var.a0 = true;
    }

    @Override // defpackage.mee
    public final void g() {
    }
}
