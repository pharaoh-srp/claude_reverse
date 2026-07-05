package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.ahj;
import defpackage.bgj;
import defpackage.chj;
import defpackage.cve;
import defpackage.hdj;
import defpackage.j10;
import defpackage.jgj;
import defpackage.m1h;
import defpackage.mdj;
import defpackage.nga;
import defpackage.u00;
import defpackage.w26;
import defpackage.xaa;
import defpackage.yaa;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final xaa d() {
        bgj bgjVarD = bgj.d(this.a);
        bgjVarD.getClass();
        WorkDatabase workDatabase = bgjVarD.c;
        workDatabase.getClass();
        ahj ahjVarW = workDatabase.w();
        jgj jgjVarU = workDatabase.u();
        chj chjVarX = workDatabase.x();
        m1h m1hVarT = workDatabase.t();
        bgjVarD.b.d.getClass();
        List list = (List) u00.E(ahjVarW.a, true, false, new j10(System.currentTimeMillis() - 86400000, 8));
        cve cveVar = ahjVarW.a;
        List list2 = (List) u00.E(cveVar, true, false, new hdj(6));
        List list3 = (List) u00.E(cveVar, true, false, new hdj(9));
        if (!list.isEmpty()) {
            nga ngaVarC = nga.c();
            String str = w26.a;
            ngaVarC.d(str, "Recently completed work:\n\n");
            nga.c().d(str, w26.a(jgjVarU, chjVarX, m1hVarT, list));
        }
        if (!list2.isEmpty()) {
            nga ngaVarC2 = nga.c();
            String str2 = w26.a;
            ngaVarC2.d(str2, "Running work:\n\n");
            nga.c().d(str2, w26.a(jgjVarU, chjVarX, m1hVarT, list2));
        }
        if (!list3.isEmpty()) {
            nga ngaVarC3 = nga.c();
            String str3 = w26.a;
            ngaVarC3.d(str3, "Enqueued work:\n\n");
            nga.c().d(str3, w26.a(jgjVarU, chjVarX, m1hVarT, list3));
        }
        return yaa.a();
    }
}
