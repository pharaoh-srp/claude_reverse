package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class r31 extends BroadcastReceiver {
    public final r77 a;
    public final k1h b;
    public final /* synthetic */ s31 c;

    public r31(s31 s31Var, k1h k1hVar, r77 r77Var) {
        this.c = s31Var;
        this.b = k1hVar;
        this.a = r77Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new fc(3, this));
        }
    }
}
