package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qm3 implements u6d {
    public final /* synthetic */ View a;
    public final /* synthetic */ v77 b;

    public qm3(View view, v77 v77Var) {
        this.a = view;
        this.b = v77Var;
    }

    @Override // defpackage.u6d
    public final void s(v77 v77Var, t6d t6dVar) {
        v77Var.getClass();
        int[] iArr = {5, 4};
        en7 en7Var = t6dVar.a;
        boolean z = false;
        for (int i = 0; i < 2; i++) {
            if (en7Var.a.get(iArr[i])) {
                v77 v77Var2 = this.b;
                if (v77Var2.m() && (v77Var2.n() == 2 || v77Var2.n() == 3)) {
                    z = true;
                }
                this.a.setKeepScreenOn(z);
                return;
            }
        }
    }
}
