package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.Owner;

/* JADX INFO: loaded from: classes2.dex */
public final class r70 extends ts9 implements zy7 {
    public final /* synthetic */ Context F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ c18 H;
    public final /* synthetic */ c5f I;
    public final /* synthetic */ int J;
    public final /* synthetic */ View K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(Context context, bz7 bz7Var, c18 c18Var, c5f c5fVar, int i, View view) {
        super(0);
        this.F = context;
        this.G = bz7Var;
        this.H = c18Var;
        this.I = c5fVar;
        this.J = i;
        this.K = view;
    }

    @Override // defpackage.zy7
    public final Object a() {
        KeyEvent.Callback callback = this.K;
        callback.getClass();
        return new nxi(this.F, this.G, this.H, this.I, this.J, (Owner) callback).getLayoutNode();
    }
}
