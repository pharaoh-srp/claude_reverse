package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class e00 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ AndroidComposeView F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(AndroidComposeView androidComposeView, vp4 vp4Var) {
        super(vp4Var);
        this.F = androidComposeView;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.J(null, this);
        return m45.E;
    }
}
