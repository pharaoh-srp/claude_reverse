package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r16 extends d2 {
    public final wk O;
    public final std P;
    public final t06 Q;

    /* JADX WARN: Illegal instructions before constructor call */
    public r16(wk wkVar, std stdVar, int i) {
        int i2;
        gfa gfaVar = ((r06) wkVar.d).a;
        bo5 bo5Var = (bo5) wkVar.a;
        vc0 vc0Var = dd8.F;
        sxb sxbVarW = iv1.w((txb) wkVar.e, stdVar.I);
        rtd rtdVar = stdVar.K;
        rtdVar.getClass();
        int iOrdinal = rtdVar.ordinal();
        int i3 = 2;
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal == 1) {
                i3 = 3;
                i2 = i3;
            } else if (iOrdinal != 2) {
                wg6.i();
                throw null;
            }
        } else {
            i2 = i3;
        }
        super(gfaVar, bo5Var, vc0Var, sxbVarW, i2, stdVar.J, i, zp3.Y);
        this.O = wkVar;
        this.P = stdVar;
        this.Q = new t06(gfaVar, new v01(13, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.r4
    public final List O0() {
        wk wkVar = this.O;
        cbi cbiVar = (cbi) wkVar.f;
        std stdVar = this.P;
        stdVar.getClass();
        List list = stdVar.L;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = stdVar.M;
            list2.getClass();
            List<Integer> list3 = list2;
            arrayList = new ArrayList(x44.y(list3, 10));
            for (Integer num : list3) {
                num.getClass();
                arrayList.add(cbiVar.b(num.intValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return x44.W(o06.e(this).n());
        }
        Iterable iterable = (Iterable) arrayList;
        aai aaiVar = (aai) wkVar.c;
        ArrayList arrayList2 = new ArrayList(x44.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(aaiVar.g((ntd) it.next()));
        }
        return arrayList2;
    }

    @Override // defpackage.rok, defpackage.ub0
    public final wc0 getAnnotations() {
        return this.Q;
    }
}
