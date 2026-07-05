package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class t86 implements y8g {
    public final Context E;

    public t86(Context context) {
        this.E = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t86) {
            return x44.r(this.E, ((t86) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.y8g
    public final Object r(p4e p4eVar) {
        DisplayMetrics displayMetrics = this.E.getResources().getDisplayMetrics();
        r46 r46Var = new r46(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new i8g(r46Var, r46Var);
    }
}
