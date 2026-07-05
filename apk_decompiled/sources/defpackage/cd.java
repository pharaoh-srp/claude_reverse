package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import io.sentry.a1;
import io.sentry.android.core.internal.gestures.h;
import io.sentry.cache.a;
import io.sentry.cache.tape.b;
import io.sentry.cache.tape.e;
import io.sentry.cache.tape.j;
import io.sentry.e7;
import io.sentry.f1;
import io.sentry.f7;
import io.sentry.h7;
import io.sentry.i7;
import io.sentry.internal.debugmeta.c;
import io.sentry.j4;
import io.sentry.k7;
import io.sentry.n;
import io.sentry.r1;
import io.sentry.t5;
import io.sentry.t7;
import io.sentry.util.g;
import io.sentry.util.network.d;
import io.sentry.w6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd implements qc, mec, txd, gka, smi, j4, azg, k7, g, d {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ cd(h hVar, a1 a1Var) {
        this.E = 25;
        this.F = a1Var;
    }

    @Override // defpackage.smi
    public Set a() {
        List list = (List) ((m78) this.F).i("cuj_user_fault_error_codes", fbc.a);
        Set setT1 = list != null ? w44.t1(list) : null;
        return setT1 == null ? um6.E : setT1;
    }

    @Override // io.sentry.k7
    public void b(i7 i7Var) {
        f7 f7Var = (f7) this.F;
        n nVar = f7Var.q;
        if (nVar != null) {
            nVar.c(i7Var);
        }
        e7 e7Var = f7Var.f;
        t7 t7Var = f7Var.r;
        if (t7Var.i == null) {
            if (e7Var.a) {
                f7Var.A(e7Var.b, null);
                return;
            }
            return;
        }
        if (t7Var.h) {
            ListIterator listIterator = f7Var.c.listIterator();
            while (listIterator.hasNext()) {
                i7 i7Var2 = (i7) listIterator.next();
                if (!i7Var2.g && i7Var2.b == null) {
                    return;
                }
            }
        }
        f7Var.w();
    }

    @Override // io.sentry.util.network.d
    public c c(Object obj) {
        return io.sentry.okhttp.h.a((io.sentry.okhttp.h) this.F, (pqe) obj);
    }

    @Override // defpackage.gka
    public void d(long j, String str) {
        ((vkj) this.F).a.e(j, str);
    }

    @Override // defpackage.qc
    public void e(Object obj) {
        ((bz7) ((nwb) this.F).getValue()).invoke(obj);
    }

    @Override // io.sentry.util.g
    public Object f() {
        j jVar;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case androidx.health.platform.client.proto.g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((io.sentry.cache.c) obj).E.getSerializer();
            case androidx.health.platform.client.proto.g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                io.sentry.cache.g gVar = (io.sentry.cache.g) obj;
                w6 w6Var = gVar.a;
                File fileB = a.b(w6Var, ".scope-cache");
                if (fileB == null) {
                    w6Var.getLogger().h(t5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = w6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileE = j.e(file);
                    try {
                        try {
                            jVar = new j(file, randomAccessFileE, maxBreadcrumbs);
                        } catch (Throwable th) {
                            randomAccessFileE.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        w6Var.getLogger().d(t5.ERROR, "Failed to create breadcrumbs queue", e);
                        return new b();
                    }
                    break;
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = w6Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileE2 = j.e(file);
                    try {
                        jVar = new j(file, randomAccessFileE2, maxBreadcrumbs2);
                    } catch (Throwable th2) {
                        randomAccessFileE2.close();
                        throw th2;
                    }
                    break;
                }
                return new e(jVar, new io.sentry.d(gVar));
            default:
                return Boolean.valueOf(h.b((a1) obj, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // defpackage.txd
    public void g(hp1 hp1Var, List list) {
        m98 m98Var = (m98) this.F;
        hp1Var.getClass();
        m98Var.l.r(new d98(hp1Var, list));
    }

    public void h() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 14:
                f25 f25Var = (f25) obj;
                synchronized (ycg.c) {
                    ycg.i = w44.X0(ycg.i, f25Var);
                }
                ycg.a();
                return;
            default:
                pz7 pz7Var = (pz7) obj;
                synchronized (ycg.c) {
                    ycg.h = w44.X0(ycg.h, pz7Var);
                }
                return;
        }
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        h7 h7VarZ;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 9:
                z9e z9eVar = (z9e) obj;
                f1Var.getClass();
                String str = (String) f1Var.H().get("is_ant");
                z9eVar.E = str != null ? Boolean.parseBoolean(str) : false;
                break;
            case 10:
                f1Var.getClass();
                f1Var.O(new ja4((smf) obj, 4, f1Var));
                break;
            case 11:
                f1Var.getClass();
                f1Var.O(new ja4(f1Var, 5, (r1) obj));
                break;
            case 12:
                f1Var.getClass();
                ((dae) obj).E = f1Var.s();
                break;
            case 13:
                vmf vmfVar = (vmf) obj;
                f1Var.getClass();
                r1 r1VarS = f1Var.s();
                if (r1VarS != null) {
                    String name = r1VarS.getName();
                    name.getClass();
                    String strN = r1VarS.n();
                    strN.getClass();
                    if (name.equals("MainActivity") && strN.equals("ui.load")) {
                        f1Var.f("app_start_destination", vmfVar.E);
                        r1VarS.p();
                        break;
                    }
                }
                break;
            case 14:
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
            case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                h7 h7VarZ2 = f1Var.z();
                if (h7VarZ2 != null && h7VarZ2.c() != null) {
                    atomicBoolean.set(true);
                    break;
                }
                break;
            case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((AtomicReference) obj).set(f1Var.n());
                break;
            case androidx.health.platform.client.proto.g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                AtomicLong atomicLong = ((io.sentry.android.core.a1) obj).E;
                if (atomicLong.get() == 0 && (h7VarZ = f1Var.z()) != null && h7VarZ.c() != null) {
                    atomicLong.set(h7VarZ.c().getTime());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.azg
    public bzg j(w47 w47Var) {
        Context context = (Context) this.F;
        String str = (String) w47Var.d;
        g11 g11Var = (g11) w47Var.e;
        g11Var.getClass();
        if (str != null && str.length() != 0) {
            return new ry7(context, str, g11Var, true, true);
        }
        sz6.p("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public void k(jie jieVar, String str, String str2) {
        ((xe3) this.F).invoke(jieVar, str, str2);
    }

    @Override // defpackage.mec
    public void onSuccess(Object obj) {
        boolean z;
        y2i y2iVar = (y2i) obj;
        if (!((FirebaseMessaging) this.F).e.b() || y2iVar.h.a() == null) {
            return;
        }
        synchronized (y2iVar) {
            z = y2iVar.g;
        }
        if (z) {
            return;
        }
        y2iVar.f(0L);
    }

    public /* synthetic */ cd(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
