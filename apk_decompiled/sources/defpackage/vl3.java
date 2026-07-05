package defpackage;

import android.content.SharedPreferences;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes.dex */
public final class vl3 implements DefaultLifecycleObserver {
    public final mn5 E;
    public final am0 F;
    public final id G;
    public final p98 H;

    static {
        oqb oqbVar = am0.i;
    }

    public vl3(mn5 mn5Var, am0 am0Var, id idVar, p98 p98Var) {
        this.E = mn5Var;
        this.F = am0Var;
        this.G = idVar;
        this.H = p98Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(m4a m4aVar) {
        m4aVar.getClass();
        am0 am0Var = this.F;
        isc iscVar = am0Var.b;
        int iH = iscVar.h() + 1;
        iscVar.i(iH);
        SharedPreferences.Editor editorEdit = am0Var.a.edit();
        editorEdit.putInt("creation_count", iH);
        editorEdit.apply();
        this.G.b();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(m4a m4aVar) {
        m4aVar.getClass();
        long jA = this.E.a();
        Long lValueOf = Long.valueOf(jA);
        am0 am0Var = this.F;
        am0Var.c.setValue(lValueOf);
        SharedPreferences.Editor editorEdit = am0Var.a.edit();
        editorEdit.putLong("last_resumed_at", jA);
        editorEdit.apply();
        this.G.d();
        p98 p98Var = this.H;
        if (p98Var.d) {
            gb9.D(p98Var.a, p98Var.b.b(), null, new fj(p98Var, null, 12), 2);
        }
    }
}
