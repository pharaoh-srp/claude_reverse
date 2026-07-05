package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final class n41 extends ContentObserver {
    public final /* synthetic */ aid a;
    public final /* synthetic */ AudioManager b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(aid aidVar, AudioManager audioManager, int i) {
        super(null);
        this.a = aidVar;
        this.b = audioManager;
        this.c = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AudioManager audioManager = this.b;
        boolean z2 = false;
        if (audioManager != null && audioManager.getStreamVolume(this.c) == 0) {
            z2 = true;
        }
        iik.i(this.a, Boolean.valueOf(z2));
    }
}
