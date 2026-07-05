package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class kl6 implements Runnable {
    public final /* synthetic */ int E;

    public /* synthetic */ kl6(int i) {
        this.E = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                try {
                    int i = g3i.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (gl6.d()) {
                        gl6.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = g3i.a;
                    Trace.endSection();
                    throw th;
                }
            default:
                iqk.i.incrementAndGet();
                return;
        }
    }
}
