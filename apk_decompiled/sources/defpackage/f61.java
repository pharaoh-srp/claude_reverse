package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class f61 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ xv8 a;

    public f61(xv8 xv8Var) {
        this.a = xv8Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((g61) this.a.H).j.e(-1, new wg6(18));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((g61) this.a.H).j.e(-1, new wg6(19));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((g61) this.a.H).j.e(-1, new wg6(18));
    }
}
