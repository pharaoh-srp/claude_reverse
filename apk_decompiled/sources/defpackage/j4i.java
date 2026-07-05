package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class j4i {
    public final Context a;
    public final ml4 b;
    public final lh1 c;
    public final s1c d;
    public final ml4 e;

    public j4i(Context context, ggj ggjVar) {
        s1c s1cVarA;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        lh1 lh1Var = new lh1(applicationContext, ggjVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        lh1 lh1Var2 = new lh1(applicationContext2, ggjVar, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            s1cVarA = r1c.a(applicationContext3, ggjVar);
        } else {
            s1cVarA = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        lh1 lh1Var3 = new lh1(applicationContext4, ggjVar, 2);
        this.a = context;
        this.b = lh1Var;
        this.c = lh1Var2;
        this.d = s1cVarA;
        this.e = lh1Var3;
    }
}
