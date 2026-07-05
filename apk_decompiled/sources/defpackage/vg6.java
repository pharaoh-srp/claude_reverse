package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* JADX INFO: loaded from: classes2.dex */
public final class vg6 implements xg6 {
    @Override // defpackage.xg6
    public final ax5 b(tg6 tg6Var, jw7 jw7Var) {
        if (jw7Var.s == null) {
            return null;
        }
        return new ax5(7, new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.xg6
    public final void d(Looper looper, z6d z6dVar) {
    }

    @Override // defpackage.xg6
    public final int e(jw7 jw7Var) {
        return jw7Var.s != null ? 1 : 0;
    }
}
