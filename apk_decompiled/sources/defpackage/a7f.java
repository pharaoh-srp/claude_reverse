package defpackage;

import android.app.Activity;
import androidx.work.impl.WorkDatabase;
import io.sentry.android.core.ScreenshotEventProcessor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a7f implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ a7f(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.I;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                List list = (List) obj4;
                xfj xfjVar = (xfj) obj3;
                fg4 fg4Var = (fg4) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((x6f) it.next()).d(xfjVar.a);
                }
                b7f.b(fg4Var, workDatabase, list);
                return;
            default:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    ((AtomicReference) obj3).set(((ScreenshotEventProcessor) obj4).a((Activity) obj2));
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }
}
