package defpackage;

import java.util.Iterator;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.h;

/* JADX INFO: loaded from: classes3.dex */
public final class eda implements Iterator, mm9 {
    public final /* synthetic */ int E;
    public final uka F;

    public /* synthetic */ eda(uka ukaVar, int i) {
        this.E = i;
        this.F = ukaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        uka ukaVar = this.F;
        switch (i) {
        }
        return ukaVar.G;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        uka ukaVar = this.F;
        switch (i) {
            case 0:
                yca ycaVar = LocalDate.Companion;
                long jNextLong = ukaVar.nextLong();
                ycaVar.getClass();
                return yca.a(jNextLong);
            default:
                return h.a(YearMonth.Companion, ukaVar.nextLong());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.E) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
