package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class ube extends obe implements sd9 {
    public final ww7 a;

    public ube(ww7 ww7Var) {
        ww7Var.getClass();
        this.a = ww7Var;
    }

    @Override // defpackage.sd9
    public final zae a(ww7 ww7Var) {
        ww7Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ube) {
            return x44.r(this.a, ((ube) obj).a);
        }
        return false;
    }

    @Override // defpackage.sd9
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return lm6.E;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ube.class.getName() + ": " + this.a;
    }
}
