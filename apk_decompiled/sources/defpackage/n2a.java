package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n2a implements s5d {
    public final View E;
    public final i49 F;
    public m2a I;
    public zhh J;
    public ovi K;
    public Rect P;
    public final f2a Q;
    public bz7 G = new e69(11);
    public bz7 H = new e69(12);
    public cjh L = new cjh("", kkh.b, 4);
    public xy8 M = xy8.g;
    public final ArrayList N = new ArrayList();
    public final kw9 O = yb5.w(w1a.G, new xi4(26, this));

    public n2a(View view, x20 x20Var, i49 i49Var) {
        this.E = view;
        this.F = i49Var;
        this.Q = new f2a(x20Var, i49Var);
    }

    @Override // defpackage.s5d
    public final InputConnection g(EditorInfo editorInfo) {
        cjh cjhVar = this.L;
        zh4.A(editorInfo, cjhVar.a.F, cjhVar.b, this.M, null);
        g2a g2aVar = h2a.a;
        if (gl6.d()) {
            gl6.a().i(editorInfo);
        }
        h9e h9eVar = new h9e(this.L, new ro6(8, this), this.M.c, this.I, this.J, this.K);
        this.N.add(new WeakReference(h9eVar));
        return h9eVar;
    }
}
