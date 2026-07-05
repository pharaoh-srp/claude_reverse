package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends o2 implements ListIterator {
    public final /* synthetic */ x2 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, int i) {
        super(x2Var, ((List) x2Var.F).listIterator(i));
        this.I = x2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        x2 x2Var = this.I;
        boolean zIsEmpty = x2Var.isEmpty();
        b().add(obj);
        x2Var.J.I++;
        if (zIsEmpty) {
            x2Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.F;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var) {
        super(x2Var);
        this.I = x2Var;
    }
}
