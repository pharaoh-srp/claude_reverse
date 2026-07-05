package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ra2 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ WorkDatabase F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bgj H;

    public /* synthetic */ ra2(WorkDatabase workDatabase, String str, bgj bgjVar, int i) {
        this.E = i;
        this.F = workDatabase;
        this.G = str;
        this.H = bgjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        bgj bgjVar = this.H;
        String str = this.G;
        WorkDatabase workDatabase = this.F;
        switch (i) {
            case 0:
                ahj ahjVarW = workDatabase.w();
                ahjVarW.getClass();
                str.getClass();
                Iterator it = ((List) u00.E(ahjVarW.a, true, false, new j73(str, 13))).iterator();
                while (it.hasNext()) {
                    kxk.l(bgjVar, (String) it.next());
                }
                break;
            default:
                ahj ahjVarW2 = workDatabase.w();
                ahjVarW2.getClass();
                Iterator it2 = ((List) u00.E(ahjVarW2.a, true, false, new j73(str, 14))).iterator();
                while (it2.hasNext()) {
                    kxk.l(bgjVar, (String) it2.next());
                }
                break;
        }
    }
}
