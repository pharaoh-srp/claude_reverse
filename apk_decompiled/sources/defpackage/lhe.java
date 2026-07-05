package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class lhe implements wkh {
    public final View a;
    public final ol5 b;
    public ActionMode c;
    public boolean d;
    public l9e e;
    public zy7 f;
    public zy7 g;

    public lhe(View view, ol5 ol5Var) {
        view.getClass();
        this.a = view;
        this.b = ol5Var;
        this.e = l9e.e;
    }

    @Override // defpackage.wkh
    public final void a(l9e l9eVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4) {
        l9eVar.getClass();
        this.e = l9eVar;
        this.f = zy7Var;
        this.g = zy7Var4;
        ActionMode actionMode = this.c;
        if (actionMode != null) {
            actionMode.invalidateContentRect();
        } else {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.post(new pya(4, this));
        }
    }

    @Override // defpackage.wkh
    public final void c() {
        this.d = false;
        ActionMode actionMode = this.c;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.c = null;
    }

    @Override // defpackage.wkh
    public final zkh e() {
        return (this.c != null || this.d) ? zkh.E : zkh.F;
    }
}
