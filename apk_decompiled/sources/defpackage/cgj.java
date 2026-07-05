package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cgj extends m08 implements uz7 {
    public static final cgj E = new cgj(6, dgj.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.uz7
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        fg4 fg4Var = (fg4) obj2;
        ggj ggjVar = (ggj) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        j4i j4iVar = (j4i) obj5;
        xhd xhdVar = (xhd) obj6;
        context.getClass();
        fg4Var.getClass();
        ggjVar.getClass();
        workDatabase.getClass();
        j4iVar.getClass();
        xhdVar.getClass();
        int i = b7f.a;
        t1h t1hVar = new t1h(context, workDatabase, fg4Var);
        anc.a(context, SystemJobService.class, true);
        nga.c().getClass();
        return x44.X(t1hVar, new va8(context, fg4Var, j4iVar, xhdVar, new cbf(xhdVar, ggjVar), ggjVar));
    }
}
