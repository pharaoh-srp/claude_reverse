package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class v60 implements j20 {
    public final Typeface E;

    public v60(Typeface typeface, int i) {
        switch (i) {
            case 1:
                typeface.getClass();
                this.E = typeface;
                break;
            default:
                this.E = typeface;
                break;
        }
    }

    public Typeface a() {
        return this.E;
    }

    @Override // defpackage.j20
    public Object e(Context context, k20 k20Var) {
        return this.E;
    }

    @Override // defpackage.j20
    public Typeface h(Context context, k20 k20Var) {
        context.getClass();
        return this.E;
    }
}
