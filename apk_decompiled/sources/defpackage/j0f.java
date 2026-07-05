package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0f extends g1f implements l0f, d1f {
    public HashSet i = null;
    public String j = null;
    public HashSet k = null;
    public HashSet l = null;
    public HashSet m = null;
    public Matrix n;

    @Override // defpackage.d1f
    public final Set b() {
        return this.k;
    }

    @Override // defpackage.d1f
    public final String c() {
        return this.j;
    }

    @Override // defpackage.d1f
    public final void e(HashSet hashSet) {
        this.i = hashSet;
    }

    @Override // defpackage.d1f
    public final Set g() {
        return this.i;
    }

    @Override // defpackage.d1f
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.d1f
    public final void i(String str) {
        this.j = str;
    }

    @Override // defpackage.d1f
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.d1f
    public final void k(HashSet hashSet) {
        this.k = hashSet;
    }

    @Override // defpackage.l0f
    public final void l(Matrix matrix) {
        this.n = matrix;
    }

    @Override // defpackage.d1f
    public final Set m() {
        return this.l;
    }

    @Override // defpackage.d1f
    public final Set n() {
        return this.m;
    }
}
