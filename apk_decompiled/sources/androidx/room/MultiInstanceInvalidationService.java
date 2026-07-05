package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.otb;
import defpackage.ptb;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int E;
    public final LinkedHashMap F = new LinkedHashMap();
    public final ptb G = new ptb(this);
    public final otb H = new otb(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.H;
    }
}
