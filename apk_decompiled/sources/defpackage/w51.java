package defpackage;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class w51 implements AudioTrack.OnPlaybackPositionUpdateListener {
    public final /* synthetic */ AudioTrack a;
    public final /* synthetic */ ua2 b;

    public w51(AudioTrack audioTrack, ua2 ua2Var) {
        this.a = audioTrack;
        this.b = ua2Var;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onMarkerReached(AudioTrack audioTrack) {
        audioTrack.getClass();
        AudioTrack audioTrack2 = this.a;
        audioTrack2.setNotificationMarkerPosition(0);
        audioTrack2.setPlaybackPositionUpdateListener(null);
        this.b.resumeWith(iei.a);
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public final void onPeriodicNotification(AudioTrack audioTrack) {
        audioTrack.getClass();
    }
}
