package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qw7 implements o5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public qw7(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.o5b
    public final p5b b(final q5b q5bVar, List list, long j) {
        Object next;
        q5bVar.getClass();
        list.getClass();
        int size = list.size();
        int i = this.a;
        Object next2 = null;
        if (size != i * 2) {
            sz6.j("Check failed.");
            return null;
        }
        List list2 = list;
        int i2 = 0;
        ymf ymfVarD0 = bnf.d0(new c54(0, list2), i);
        ymf ymfVarU = bnf.U(new c54(0, list2), i);
        final List listE0 = bnf.e0(bnf.b0(ymfVarD0, new hz6(16)));
        Iterator it = listE0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i3 = ((c3d) next).E;
                do {
                    Object next3 = it.next();
                    int i4 = ((c3d) next3).E;
                    if (i3 < i4) {
                        next = next3;
                        i3 = i4;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        next.getClass();
        final c3d c3dVar = (c3d) next;
        int iH = rl4.h(j) - c3dVar.E;
        final List listE02 = bnf.e0(bnf.b0(ymfVarU, new j10(rl4.a(0, iH < 0 ? 0 : iH, 0, 0, 13, j), 5)));
        List list3 = listE02;
        Iterator it2 = list3.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i5 = ((c3d) next2).E;
                do {
                    Object next4 = it2.next();
                    int i6 = ((c3d) next4).E;
                    if (i5 < i6) {
                        next2 = next4;
                        i5 = i6;
                    }
                } while (it2.hasNext());
            }
        }
        next2.getClass();
        int i7 = c3dVar.E + ((c3d) next2).E;
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            i2 += ((c3d) it3.next()).F;
        }
        int iM0 = (q5bVar.M0(this.b) * (listE02.size() - 1)) + i2;
        final int i8 = this.a;
        final float f = this.b;
        return q5bVar.U(i7, iM0, nm6.E, new bz7() { // from class: pw7
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                b3d b3dVar = (b3d) obj;
                b3dVar.getClass();
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    c3d c3dVar2 = (c3d) listE0.get(i10);
                    c3d c3dVar3 = (c3d) listE02.get(i10);
                    int iM02 = b3dVar.M0(f) + Math.max(c3dVar2.F, c3dVar3.F);
                    long jRound = (((long) Math.round((1.0f + (q5bVar.getLayoutDirection() == fu9.E ? 1.0f : -1.0f)) * MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Math.round(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L);
                    b3d.k(b3dVar, c3dVar2, (int) (jRound >> 32), ((int) (jRound & 4294967295L)) + i9);
                    b3d.k(b3dVar, c3dVar3, c3dVar.E, i9);
                    i9 += iM02;
                }
                return iei.a;
            }
        });
    }
}
