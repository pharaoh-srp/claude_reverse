package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class a00 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ AndroidComposeView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a00(AndroidComposeView androidComposeView, int i) {
        super(1);
        this.F = i;
        this.G = androidComposeView;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        AndroidComposeView androidComposeView = this.G;
        switch (i) {
            case 0:
                ((ts7) androidComposeView.getFocusOwner()).i(((wr7) obj).a, false);
                return ieiVar;
            case 1:
                zy7 zy7Var = (zy7) obj;
                androidComposeView.getUncaughtExceptionHandler$ui();
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    zy7Var.a();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new pz(1, zy7Var));
                    }
                }
                return ieiVar;
            default:
                return new k40(androidComposeView, androidComposeView.getTextInputService(), (l45) obj);
        }
    }
}
