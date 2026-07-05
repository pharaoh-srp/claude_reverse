package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t0g extends z0g {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public t0g(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.z0g
    public final void a(Matrix matrix, wzf wzfVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((z0g) it.next()).a(this.d, wzfVar, i, canvas);
        }
    }
}
