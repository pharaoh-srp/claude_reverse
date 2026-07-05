package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qc9 extends efi {
    public int F;
    public Object G;
    public final /* synthetic */ int H;
    public final Iterator I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qc9(zwf zwfVar) {
        this();
        this.H = 1;
        this.J = zwfVar;
        this.I = zwfVar.E.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        fd9.M(this.F != 4);
        int iF = sq6.F(this.F);
        if (iF == 0) {
            return true;
        }
        if (iF != 2) {
            this.F = 4;
            int i = this.H;
            Object obj = null;
            Object obj2 = this.J;
            Iterator it = this.I;
            switch (i) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((hbd) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.F = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((zwf) obj2).F.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.F = 3;
                    break;
            }
            this.G = obj;
            if (this.F != 3) {
                this.F = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        this.F = 2;
        Object obj = this.G;
        this.G = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qc9(Iterator it, hbd hbdVar) {
        this();
        this.H = 0;
        this.I = it;
        this.J = hbdVar;
    }

    public qc9() {
        super(0);
        this.F = 2;
    }
}
