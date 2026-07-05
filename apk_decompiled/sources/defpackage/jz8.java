package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jz8 extends nz8 {
    public final transient int G;
    public final transient int H;
    public final /* synthetic */ nz8 I;

    public jz8(nz8 nz8Var, int i, int i2) {
        this.I = nz8Var;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.cz8
    public final Object[] e() {
        return this.I.e();
    }

    @Override // defpackage.cz8
    public final int g() {
        return this.I.h() + this.G + this.H;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fd9.G(i, this.H);
        return this.I.get(i + this.G);
    }

    @Override // defpackage.cz8
    public final int h() {
        return this.I.h() + this.G;
    }

    @Override // defpackage.nz8, defpackage.cz8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.cz8
    public final boolean k() {
        return true;
    }

    @Override // defpackage.nz8, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.H;
    }

    @Override // defpackage.nz8, java.util.List
    /* JADX INFO: renamed from: y */
    public final nz8 subList(int i, int i2) {
        fd9.K(i, i2, this.H);
        int i3 = this.G;
        return this.I.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.nz8, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
