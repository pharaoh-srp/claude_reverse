package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class yna implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ xv8 a;

    public yna(xv8 xv8Var) {
        this.a = xv8Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((wg6) this.a.G).getClass();
        return bundle;
    }
}
