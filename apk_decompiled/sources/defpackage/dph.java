package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dph extends gu6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dph(int i, String... strArr) {
        super(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (i == 0) {
            throw null;
        }
    }

    @Override // defpackage.gu6, defpackage.fab
    public final Set a() {
        throw new IllegalStateException();
    }

    @Override // defpackage.gu6, defpackage.fab
    public final Collection b(c06 c06Var, bz7 bz7Var) {
        c06Var.getClass();
        throw new IllegalStateException(this.b);
    }

    @Override // defpackage.gu6, defpackage.fab
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override // defpackage.gu6, defpackage.fab
    public final /* bridge */ /* synthetic */ Collection d(sxb sxbVar, int i) {
        d(sxbVar, i);
        throw null;
    }

    @Override // defpackage.gu6, defpackage.fab
    public final xh3 e(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        throw new IllegalStateException(this.b + ", required name: " + sxbVar);
    }

    @Override // defpackage.gu6, defpackage.fab
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override // defpackage.gu6, defpackage.fab
    public final /* bridge */ /* synthetic */ Collection g(sxb sxbVar, int i) {
        g(sxbVar, i);
        throw null;
    }

    @Override // defpackage.gu6
    /* JADX INFO: renamed from: h */
    public final Set g(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        throw new IllegalStateException(this.b + ", required name: " + sxbVar);
    }

    @Override // defpackage.gu6
    /* JADX INFO: renamed from: i */
    public final Set d(sxb sxbVar, int i) {
        sxbVar.getClass();
        if (i == 0) {
            throw null;
        }
        throw new IllegalStateException(this.b + ", required name: " + sxbVar);
    }

    @Override // defpackage.gu6
    public final String toString() {
        return vb7.s(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
