package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class ex7 extends d4c implements aec, eyi, xdc, ed, u5f, ux7 {
    public final fx7 M;
    public final fx7 N;
    public final Handler O;
    public final rx7 P;
    public final /* synthetic */ fx7 Q;

    public ex7(fx7 fx7Var) {
        this.Q = fx7Var;
        Handler handler = new Handler();
        this.M = fx7Var;
        this.N = fx7Var;
        this.O = handler;
        this.P = new rx7();
    }

    @Override // defpackage.m4a
    public final c4a a() {
        return this.Q.a0;
    }

    @Override // defpackage.ux7
    public final void b() {
    }

    @Override // defpackage.d4c
    public final View b0(int i) {
        return this.Q.findViewById(i);
    }

    @Override // defpackage.xdc
    public final vdc c() {
        return this.Q.c();
    }

    @Override // defpackage.d4c
    public final boolean c0() {
        Window window = this.Q.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ed
    public final z94 e() {
        return this.Q.M;
    }

    @Override // defpackage.eyi
    public final dyi f() {
        return this.Q.f();
    }

    @Override // defpackage.u5f
    public final q28 g() {
        return (q28) this.Q.H.G;
    }

    @Override // defpackage.aec
    public final void i(hm4 hm4Var) {
        this.Q.i(hm4Var);
    }

    @Override // defpackage.aec
    public final void j(hm4 hm4Var) {
        this.Q.j(hm4Var);
    }
}
