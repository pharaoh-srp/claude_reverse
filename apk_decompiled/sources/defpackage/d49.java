package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d49 extends InputConnectionWrapper {
    public final /* synthetic */ e49 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d49(InputConnection inputConnection, e49 e49Var) {
        super(inputConnection, false);
        this.a = e49Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        ax5 ax5Var;
        if (inputContentInfo == null) {
            ax5Var = null;
        } else {
            ax5Var = new ax5(11, new ro6(inputContentInfo));
        }
        if (this.a.c(ax5Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
