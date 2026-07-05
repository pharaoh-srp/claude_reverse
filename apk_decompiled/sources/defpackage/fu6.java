package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class fu6 extends tx8 {
    public final Drawable a;
    public final kx8 b;
    public final Throwable c;

    public fu6(Drawable drawable, kx8 kx8Var, Throwable th) {
        this.a = drawable;
        this.b = kx8Var;
        this.c = th;
    }

    @Override // defpackage.tx8
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.tx8
    public final kx8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu6)) {
            return false;
        }
        fu6 fu6Var = (fu6) obj;
        return x44.r(this.a, fu6Var.a) && x44.r(this.b, fu6Var.b) && this.c.equals(fu6Var.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iHashCode = drawable != null ? drawable.hashCode() : 0;
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
