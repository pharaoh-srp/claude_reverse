package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes2.dex */
public final class f5d implements d5d {
    public static final f5d a = new f5d();

    @Override // defpackage.d5d
    public final boolean a() {
        return false;
    }

    @Override // defpackage.d5d
    public final c5d b(View view, boolean z, long j, float f, float f2, boolean z2, cz5 cz5Var, float f3) {
        return new e5d(new Magnifier(view));
    }
}
