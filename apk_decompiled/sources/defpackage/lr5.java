package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lr5 implements ia4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qzd F;

    public /* synthetic */ lr5(qzd qzdVar, int i) {
        this.E = i;
        this.F = qzdVar;
    }

    @Override // defpackage.ia4
    public final Object s(el5 el5Var) {
        int i = this.E;
        qzd qzdVar = this.F;
        switch (i) {
            case 0:
                return new or5((Context) el5Var.a(Context.class), ((pl7) el5Var.a(pl7.class)).d(), el5Var.d(qzd.a(ql8.class)), el5Var.e(pv5.class), (Executor) el5Var.i(qzdVar));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(qzdVar, el5Var);
        }
    }
}
