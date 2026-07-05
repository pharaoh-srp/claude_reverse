package defpackage;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w7b implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int a;

    public /* synthetic */ w7b(int i) {
        this.a = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.a) {
            case 0:
                mediaPlayer.seekTo(0);
                break;
            case 1:
                mediaPlayer.release();
                break;
            default:
                mediaPlayer.release();
                if (meg.l == mediaPlayer) {
                    meg.l = null;
                }
                break;
        }
    }
}
