package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h2h extends m08 implements zy7 {
    public static final h2h E = new h2h(0, csg.class, "defaultReadAloudAudioTrack", "defaultReadAloudAudioTrack()Landroid/media/AudioTrack;", 1);

    @Override // defpackage.zy7
    public final Object a() {
        AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build()).setTransferMode(1).build();
        audioTrackBuild.getClass();
        return audioTrackBuild;
    }
}
