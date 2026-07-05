package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rhf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mif F;

    public /* synthetic */ rhf(mif mifVar, int i) {
        this.E = i;
        this.F = mifVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int iNextIndex;
        l45 l45Var;
        int i = this.E;
        boolean z = true;
        iei ieiVar = iei.a;
        mif mifVar = this.F;
        switch (i) {
            case 0:
                fcc fccVar = (fcc) mifVar.q.getValue();
                return new fcc(fccVar != null ? fccVar.a : 9205357640488583168L);
            case 1:
                fcc fccVar2 = (fcc) mifVar.r.getValue();
                return new fcc(fccVar2 != null ? fccVar2.a : 9205357640488583168L);
            case 2:
                mifVar.n();
                return ieiVar;
            case 3:
                return mifVar.e();
            case 4:
                mif mifVar2 = this.F;
                mifVar2.y = true;
                mifVar2.u();
                mifVar2.s.setValue(null);
                mifVar2.t.setValue(null);
                if (mifVar2.v && mifVar2.m()) {
                    dae daeVar = new dae();
                    dae daeVar2 = new dae();
                    cae caeVar = new cae();
                    tif tifVar = mifVar2.a;
                    ArrayList arrayListD = tifVar.d(mifVar2.o());
                    ListIterator listIterator = arrayListD.listIterator(arrayListD.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            ohf ohfVar = (ohf) tifVar.a().e(((ztb) listIterator.previous()).a);
                            if (ohfVar != null && ohfVar.a.b != ohfVar.b.b) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        } else {
                            iNextIndex = -1;
                        }
                    }
                    if (iNextIndex != -1) {
                        int size = arrayListD.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                ztb ztbVar = (ztb) arrayListD.get(i2);
                                ohf ohfVar2 = (ohf) tifVar.a().e(ztbVar.a);
                                if (ohfVar2 != null) {
                                    zb0 zb0VarI = ztbVar.i();
                                    long jM = mwa.m(ohfVar2.a.b, ohfVar2.b.b);
                                    boolean z2 = i2 >= iNextIndex;
                                    long j = ztbVar.a;
                                    if (z2) {
                                        daeVar.E = zb0VarI;
                                        daeVar2.E = new kkh(jM);
                                        caeVar.E = j;
                                    }
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    Object obj = daeVar.E;
                    if (obj != null && daeVar2.E != null && caeVar.E != 0 && ((CharSequence) obj).length() > 0 && (l45Var = mifVar2.w) != null) {
                        gb9.D(l45Var, null, null, new lza(mifVar2, daeVar, daeVar2, caeVar, (tp4) null, 12), 3);
                    }
                }
                mifVar2.v = false;
                return ieiVar;
            case 5:
                mifVar.b();
                return ieiVar;
            case 6:
                mifVar.p();
                return ieiVar;
            case 7:
                mifVar.b();
                if (mifVar.l()) {
                    mifVar.n();
                }
                return ieiVar;
            case 8:
                if (mifVar.y && mifVar.l()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                mifVar.p();
                return ieiVar;
        }
    }
}
