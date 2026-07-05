package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class aj6 extends View {
    public final /* synthetic */ lg1 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj6(lg1 lg1Var, Context context) {
        super(context);
        this.E = lg1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        configuration.getClass();
        this.E.run();
    }
}
