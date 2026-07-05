package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1f extends g1f implements f1f, d1f {
    public List i = new ArrayList();
    public HashSet j = null;
    public String k = null;
    public HashSet l = null;
    public HashSet m = null;

    @Override // defpackage.f1f
    public final List a() {
        return this.i;
    }

    @Override // defpackage.d1f
    public final Set b() {
        return null;
    }

    @Override // defpackage.d1f
    public final String c() {
        return this.k;
    }

    @Override // defpackage.d1f
    public final void e(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // defpackage.f1f
    public void f(j1f j1fVar) {
        this.i.add(j1fVar);
    }

    @Override // defpackage.d1f
    public final Set g() {
        return this.j;
    }

    @Override // defpackage.d1f
    public final void h(HashSet hashSet) {
        this.m = hashSet;
    }

    @Override // defpackage.d1f
    public final void i(String str) {
        this.k = str;
    }

    @Override // defpackage.d1f
    public final void j(HashSet hashSet) {
        this.l = hashSet;
    }

    @Override // defpackage.d1f
    public final void k(HashSet hashSet) {
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
