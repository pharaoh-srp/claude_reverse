package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes2.dex */
public final class i41 extends vp4 {
    public AudioDeviceInfo E;
    public AudioManager F;
    public /* synthetic */ Object G;
    public final /* synthetic */ p41 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(p41 p41Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = p41Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.j(null, null, this);
    }
}
