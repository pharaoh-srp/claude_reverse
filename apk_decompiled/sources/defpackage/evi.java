package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class evi implements View.OnApplyWindowInsetsListener {
    public bdj a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ldc c;

    public evi(View view, ldc ldcVar) {
        this.b = view;
        this.c = ldcVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        bdj bdjVarC = bdj.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        ldc ldcVar = this.c;
        if (i < 30) {
            fvi.a(windowInsets, this.b);
            if (bdjVarC.equals(this.a)) {
                return ldcVar.j(view, bdjVarC).b();
            }
        }
        this.a = bdjVarC;
        bdj bdjVarJ = ldcVar.j(view, bdjVarC);
        if (i >= 30) {
            return bdjVarJ.b();
        }
        WeakHashMap weakHashMap = mvi.a;
        view.requestApplyInsets();
        return bdjVarJ.b();
    }
}
