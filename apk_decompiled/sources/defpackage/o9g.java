package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class o9g implements Comparator {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ o9g(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                String str = (String) obj3;
                int iCompare = ((pa9) obj4).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String str2 = (String) obj;
                String str3 = (String) obj2;
                return (svj.b(str, str2) == 1 ? Integer.valueOf(str2.length()) : 0).compareTo(svj.b(str, str3) == 1 ? Integer.valueOf(str3.length()) : 0);
            default:
                lsj lsjVar = (lsj) obj;
                lsj lsjVar2 = (lsj) obj2;
                nrj nrjVar = (nrj) obj4;
                c61 c61Var = (c61) obj3;
                if (lsjVar instanceof ltj) {
                    return !(lsjVar2 instanceof ltj) ? 1 : 0;
                }
                if (lsjVar2 instanceof ltj) {
                    return -1;
                }
                return nrjVar == null ? lsjVar.h().compareTo(lsjVar2.h()) : (int) gqk.i(nrjVar.c(c61Var, Arrays.asList(lsjVar, lsjVar2)).a().doubleValue());
        }
    }
}
