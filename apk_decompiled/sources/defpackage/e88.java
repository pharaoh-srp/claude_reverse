package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class e88 {
    public final Context a;
    public final String b;
    public final nyj c;
    public final fe0 d;
    public final gf0 e;
    public final Looper f;
    public final int g;
    public final mmj h;
    public final lja i;
    public final j88 j;

    public e88(Context context, nyj nyjVar, fe0 fe0Var, d88 d88Var) {
        dgj.w("Null context is not permitted.", context);
        dgj.w("Api must not be null.", nyjVar);
        dgj.w("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", d88Var);
        Context applicationContext = context.getApplicationContext();
        dgj.w("The provided context did not have an application context.", applicationContext);
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = nyjVar;
        this.d = fe0Var;
        this.f = d88Var.b;
        this.e = new gf0(nyjVar, fe0Var, attributionTag);
        this.h = new mmj(this);
        j88 j88VarG = j88.g(applicationContext);
        this.j = j88VarG;
        this.g = j88VarG.L.getAndIncrement();
        this.i = d88Var.a;
        xnj xnjVar = j88VarG.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(7, this));
    }

    public final fj0 a() {
        fj0 fj0Var = new fj0();
        Set set = Collections.EMPTY_SET;
        if (((ip0) fj0Var.E) == null) {
            fj0Var.E = new ip0(0);
        }
        ((ip0) fj0Var.E).addAll(set);
        Context context = this.a;
        fj0Var.G = context.getClass().getName();
        fj0Var.F = context.getPackageName();
        return fj0Var;
    }

    public final r5l b(dba dbaVar, int i) {
        dgj.w("Listener key cannot be null.", dbaVar);
        j88 j88Var = this.j;
        j88Var.getClass();
        j5h j5hVar = new j5h();
        j88Var.f(j5hVar, i, this);
        umj umjVar = new umj(new hnj(dbaVar, j5hVar), j88Var.M.get(), this);
        xnj xnjVar = j88Var.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(13, umjVar));
        return j5hVar.a;
    }

    public final r5l c(int i, w19 w19Var) {
        j5h j5hVar = new j5h();
        j88 j88Var = this.j;
        j88Var.getClass();
        j88Var.f(j5hVar, w19Var.b, this);
        umj umjVar = new umj(new inj(i, w19Var, j5hVar, this.i), j88Var.M.get(), this);
        xnj xnjVar = j88Var.Q;
        xnjVar.sendMessage(xnjVar.obtainMessage(4, umjVar));
        return j5hVar.a;
    }
}
