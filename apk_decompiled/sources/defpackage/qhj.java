package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qhj {
    public final tgj a;
    public final Context b;
    public final String c;
    public final ggj d;
    public final fg4 e;
    public final a5 f;
    public final xhd g;
    public final WorkDatabase h;
    public final ahj i;
    public final kz5 j;
    public final ArrayList k;
    public final String l;
    public final mf9 m;

    public qhj(hi6 hi6Var) {
        tgj tgjVar = (tgj) hi6Var.I;
        this.a = tgjVar;
        this.b = (Context) hi6Var.K;
        String str = tgjVar.a;
        this.c = str;
        this.d = (ggj) hi6Var.F;
        fg4 fg4Var = (fg4) hi6Var.E;
        this.e = fg4Var;
        this.f = fg4Var.d;
        this.g = (xhd) hi6Var.G;
        WorkDatabase workDatabase = (WorkDatabase) hi6Var.H;
        this.h = workDatabase;
        this.i = workDatabase.w();
        this.j = workDatabase.r();
        ArrayList arrayList = (ArrayList) hi6Var.J;
        this.k = arrayList;
        this.l = ij0.m(sq6.x("Work [ id=", str, ", tags={ "), w44.S0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = knk.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(final defpackage.qhj r18, defpackage.vp4 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhj.a(qhj, vp4):java.lang.Object");
    }

    public final void b(int i) {
        this.m.y(new WorkerStoppedException(i));
    }

    public final void c(int i) {
        ahj ahjVar = this.i;
        zfj zfjVar = zfj.E;
        String str = this.c;
        ahjVar.h(zfjVar, str);
        this.f.getClass();
        ahjVar.g(System.currentTimeMillis(), str);
        ahjVar.f(this.a.v, str);
        ahjVar.e(-1L, str);
        ahjVar.i(i, str);
    }

    public final void d() {
        this.f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ahj ahjVar = this.i;
        String str = this.c;
        ahjVar.g(jCurrentTimeMillis, str);
        ahjVar.h(zfj.E, str);
        cve cveVar = ahjVar.a;
        ((Number) u00.E(cveVar, false, true, new hti(str, 10))).intValue();
        ahjVar.f(this.a.v, str);
        u00.E(cveVar, false, true, new hti(str, 11));
        ahjVar.e(-1L, str);
    }

    public final void e(yaa yaaVar) {
        yaaVar.getClass();
        String str = this.c;
        ArrayList arrayListA0 = x44.a0(str);
        while (true) {
            boolean zIsEmpty = arrayListA0.isEmpty();
            ahj ahjVar = this.i;
            if (zIsEmpty) {
                pf5 pf5Var = ((vaa) yaaVar).a;
                pf5Var.getClass();
                ahjVar.f(this.a.v, str);
                u00.E(ahjVar.a, false, true, new nif(pf5Var, 23, str));
                return;
            }
            String str2 = (String) b54.z0(arrayListA0);
            if (ahjVar.c(str2) != zfj.J) {
                ahjVar.h(zfj.H, str2);
            }
            arrayListA0.addAll(this.j.a(str2));
        }
    }
}
