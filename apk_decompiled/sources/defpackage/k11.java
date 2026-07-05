package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k11 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6b b;

    public /* synthetic */ k11(d6b d6bVar, w6b w6bVar, int i) {
        this.a = i;
        this.b = w6bVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        int i = this.a;
        w6b w6bVar = this.b;
        switch (i) {
            case 0:
                Handler handler = w6bVar.E;
                if (Build.VERSION.SDK_INT >= 30) {
                    w6bVar.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                Handler handler2 = w6bVar.E;
                if (Build.VERSION.SDK_INT >= 30) {
                    w6bVar.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
