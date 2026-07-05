package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q91 extends xjk {
    public int c = 0;
    public final /* synthetic */ r91 d;

    public q91(r91 r91Var) {
        this.d = r91Var;
    }

    @Override // defpackage.xjk
    public final void E(edh edhVar) {
        if (this.c == 0) {
            String str = edhVar.g;
            List listD = edhVar.d();
            cfg cfgVar = listD.size() == 1 ? (cfg) listD.get(0) : null;
            fj0 fj0Var = this.d.a;
            fj0Var.getClass();
            if (str == null) {
                mr9.h("input must not be null");
                return;
            }
            r6a r6aVar = new r6a(str, new q6a(fj0Var, str));
            b5c b5cVar = edhVar;
            while (r6aVar.hasNext()) {
                gfg gfgVar = (gfg) r6aVar.next();
                if (b5cVar == edhVar && !r6aVar.hasNext() && !(gfgVar instanceof a7a)) {
                    return;
                }
                int beginIndex = gfgVar.getBeginIndex();
                int endIndex = gfgVar.getEndIndex();
                edh edhVar2 = new edh(str.substring(beginIndex, endIndex));
                if (cfgVar != null) {
                    edhVar2.b(new cfg(cfgVar.a, beginIndex, endIndex - beginIndex));
                }
                if (gfgVar instanceof a7a) {
                    String strI = edhVar2.g;
                    if (((a7a) gfgVar).a == c7a.F) {
                        strI = ij0.i("mailto:", strI);
                    }
                    l6a l6aVar = new l6a(strI, null);
                    l6aVar.c(edhVar2);
                    l6aVar.g(edhVar2.d());
                    b5cVar.e(l6aVar);
                    b5cVar = l6aVar;
                } else {
                    b5cVar.e(edhVar2);
                    b5cVar = edhVar2;
                }
            }
            edhVar.i();
        }
    }

    @Override // defpackage.xjk
    public final void y(l6a l6aVar) {
        this.c++;
        G(l6aVar);
        this.c--;
    }
}
