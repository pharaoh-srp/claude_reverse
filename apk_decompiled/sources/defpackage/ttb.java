package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class ttb implements iif {
    public final cvb a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final ohf f;

    public ttb(cvb cvbVar, List list, int i, int i2, boolean z, ohf ohfVar) {
        this.a = cvbVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = ohfVar;
        if (list.size() > 1) {
            return;
        }
        e39.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void n(evb evbVar, ohf ohfVar, tgf tgfVar, int i, int i2) {
        ohf ohfVar2;
        if (ohfVar.c) {
            ohfVar2 = new ohf(tgfVar.a(i2), tgfVar.a(i), i2 > i);
        } else {
            ohfVar2 = new ohf(tgfVar.a(i), tgfVar.a(i2), i > i2);
        }
        if (i > i2) {
            e39.c("minOffset should be less than or equal to maxOffset: " + ohfVar2);
        }
        long j = tgfVar.a;
        int iC = evbVar.c(j);
        Object[] objArr = evbVar.c;
        Object obj = objArr[iC];
        evbVar.b[iC] = j;
        objArr[iC] = ohfVar2;
    }

    @Override // defpackage.iif
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.iif
    public final tgf b() {
        return this.e ? j() : h();
    }

    @Override // defpackage.iif
    public final int c() {
        return this.b.size();
    }

    @Override // defpackage.iif
    public final ohf d() {
        return this.f;
    }

    @Override // defpackage.iif
    public final tgf e() {
        return i() == hc5.E ? h() : j();
    }

    @Override // defpackage.iif
    public final void f(bz7 bz7Var) {
        int iO = o(e().a);
        int iO2 = o((i() == hc5.E ? j() : h()).a);
        int i = iO + 1;
        if (i >= iO2) {
            return;
        }
        while (i < iO2) {
            bz7Var.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.iif
    public final int g() {
        return this.d;
    }

    @Override // defpackage.iif
    public final tgf h() {
        return (tgf) this.b.get(p(this.d, false));
    }

    @Override // defpackage.iif
    public final hc5 i() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return hc5.F;
        }
        if (i > i2) {
            return hc5.E;
        }
        return ((tgf) this.b.get(i / 2)).b();
    }

    @Override // defpackage.iif
    public final tgf j() {
        return (tgf) this.b.get(p(this.c, true));
    }

    @Override // defpackage.iif
    public final int k() {
        return this.c;
    }

    @Override // defpackage.iif
    public final boolean l(iif iifVar) {
        if (this.f != null && iifVar != null && (iifVar instanceof ttb)) {
            ttb ttbVar = (ttb) iifVar;
            List list = ttbVar.b;
            if (this.e == ttbVar.e && this.c == ttbVar.c && this.d == ttbVar.d) {
                List list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        tgf tgfVar = (tgf) list2.get(i);
                        tgf tgfVar2 = (tgf) list.get(i);
                        if (tgfVar.a != tgfVar2.a || tgfVar.c != tgfVar2.c || tgfVar.d != tgfVar2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.iif
    public final evb m(ohf ohfVar) {
        nhf nhfVar = ohfVar.a;
        boolean z = ohfVar.c;
        long j = nhfVar.c;
        int i = nhfVar.b;
        nhf nhfVar2 = ohfVar.b;
        long j2 = nhfVar2.c;
        int i2 = nhfVar2.b;
        if (j != j2) {
            evb evbVar = kka.a;
            evb evbVar2 = new evb();
            n(evbVar2, ohfVar, e(), (z ? nhfVar2 : nhfVar).b, e().f.a.a.F.length());
            f(new b4b(this, evbVar2, ohfVar));
            if (!z) {
                nhfVar = nhfVar2;
            }
            n(evbVar2, ohfVar, i() == hc5.E ? j() : h(), 0, nhfVar.b);
            return evbVar2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            e39.c("unexpectedly miss-crossed selection: " + ohfVar);
        }
        long j3 = nhfVar.c;
        evb evbVar3 = kka.a;
        evb evbVar4 = new evb();
        evbVar4.h(j3, ohfVar);
        return evbVar4;
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(vb7.m(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int iOrdinal = i().ordinal();
        boolean z2 = z;
        if (iOrdinal == 0) {
            z2 = !z ? 1 : 0;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                wg6.i();
                return 0;
            }
        }
        return (i - (!z2)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append(i());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            tgf tgfVar = (tgf) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(tgfVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
