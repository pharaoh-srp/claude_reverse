package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l11 implements nyg {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;

    public /* synthetic */ l11(int i, int i2) {
        this.E = i2;
        this.F = i;
    }

    @Override // defpackage.nyg
    public final Object get() {
        int i = this.E;
        int i2 = this.F;
        switch (i) {
            case 0:
                return new HandlerThread(n11.l(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(n11.l(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
