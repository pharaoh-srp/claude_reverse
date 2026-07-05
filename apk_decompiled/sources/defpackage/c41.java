package defpackage;

import android.media.AudioManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c41 extends AudioManager.AudioPlaybackCallback {
    public final /* synthetic */ aid a;

    public c41(aid aidVar) {
        this.a = aidVar;
    }

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public final void onPlaybackConfigChanged(List list) {
        list.getClass();
        this.a.r(list);
    }
}
