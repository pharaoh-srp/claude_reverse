package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ne1 extends xnj {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", grc.p(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.L);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            mr9.o();
            return;
        }
        kre kreVar = (kre) pair.second;
        try {
            throw null;
        } catch (RuntimeException e) {
            BasePendingResult.g(kreVar);
            throw e;
        }
    }
}
