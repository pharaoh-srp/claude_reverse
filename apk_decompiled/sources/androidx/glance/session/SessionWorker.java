package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ctf;
import defpackage.e45;
import defpackage.ft5;
import defpackage.g86;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.pf5;
import defpackage.sz6;
import defpackage.tpa;
import defpackage.wsf;
import defpackage.xqh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lwsf;", "sessionManager", "Lxqh;", "timeouts", "Le45;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lwsf;Lxqh;Le45;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final wsf h;
    public final xqh i;
    public final e45 j;
    public final String k;

    public SessionWorker(Context context, WorkerParameters workerParameters, wsf wsfVar, xqh xqhVar, e45 e45Var) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = wsfVar;
        this.i = xqhVar;
        this.j = e45Var;
        pf5 pf5Var = this.b.b;
        wsfVar.getClass();
        String strC = pf5Var.c("KEY");
        if (strC != null) {
            this.k = strC;
        } else {
            sz6.j("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yvf
            if (r0 == 0) goto L13
            r0 = r6
            yvf r0 = (defpackage.yvf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            yvf r0 = new yvf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L45
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            xqh r6 = r5.i
            poc r6 = r6.d
            o6e r1 = new o6e
            r4 = 17
            r1.<init>(r5, r2, r4)
            r0.G = r3
            java.lang.Object r6 = defpackage.ssk.q(r6, r1, r0)
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L45
            return r5
        L45:
            yaa r6 = (defpackage.yaa) r6
            if (r6 != 0) goto L63
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.String r6 = "TIMEOUT_EXIT_REASON"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.put(r6, r0)
            pf5 r6 = new pf5
            r6.<init>(r5)
            defpackage.rvk.o(r6)
            xaa r5 = new xaa
            r5.<init>(r6)
            return r5
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.d(vp4):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e45 getJ() {
        return this.j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, wsf wsfVar, xqh xqhVar, e45 e45Var, int i, mq5 mq5Var) {
        wsf wsfVar2 = (i & 4) != 0 ? ctf.a : wsfVar;
        xqh xqhVar2 = (i & 8) != 0 ? new xqh() : xqhVar;
        if ((i & 16) != 0) {
            ft5 ft5Var = g86.a;
            e45Var = tpa.a;
        }
        this(context, workerParameters, wsfVar2, xqhVar2, e45Var);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, ctf.a, null, null, 24, null);
    }
}
