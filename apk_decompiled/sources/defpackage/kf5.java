package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kf5 implements fl6 {
    public Context a;

    public kf5(Context context, int i) {
        switch (i) {
            case 2:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.fl6
    public void a(kvj kvjVar) {
        bf4 bf4Var = new bf4("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), bf4Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new fy1(this, kvjVar, threadPoolExecutor, 3));
    }

    public lf5 b() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        lf5 lf5Var = new lf5();
        lf5Var.F = ja6.a(i57.a);
        gmf gmfVar = new gmf(17, context);
        lf5Var.J = gmfVar;
        lf5Var.G = ja6.a(new q28(gmfVar, 12, new gmf(10, gmfVar)));
        gmf gmfVar2 = (gmf) lf5Var.J;
        lf5Var.K = new gmf(26, gmfVar2);
        int i = 27;
        ivd ivdVarA = ja6.a(new q28((gmf) lf5Var.K, i, ja6.a(new efe(14, gmfVar2))));
        lf5Var.H = ivdVarA;
        efk efkVar = new efk(i);
        gmf gmfVar3 = (gmf) lf5Var.J;
        w3c w3cVar = new w3c(gmfVar3, ivdVarA, efkVar, 6);
        ivd ivdVar = (ivd) lf5Var.F;
        ivd ivdVar2 = (ivd) lf5Var.G;
        lf5Var.I = ja6.a(new w3c(new el5(ivdVar, ivdVar2, w3cVar, ivdVarA, ivdVarA), new ra4(gmfVar3, ivdVar2, ivdVarA, w3cVar, ivdVar, ivdVarA, ivdVarA), new dpf(ivdVar, ivdVarA, w3cVar, ivdVarA, 26), 11));
        return lf5Var;
    }
}
