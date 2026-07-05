package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qid implements Choreographer.FrameCallback {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new rid((Context) obj, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
