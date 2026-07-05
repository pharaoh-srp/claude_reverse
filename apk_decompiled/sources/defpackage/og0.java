package defpackage;

import android.view.ViewGroup;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class og0 implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ ah0 F;

    public /* synthetic */ og0(ah0 ah0Var, int i) {
        this.E = i;
        this.F = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.E;
        ah0 ah0Var = this.F;
        int i2 = 0;
        switch (i) {
            case 0:
                if ((ah0Var.w0 & 1) != 0) {
                    ah0Var.k(0);
                }
                if ((ah0Var.w0 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0) {
                    ah0Var.k(108);
                }
                ah0Var.v0 = false;
                ah0Var.w0 = 0;
                break;
            default:
                ah0Var.S.showAtLocation(ah0Var.R, 55, 0, 0);
                gyi gyiVar = ah0Var.U;
                if (gyiVar != null) {
                    gyiVar.b();
                }
                if (ah0Var.W && (viewGroup = ah0Var.X) != null && viewGroup.isLaidOut()) {
                    ah0Var.R.setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
                    gyi gyiVarA = mvi.a(ah0Var.R);
                    gyiVarA.a(1.0f);
                    ah0Var.U = gyiVarA;
                    gyiVarA.d(new rg0(i2, this));
                } else {
                    ah0Var.R.setAlpha(1.0f);
                    ah0Var.R.setVisibility(0);
                }
                break;
        }
    }
}
