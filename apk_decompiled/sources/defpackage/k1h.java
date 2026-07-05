package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k1h {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public k1h(Handler handler) {
        this.a = handler;
    }

    public static j1h c() {
        j1h j1hVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                j1hVar = arrayList.isEmpty() ? new j1h() : (j1h) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return j1hVar;
    }

    public final j1h a(int i) {
        j1h j1hVarC = c();
        j1hVarC.a = this.a.obtainMessage(i);
        return j1hVarC;
    }

    public final j1h b(int i, Object obj) {
        j1h j1hVarC = c();
        j1hVarC.a = this.a.obtainMessage(i, obj);
        return j1hVarC;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e(int i) {
        fd9.E(i != 0);
        this.a.removeMessages(i);
    }

    public final void f(int i) {
        this.a.sendEmptyMessage(i);
    }
}
