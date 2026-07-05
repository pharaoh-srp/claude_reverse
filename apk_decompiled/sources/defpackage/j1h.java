package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j1h {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = k1h.b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
