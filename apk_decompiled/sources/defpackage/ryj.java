package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class ryj extends ResultReceiver {
    public final /* synthetic */ j5h E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryj(Handler handler, j5h j5hVar) {
        super(handler);
        this.E = j5hVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.E.d(null);
    }
}
