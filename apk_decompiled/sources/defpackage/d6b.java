package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface d6b {
    void a();

    void b(Bundle bundle);

    void c(int i, rc5 rc5Var, long j, int i2);

    void d(int i, int i2, int i3, long j);

    void e(int i);

    MediaFormat f();

    void flush();

    void g();

    void h(int i, long j);

    int i();

    int m(MediaCodec.BufferInfo bufferInfo);

    default boolean n(ro6 ro6Var) {
        return false;
    }

    void o(int i);

    ByteBuffer r(int i);

    void s(Surface surface);

    ByteBuffer t(int i);

    default void u(yw5 yw5Var) {
        yw5Var.run();
    }

    void v(ArrayList arrayList);

    void w(w6b w6bVar, Handler handler);

    void x(ArrayList arrayList);
}
