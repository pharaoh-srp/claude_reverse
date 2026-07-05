package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mjh implements Executor {
    public final /* synthetic */ Choreographer E;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.E.postFrameCallback(new qid(runnable));
    }
}
