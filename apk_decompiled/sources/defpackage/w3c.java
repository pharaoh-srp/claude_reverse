package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class w3c implements jhd, b5f, fe7, lqj {
    public final /* synthetic */ int E;
    public final Object F;
    public Object G;
    public Object H;

    public w3c(byte b, int i) {
        this.E = i;
        switch (i) {
            case 9:
                this.F = new AtomicReference(mwa.d);
                this.G = new Object();
                break;
            case 12:
                this.F = new WeakHashMap();
                this.G = new WeakHashMap();
                this.H = new WeakHashMap();
                break;
            default:
                long[] jArr = u6f.a;
                this.F = new ewb();
                break;
        }
    }

    public static Object j(w3c w3cVar, String str, Serializable serializable, xzg xzgVar, int i) {
        return w3cVar.i(str, serializable, false, ((AtomicInteger) ((cbf) w3cVar.F).G).incrementAndGet(), xzgVar);
    }

    public void a(a aVar) {
        pl9 pl9Var = (pl9) this.F;
        for (cpc cpcVar : (ArrayList) this.G) {
            pl9 pl9Var2 = (pl9) cpcVar.E;
            KSerializer kSerializer = (KSerializer) cpcVar.F;
            pl9Var2.getClass();
            kSerializer.getClass();
            a.i(aVar, pl9Var, pl9Var2, kSerializer);
        }
        bz7 bz7Var = (bz7) this.H;
        if (bz7Var != null) {
            aVar.e(pl9Var, bz7Var);
        }
    }

    public void b(bz7 bz7Var) {
        if (((bz7) this.H) == null) {
            this.H = bz7Var;
            return;
        }
        StringBuilder sb = new StringBuilder("Default deserializer provider is already registered for class ");
        sb.append((pl9) this.F);
        pmf.l(sb, ": ", (bz7) this.H);
    }

    public void c(Object obj) {
        long jQ = zni.q();
        if (jQ == coh.a) {
            this.H = obj;
            return;
        }
        synchronized (this.G) {
            xnh xnhVar = (xnh) ((AtomicReference) this.F).get();
            int iA = xnhVar.a(jQ);
            if (iA < 0) {
                ((AtomicReference) this.F).set(xnhVar.b(jQ, obj));
            } else {
                xnhVar.c[iA] = obj;
            }
        }
    }

    @Override // defpackage.jhd
    public void d() {
    }

    public void e(pl9 pl9Var, KSerializer kSerializer) {
        pl9Var.getClass();
        kSerializer.getClass();
        ((ArrayList) this.G).add(new cpc(pl9Var, kSerializer));
    }

    public void f() {
        ewb ewbVar = (ewb) this.F;
        String str = (String) this.G;
        List list = (List) ewbVar.k(str);
        if (list != null) {
            list.remove((zy7) this.H);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ewbVar.m(str, list);
    }

    @Override // defpackage.jhd
    public void g() {
        bgj bgjVar;
        Context context = (Context) ((WeakReference) this.H).get();
        if (context != null) {
            synchronized (bgj.m) {
                try {
                    bgjVar = bgj.k;
                    if (bgjVar == null) {
                        bgjVar = bgj.l;
                    }
                } finally {
                }
            }
            if (bgjVar != null) {
                String str = (String) this.F;
                h99 h99Var = (h99) this.G;
                str.getClass();
                h99Var.getClass();
                try {
                    bgj bgjVarD = bgj.d(context);
                    bgjVarD.getClass();
                    String strConcat = "DatadogBackgroundUpload/".concat(str);
                    zp3 zp3Var = bgjVarD.b.m;
                    String strConcat2 = "CancelWorkByTag_".concat(strConcat);
                    knf knfVar = bgjVarD.d.a;
                    knfVar.getClass();
                    nai.R(zp3Var, strConcat2, knfVar, new sa2(bgjVarD, strConcat));
                } catch (IllegalStateException e) {
                    dch.I(h99Var, 5, x44.X(g99.F, g99.G), tnh.R, e, 48);
                }
            }
        }
    }

    @Override // defpackage.ivd
    public Object get() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 6:
                return new fj0((Context) ((ivd) obj).get(), ((ivd) this.G).get(), ((efk) this.H).get());
            case 9:
                long jQ = zni.q();
                if (jQ == coh.a) {
                    return this.H;
                }
                xnh xnhVar = (xnh) ((AtomicReference) obj).get();
                int iA = xnhVar.a(jQ);
                if (iA >= 0) {
                    return xnhVar.c[iA];
                }
                return null;
            default:
                return new n6i(new g6j(0), new cli(0), (gt5) ((el5) obj).get(), (wk) ((ra4) this.G).get(), (dpf) ((dpf) this.H).get());
        }
    }

    @Override // defpackage.jhd
    public void h() {
    }

    public Object i(String str, Object obj, boolean z, int i, vp4 vp4Var) {
        Object objN = fd9.N(new n7(this, i, z, str, obj, null), vp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    @Override // defpackage.jhd
    public void k() {
        bgj bgjVar;
        Context context = (Context) ((WeakReference) this.H).get();
        if (context != null) {
            synchronized (bgj.m) {
                try {
                    bgjVar = bgj.k;
                    if (bgjVar == null) {
                        bgjVar = bgj.l;
                    }
                } finally {
                }
            }
            if (bgjVar != null) {
                hgj.b(context, (String) this.F, (h99) this.G);
            }
        }
    }

    @Override // defpackage.lqj
    public Object zza() {
        return new dfk((m3l) ((lqj) this.F).zza(), (pyj) ((lqj) this.G).zza(), ((kf5) ((hsi) this.H).F).a);
    }

    public w3c(Context context, String str, h99 h99Var) {
        this.E = 4;
        context.getClass();
        str.getClass();
        h99Var.getClass();
        this.F = str;
        this.G = h99Var;
        this.H = new WeakReference(context);
    }

    public w3c(f16 f16Var, gmf gmfVar) {
        this.E = 1;
        this.F = f16Var;
        this.G = gmfVar;
        this.H = new ConcurrentHashMap();
    }

    public w3c(pl9 pl9Var) {
        this.E = 2;
        pl9Var.getClass();
        this.F = pl9Var;
        this.G = new ArrayList();
    }

    public w3c(s7e s7eVar) {
        this.E = 0;
        this.F = new t11(0);
        this.G = new el5(2);
        this.H = new vc8(this, 15, s7eVar);
    }

    public w3c(pz7 pz7Var, bz7 bz7Var, rz7 rz7Var, rz7 rz7Var2) {
        this.E = 7;
        this.F = new cbf(3);
        this.G = new cyf(bz7Var, pz7Var);
        this.H = new cbf(rz7Var, 1, rz7Var2);
    }

    public w3c(rz7 rz7Var, rz7 rz7Var2, bz7 bz7Var) {
        this.E = 8;
        this.F = new cbf(3);
        this.G = new gmf(rz7Var, rz7Var2);
        this.H = new tk5(25, bz7Var);
    }

    public /* synthetic */ w3c(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public w3c(int i) {
        this.E = 10;
        this.F = i != 1 ? new zna(i) : null;
    }
}
