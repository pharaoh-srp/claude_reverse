package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes2.dex */
public final class ptb extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public ptb(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((gu8) iInterface).getClass();
        obj.getClass();
        this.a.F.remove((Integer) obj);
    }
}
