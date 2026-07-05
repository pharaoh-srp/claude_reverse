package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class wfj {
    public final ggj a;
    public final xhd b;
    public final ahj c;

    static {
        nga.e("WMFgUpdater");
    }

    public wfj(WorkDatabase workDatabase, xhd xhdVar, ggj ggjVar) {
        this.b = xhdVar;
        this.a = ggjVar;
        this.c = workDatabase.w();
    }
}
