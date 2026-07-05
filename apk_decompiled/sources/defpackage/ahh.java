package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ahh implements wlg, img {
    public fkh G;
    public final lsc E = new lsc(null, zgh.f);
    public final lsc F = new lsc(null, ygh.g);
    public xgh H = new xgh();

    @Override // defpackage.img
    public final kmg a() {
        return this.H;
    }

    public final yjh d(zgh zghVar, ygh yghVar) {
        List list;
        eea eeaVarA;
        CharSequence charSequence;
        tkh tkhVar;
        efh efhVarD = zghVar.a.d();
        List listV = efhVarD.E;
        List list2 = efhVarD.F;
        List list3 = listV;
        if ((list3 == null || list3.isEmpty()) && ((list = list2) == null || list.isEmpty())) {
            listV = null;
        } else if (list3 == null || list3.isEmpty()) {
            listV = list2;
        } else {
            List list4 = list2;
            if (list4 != null && !list4.isEmpty()) {
                d8a d8aVarE = x44.E();
                d8aVarE.addAll(list3);
                d8aVarE.addAll(list4);
                listV = x44.v(d8aVarE);
            }
        }
        xgh xghVar = (xgh) ycg.h(this.H);
        yjh yjhVar = xghVar.n;
        if (yjhVar != null && (charSequence = xghVar.c) != null && isg.d0(charSequence, efhVarD) && x44.r(xghVar.d, listV) && x44.r(xghVar.e, efhVarD.I) && xghVar.g == zghVar.c && xghVar.h == zghVar.d && xghVar.k == yghVar.b && xghVar.i == yghVar.a.getDensity() && xghVar.j == yghVar.a.k0() && rl4.b(xghVar.m, yghVar.d) && x44.r(xghVar.l, yghVar.c) && !yjhVar.b.a.c()) {
            tkh tkhVar2 = xghVar.f;
            boolean z = false;
            boolean zE = tkhVar2 != null ? tkhVar2.e(zghVar.b) : false;
            tkh tkhVar3 = xghVar.f;
            if (tkhVar3 != null && (tkhVar3 == (tkhVar = zghVar.b) || tkhVar3.a.c(tkhVar.a))) {
                z = true;
            }
            if (zE && z) {
                return yjhVar;
            }
            if (zE) {
                xjh xjhVar = yjhVar.a;
                return new yjh(new xjh(xjhVar.a, zghVar.b, xjhVar.c, xjhVar.d, xjhVar.e, xjhVar.f, xjhVar.g, xjhVar.h, xjhVar.i, xjhVar.j), yjhVar.b, yjhVar.c);
            }
        }
        fkh fkhVar = this.G;
        if (fkhVar == null) {
            fkhVar = new fkh(yghVar.c, yghVar.a, yghVar.b, 1);
            this.G = fkhVar;
        }
        fkh fkhVar2 = fkhVar;
        boolean z2 = zghVar.e;
        tkh tkhVarF = zghVar.b;
        if (z2) {
            gea geaVar = tkhVarF.a.k;
            if (geaVar == null || (eeaVarA = geaVar.a()) == null) {
                eeaVarA = b5d.a.r().a();
            }
            tkhVarF = tkhVarF.f(new tkh(0L, 0L, null, null, null, 0L, 0L, 0, qok.o(eeaVarA), 0L, null, 16711679));
        }
        yjh yjhVarA = fkh.a(fkhVar2, new zb0(efhVarD.G.toString(), listV == null ? lm6.E : listV), tkhVarF, zghVar.d, zghVar.c ? 1 : Integer.MAX_VALUE, yghVar.d, yghVar.b, yghVar.a, yghVar.c, 1060);
        if (!yjhVarA.equals(yjhVar)) {
            rcg rcgVarJ = ycg.j();
            if (!rcgVarJ.f()) {
                xgh xghVar2 = this.H;
                synchronized (ycg.c) {
                    xgh xghVar3 = (xgh) ycg.w(xghVar2, this, rcgVarJ);
                    xghVar3.c = efhVarD;
                    xghVar3.d = listV;
                    xghVar3.e = efhVarD.I;
                    xghVar3.g = zghVar.c;
                    xghVar3.h = zghVar.d;
                    xghVar3.f = zghVar.b;
                    xghVar3.k = yghVar.b;
                    xghVar3.i = yghVar.e;
                    xghVar3.j = yghVar.f;
                    xghVar3.m = yghVar.d;
                    xghVar3.l = yghVar.c;
                    xghVar3.n = yjhVarA;
                }
                ycg.n(rcgVarJ, this);
                return yjhVarA;
            }
        }
        return yjhVarA;
    }

    @Override // defpackage.img
    public final kmg e(kmg kmgVar, kmg kmgVar2, kmg kmgVar3) {
        return kmgVar3;
    }

    @Override // defpackage.img
    public final void g(kmg kmgVar) {
        kmgVar.getClass();
        this.H = (xgh) kmgVar;
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        ygh yghVar;
        zgh zghVar = (zgh) this.E.getValue();
        if (zghVar == null || (yghVar = (ygh) this.F.getValue()) == null) {
            return null;
        }
        return d(zghVar, yghVar);
    }
}
