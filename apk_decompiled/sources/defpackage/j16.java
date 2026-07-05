package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j16 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ k16 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j16(k16 k16Var, int i) {
        super(1);
        this.F = i;
        this.G = k16Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        p06 p06Var;
        int i = this.F;
        Collection<ctd> collectionE0 = lm6.E;
        k16 k16Var = this.G;
        switch (i) {
            case 0:
                sxb sxbVar = (sxb) obj;
                sxbVar.getClass();
                LinkedHashMap linkedHashMap = k16Var.a;
                sk9 sk9Var = usd.Z;
                sk9Var.getClass();
                m16 m16Var = k16Var.i;
                byte[] bArr = (byte[]) linkedHashMap.get(sxbVar);
                if (bArr != null) {
                    collectionE0 = bnf.e0(bnf.Y(new h16(sk9Var, new ByteArrayInputStream(bArr), m16Var, 0)));
                }
                ArrayList arrayList = new ArrayList(collectionE0.size());
                for (usd usdVar : collectionE0) {
                    bab babVar = (bab) m16Var.b.i;
                    usdVar.getClass();
                    p16 p16VarE = babVar.e(usdVar);
                    if (!m16Var.r(p16VarE)) {
                        p16VarE = null;
                    }
                    if (p16VarE != null) {
                        arrayList.add(p16VarE);
                    }
                }
                m16Var.j(sxbVar, arrayList);
                return gb9.r(arrayList);
            case 1:
                sxb sxbVar2 = (sxb) obj;
                sxbVar2.getClass();
                LinkedHashMap linkedHashMap2 = k16Var.b;
                sk9 sk9Var2 = ctd.Z;
                sk9Var2.getClass();
                m16 m16Var2 = k16Var.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(sxbVar2);
                if (bArr2 != null) {
                    collectionE0 = bnf.e0(bnf.Y(new h16(sk9Var2, new ByteArrayInputStream(bArr2), m16Var2, 0)));
                }
                ArrayList arrayList2 = new ArrayList(collectionE0.size());
                for (ctd ctdVar : collectionE0) {
                    bab babVar2 = (bab) m16Var2.b.i;
                    ctdVar.getClass();
                    arrayList2.add(babVar2.f(ctdVar));
                }
                m16Var2.k(sxbVar2, arrayList2);
                return gb9.r(arrayList2);
            default:
                sxb sxbVar3 = (sxb) obj;
                sxbVar3.getClass();
                wk wkVar = k16Var.i.b;
                byte[] bArr3 = (byte[]) k16Var.c.get(sxbVar3);
                if (bArr3 == null) {
                    return null;
                }
                ptd ptdVar = (ptd) ptd.T.a(new ByteArrayInputStream(bArr3), ((r06) wkVar.d).p);
                if (ptdVar == null) {
                    return null;
                }
                bab babVar3 = (bab) wkVar.i;
                wk wkVar2 = babVar3.a;
                txb txbVar = (txb) wkVar2.e;
                cbi cbiVar = (cbi) wkVar2.f;
                List list = ptdVar.O;
                list.getClass();
                List<bsd> list2 = list;
                ArrayList arrayList3 = new ArrayList(x44.y(list2, 10));
                for (bsd bsdVar : list2) {
                    nyj nyjVar = babVar3.b;
                    bsdVar.getClass();
                    arrayList3.add(nyjVar.F(bsdVar, txbVar));
                }
                wc0 xc0Var = arrayList3.isEmpty() ? dd8.F : new xc0(arrayList3, 0);
                bud budVar = (bud) on7.d.e(ptdVar.H);
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
                q16 q16Var = new q16(((r06) wkVar2.d).a, (bo5) wkVar2.a, xc0Var, iv1.w(txbVar, ptdVar.I), p06Var, ptdVar, (txb) wkVar2.e, cbiVar, (zp3) wkVar2.g, (d16) wkVar2.b);
                List list3 = ptdVar.J;
                list3.getClass();
                aai aaiVar = (aai) wkVar2.a(q16Var, list3, (txb) wkVar2.e, (cbi) wkVar2.f, (zp3) wkVar2.g, (wp1) wkVar2.h).c;
                q16Var.Q0(aaiVar.b(), aaiVar.d(ajk.x(ptdVar, cbiVar), false), aaiVar.d(ajk.g(ptdVar, cbiVar), false));
                return q16Var;
        }
    }
}
