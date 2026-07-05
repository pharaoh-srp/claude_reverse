package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.anthropic.claude.conway.ConwayWakeWorker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n15 extends dhj {
    public final /* synthetic */ int a;
    public final Object b;

    public n15() {
        this.a = 1;
        this.b = new CopyOnWriteArrayList();
    }

    @Override // defpackage.dhj
    public final zaa a(Context context, String str, WorkerParameters workerParameters) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                er9 er9Var = (er9) obj;
                context.getClass();
                str.getClass();
                if (!str.equals(ConwayWakeWorker.class.getName())) {
                    return null;
                }
                m7f m7fVar = (m7f) er9Var.c.I;
                kce kceVar = jce.a;
                return new ConwayWakeWorker(context, workerParameters, (ql3) m7fVar.a(kceVar.b(ql3.class), null, null), (bj0) ((m7f) er9Var.c.I).a(kceVar.b(bj0.class), null, null));
            default:
                context.getClass();
                str.getClass();
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                while (it.hasNext()) {
                    try {
                        zaa zaaVarA = ((dhj) it.next()).a(context, str, workerParameters);
                        if (zaaVarA != null) {
                            return zaaVarA;
                        }
                    } catch (Throwable th) {
                        nga.c().b(hx5.a, grc.n(')', "Unable to instantiate a ListenableWorker (", str), th);
                        throw th;
                    }
                }
                return null;
        }
    }

    public n15(er9 er9Var) {
        this.a = 0;
        er9Var.getClass();
        this.b = er9Var;
    }
}
