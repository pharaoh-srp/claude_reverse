package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class foh implements ltb {
    public final vpc a;
    public final moh b;
    public final lsc c;
    public final lsc d;
    public final lsc e;

    public foh(kqc kqcVar, toh tohVar, vpc vpcVar, hoh hohVar, moh mohVar) {
        this.a = vpcVar;
        this.b = mohVar;
        this.c = mpk.P(kqcVar);
        this.d = mpk.P(tohVar);
        this.e = mpk.P(hohVar);
    }

    @Override // defpackage.ltb
    public final p5b b(final q5b q5bVar, List list, final long j) {
        h5b h5bVar;
        ArrayList arrayList = (ArrayList) list;
        int i = 0;
        final h5b h5bVar2 = (h5b) w44.N0((List) arrayList.get(0));
        final h5b h5bVar3 = (h5b) w44.N0((List) arrayList.get(1));
        final h5b h5bVar4 = (h5b) w44.N0((List) arrayList.get(2));
        final h5b h5bVar5 = (h5b) w44.N0((List) arrayList.get(3));
        List listSubList = arrayList.subList(0, 3);
        int size = listSubList.size();
        while (true) {
            if (i >= size) {
                h5bVar = (h5b) w44.N0((List) arrayList.get(4));
                break;
            }
            List list2 = (List) listSubList.get(i);
            if (list2.size() > 1) {
                h5bVar = (h5b) list2.get(1);
                break;
            }
            i++;
        }
        final h5b h5bVar6 = h5bVar;
        return q5bVar.U(rl4.h(j), rl4.g(j), nm6.E, new bz7() { // from class: doh
            /* JADX WARN: Removed duplicated region for block: B:120:0x04cd A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:165:0x057b  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0584  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x0596  */
            /* JADX WARN: Removed duplicated region for block: B:177:0x0624  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x066b A[LOOP:3: B:182:0x0669->B:183:0x066b, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:186:0x067e A[LOOP:4: B:185:0x067c->B:186:0x067e, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:193:0x06a5  */
            /* JADX WARN: Removed duplicated region for block: B:194:0x06ab  */
            /* JADX WARN: Removed duplicated region for block: B:197:0x06b5  */
            /* JADX WARN: Removed duplicated region for block: B:198:0x06bb  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x06cc  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x06f7  */
            /* JADX WARN: Removed duplicated region for block: B:216:0x06ff A[LOOP:5: B:215:0x06fd->B:216:0x06ff, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:219:0x0714 A[LOOP:6: B:218:0x0712->B:219:0x0714, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x01a3  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0287  */
            @Override // defpackage.bz7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r32) {
                /*
                    Method dump skipped, instruction units count: 1827
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.doh.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final d8a f(final q5b q5bVar, hoh hohVar, final h5b h5bVar, final toh tohVar, final h5b h5bVar2, final h5b h5bVar3, final long j, final bz7 bz7Var) {
        final d8a d8aVarE = x44.E();
        bz7 bz7Var2 = new bz7() { // from class: eoh
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                ooh oohVar = (ooh) obj;
                ipc ipcVarA = tohVar.a(oohVar);
                if (((Boolean) bz7Var.invoke(ipcVarA)).booleanValue()) {
                    int iOrdinal = oohVar.ordinal();
                    foh fohVar = this;
                    d8a d8aVar = d8aVarE;
                    q5b q5bVar2 = q5bVar;
                    long j2 = j;
                    if (iOrdinal == 0) {
                        int iM0 = q5bVar2.M0(fohVar.g().e);
                        fohVar.g().getClass();
                        int iM02 = q5bVar2.M0(420.0f);
                        h5b h5bVar4 = h5bVar;
                        if (h5bVar4 != null) {
                            d8aVar.add(new cqc(h5bVar4, 10, oohVar, ipcVarA, iM0, iM02, q5bVar2, j2));
                        }
                    } else if (iOrdinal == 1) {
                        int iM03 = q5bVar2.M0(fohVar.g().e);
                        fohVar.g().getClass();
                        int iM04 = q5bVar2.M0(420.0f);
                        h5b h5bVar5 = h5bVar2;
                        if (h5bVar5 != null) {
                            d8aVar.add(new cqc(h5bVar5, 5, oohVar, ipcVarA, iM03, iM04, q5bVar2, j2));
                        }
                    } else {
                        if (iOrdinal != 2) {
                            mr9.b();
                            return null;
                        }
                        int iM05 = q5bVar2.M0(fohVar.g().e);
                        fohVar.g().getClass();
                        int iM06 = q5bVar2.M0(420.0f);
                        h5b h5bVar6 = h5bVar3;
                        if (h5bVar6 != null) {
                            d8aVar.add(new cqc(h5bVar6, 1, oohVar, ipcVarA, iM05, iM06, q5bVar2, j2));
                        }
                    }
                }
                return iei.a;
            }
        };
        bz7Var2.invoke(hohVar.a);
        bz7Var2.invoke(ooh.E);
        bz7Var2.invoke(hohVar.b);
        return x44.v(d8aVarE);
    }

    public final kqc g() {
        return (kqc) this.c.getValue();
    }

    public final void h(c79 c79Var, cqc cqcVar, boolean z) {
        cqcVar.i = c79Var;
        fqc fqcVarB = this.b.b(cqcVar.c);
        if (!z && !x44.r(cqcVar.d, lja.b0)) {
            fqcVarB.f = cqcVar.h;
            return;
        }
        c79 c79Var2 = cqcVar.i;
        if (c79Var2 != null) {
            if (!fqcVarB.g) {
                fqcVarB.b = fqcVarB.h ? fqcVarB.d : c79Var2.d();
                fqcVarB.c = fqcVarB.h ? fqcVarB.e : c79Var2.e();
                fqcVarB.g = true;
            }
            fqcVarB.d = c79Var2.d();
            fqcVarB.e = c79Var2.e();
            fqcVarB.h = true;
        }
    }

    public final void i(c79 c79Var, int i, cqc cqcVar, List list, boolean z) {
        c79 c79Var2;
        cqc cqcVar2 = list.isEmpty() ? null : (cqc) list.get(0);
        if (cqcVar.c == null) {
            int iC = c79Var.c() - i;
            int iMax = Math.max(iC - cqcVar2.f, iC / 2);
            cqcVar.f = iMax;
            cqcVar2.f = iC - iMax;
        } else {
            cqcVar.f = c79Var.c();
        }
        if (cqcVar2 != null) {
            c79Var2 = c79Var;
            h(c79.a(c79Var, 0, c79Var.b + cqcVar.f + i, 0, 0, 13), cqcVar2, z);
        } else {
            c79Var2 = c79Var;
        }
        h(c79.a(c79Var2, 0, 0, 0, c79Var2.b + cqcVar.f, 7), cqcVar, z);
    }

    public final void j(c79 c79Var, int i, int i2, List list, d8a d8aVar, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        int iF = c79Var.f() - ((list.size() - 1) * i);
        List list2 = list;
        Iterator it = list2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((cqc) it.next()).e;
        }
        if (iF > i3) {
            Iterator it2 = list2.iterator();
            if (!it2.hasNext()) {
                pmf.d();
                return;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int i4 = ((cqc) next).b;
                do {
                    Object next2 = it2.next();
                    int i5 = ((cqc) next2).b;
                    if (i4 < i5) {
                        next = next2;
                        i4 = i5;
                    }
                } while (it2.hasNext());
            }
            cqc cqcVar = (cqc) next;
            cqcVar.e = (iF - i3) + cqcVar.e;
        } else if (iF < i3) {
            float f = iF / i3;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((cqc) list.get(i6)).e = (int) (r4.e * f);
            }
        }
        int i7 = c79Var.a;
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            cqc cqcVar2 = (cqc) list.get(i8);
            int i9 = cqcVar2.e;
            i(new c79(i7, c79Var.b, i7 + i9, c79Var.d), i2, cqcVar2, d8aVar, z);
            i7 += i9 + i;
        }
    }
}
