package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class rnj extends iv1 {
    public final /* synthetic */ int f;

    public /* synthetic */ rnj(int i) {
        this.f = i;
    }

    @Override // defpackage.iv1
    public final /* synthetic */ ge0 l(Context context, Looper looper, rl rlVar, Object obj, kmj kmjVar, kmj kmjVar2) {
        switch (this.f) {
            case 0:
                return new tnj(context, looper, rlVar, (ech) obj, kmjVar, kmjVar2);
            default:
                return new v6k(rlVar, context, looper, kmjVar, kmjVar2);
        }
    }
}
