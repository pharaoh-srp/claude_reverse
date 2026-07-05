package defpackage;

import com.anthropic.claude.mainactivity.MainActivity;
import io.sentry.f1;
import io.sentry.j4;
import io.sentry.t4;
import io.sentry.t5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jpa implements j4, lig {
    public final /* synthetic */ MainActivity E;

    public /* synthetic */ jpa(MainActivity mainActivity) {
        this.E = mainActivity;
    }

    @Override // defpackage.lig
    public boolean a() {
        int i = MainActivity.h0;
        return ((Boolean) ((opa) this.E.e0.getValue()).d.getValue()).booleanValue();
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        int i = MainActivity.h0;
        f1Var.getClass();
        f1Var.f("application_class", this.E.getApplication().getClass().getName());
        t4.c(t5.FATAL);
    }
}
