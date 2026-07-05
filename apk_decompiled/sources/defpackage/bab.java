package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bab {
    public final wk a;
    public final nyj b;

    public bab(wk wkVar) {
        this.a = wkVar;
        r06 r06Var = (r06) wkVar.d;
        this.b = new nyj(r06Var.b, r06Var.l);
    }

    public final a0 a(bo5 bo5Var) {
        if (bo5Var instanceof wmc) {
            ww7 ww7Var = ((xmc) ((wmc) bo5Var)).I;
            wk wkVar = this.a;
            return new dud(ww7Var, (txb) wkVar.e, (cbi) wkVar.f, (d16) wkVar.b);
        }
        if (bo5Var instanceof c16) {
            return ((c16) bo5Var).Z;
        }
        return null;
    }

    public final wc0 b(r28 r28Var, int i, int i2) {
        return !on7.c.e(i).booleanValue() ? dd8.F : new e6c(((r06) this.a.d).a, new x9b(this, r28Var, i2, 0));
    }

    public final wc0 c(ctd ctdVar, boolean z) {
        return !on7.c.e(ctdVar.H).booleanValue() ? dd8.F : new e6c(((r06) this.a.d).a, new y9b(this, z, ctdVar));
    }

    public final v06 d(gsd gsdVar, boolean z) {
        p06 p06Var;
        wk wkVar = this.a;
        bo5 bo5Var = (bo5) wkVar.a;
        bo5Var.getClass();
        qqb qqbVar = (qqb) bo5Var;
        v06 v06Var = new v06(qqbVar, b(gsdVar, gsdVar.H, 1), z, gsdVar, (txb) wkVar.e, (cbi) wkVar.f, (zp3) wkVar.g, (d16) wkVar.b);
        bab babVar = (bab) wkVar.a(v06Var, lm6.E, (txb) wkVar.e, (cbi) wkVar.f, (zp3) wkVar.g, (wp1) wkVar.h).i;
        List list = gsdVar.I;
        list.getClass();
        List listG = babVar.g(list, gsdVar, 1);
        bud budVar = (bud) on7.d.e(gsdVar.H);
        switch (budVar == null ? -1 : iud.b[budVar.ordinal()]) {
            case 1:
                p06Var = q06.d;
                p06Var.getClass();
                break;
            case 2:
                p06Var = q06.a;
                p06Var.getClass();
                break;
            case 3:
                p06Var = q06.b;
                p06Var.getClass();
                break;
            case 4:
                p06Var = q06.c;
                p06Var.getClass();
                break;
            case 5:
                p06Var = q06.e;
                p06Var.getClass();
                break;
            case 6:
                p06Var = q06.f;
                p06Var.getClass();
                break;
            default:
                p06Var = q06.a;
                p06Var.getClass();
                break;
        }
        v06Var.b1(listG, p06Var);
        v06Var.X0(qqbVar.W());
        v06Var.V = qqbVar.x();
        v06Var.Z = !on7.n.e(gsdVar.H).booleanValue();
        return v06Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p16 e(defpackage.usd r26) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.e(usd):p16");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o16 f(defpackage.ctd r29) {
        /*
            Method dump skipped, instruction units count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bab.f(ctd):o16");
    }

    public final List g(List list, r28 r28Var, int i) {
        int i2;
        wc0 e6cVar;
        bab babVar = this;
        wk wkVar = babVar.a;
        cbi cbiVar = (cbi) wkVar.f;
        aai aaiVar = (aai) wkVar.c;
        bo5 bo5Var = (bo5) wkVar.a;
        bo5Var.getClass();
        c92 c92Var = (c92) bo5Var;
        bo5 bo5VarH = c92Var.h();
        bo5VarH.getClass();
        a0 a0VarA = babVar.a(bo5VarH);
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        int i3 = 0;
        for (Object obj : list2) {
            int i4 = i3 + 1;
            yr9 yr9VarG = null;
            if (i3 < 0) {
                x44.n0();
                throw null;
            }
            vtd vtdVar = (vtd) obj;
            int i5 = (vtdVar.G & 1) == 1 ? vtdVar.H : 0;
            if (a0VarA == null || !on7.c.e(i5).booleanValue()) {
                i2 = i3;
                e6cVar = dd8.F;
            } else {
                i2 = i3;
                e6cVar = new e6c(((r06) wkVar.d).a, new aab(babVar, a0VarA, r28Var, i, i2, vtdVar));
            }
            sxb sxbVarW = iv1.w((txb) wkVar.e, vtdVar.I);
            yr9 yr9VarG2 = aaiVar.g(ajk.w(vtdVar, cbiVar));
            boolean zBooleanValue = on7.G.e(i5).booleanValue();
            boolean zBooleanValue2 = on7.H.e(i5).booleanValue();
            boolean zBooleanValue3 = on7.I.e(i5).booleanValue();
            ntd ntdVarY = ajk.y(vtdVar, cbiVar);
            if (ntdVarY != null) {
                yr9VarG = aaiVar.g(ntdVarY);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new eri(c92Var, null, i2, e6cVar, sxbVarW, yr9VarG2, zBooleanValue, zBooleanValue2, zBooleanValue3, yr9VarG, neg.n));
            arrayList = arrayList2;
            i3 = i4;
            babVar = this;
        }
        return w44.p1(arrayList);
    }
}
