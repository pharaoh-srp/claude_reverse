package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hqa extends a0 {
    public final n88 I;
    public final kta J;
    public final pqa K;
    public final ArrayList L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqa(n88 n88Var, kta ktaVar, pqa pqaVar) {
        super(xsa.a);
        n88Var.getClass();
        ktaVar.getClass();
        this.I = n88Var;
        this.J = ktaVar;
        this.K = pqaVar;
        this.L = new ArrayList();
        gqa gqaVar = new gqa(this);
        hfk hfkVar = n88Var.a;
        try {
            voj vojVar = new voj(gqaVar);
            Parcel parcelH = hfkVar.H();
            gyj.d(parcelH, vojVar);
            hfkVar.L(parcelH, 89);
            try {
                voj vojVar2 = new voj(new gqa(this), (byte) 0, false);
                Parcel parcelH2 = hfkVar.H();
                gyj.d(parcelH2, vojVar2);
                hfkVar.L(parcelH2, 83);
                try {
                    voj vojVar3 = new voj(new gqa(this), (byte) 0, (byte) 0);
                    Parcel parcelH3 = hfkVar.H();
                    gyj.d(parcelH3, vojVar3);
                    hfkVar.L(parcelH3, 85);
                    try {
                        voj vojVar4 = new voj(new gqa(this), (byte) 0, (char) 0);
                        Parcel parcelH4 = hfkVar.H();
                        gyj.d(parcelH4, vojVar4);
                        hfkVar.L(parcelH4, 87);
                        try {
                            voj vojVar5 = new voj(new gqa(this), (byte) 0);
                            Parcel parcelH5 = hfkVar.H();
                            gyj.d(parcelH5, vojVar5);
                            hfkVar.L(parcelH5, 30);
                            try {
                                voj vojVar6 = new voj(new gqa(this), (char) 0);
                                Parcel parcelH6 = hfkVar.H();
                                gyj.d(parcelH6, vojVar6);
                                hfkVar.L(parcelH6, 32);
                                try {
                                    voj vojVar7 = new voj(new gqa(this), (short) 0);
                                    Parcel parcelH7 = hfkVar.H();
                                    gyj.d(parcelH7, vojVar7);
                                    hfkVar.L(parcelH7, 86);
                                    try {
                                        voj vojVar8 = new voj(new gqa(this), 0);
                                        Parcel parcelH8 = hfkVar.H();
                                        gyj.d(parcelH8, vojVar8);
                                        hfkVar.L(parcelH8, 84);
                                        try {
                                            voj vojVar9 = new voj(new ro6(9, this));
                                            Parcel parcelH9 = hfkVar.H();
                                            gyj.d(parcelH9, vojVar9);
                                            hfkVar.L(parcelH9, 31);
                                            tl8 tl8Var = new tl8(10, this);
                                            ktaVar.getClass();
                                            epk epkVar = new epk();
                                            epkVar.E = ktaVar;
                                            epkVar.F = tl8Var;
                                            try {
                                                voj vojVar10 = new voj(epkVar);
                                                Parcel parcelH10 = hfkVar.H();
                                                gyj.d(parcelH10, vojVar10);
                                                hfkVar.L(parcelH10, 33);
                                            } catch (RemoteException e) {
                                                poc.q(e);
                                                throw null;
                                            }
                                        } catch (RemoteException e2) {
                                            poc.q(e2);
                                            throw null;
                                        }
                                    } catch (RemoteException e3) {
                                        poc.q(e3);
                                        throw null;
                                    }
                                } catch (RemoteException e4) {
                                    poc.q(e4);
                                    throw null;
                                }
                            } catch (RemoteException e5) {
                                poc.q(e5);
                                throw null;
                            }
                        } catch (RemoteException e6) {
                            poc.q(e6);
                            throw null;
                        }
                    } catch (RemoteException e7) {
                        poc.q(e7);
                        throw null;
                    }
                } catch (RemoteException e8) {
                    poc.q(e8);
                    throw null;
                }
            } catch (RemoteException e9) {
                poc.q(e9);
                throw null;
            }
        } catch (RemoteException e10) {
            poc.q(e10);
            throw null;
        }
    }

    @Override // defpackage.hn0
    public final void a(int i, Object obj) {
        wsa wsaVar = (wsa) obj;
        wsaVar.getClass();
        this.L.add(i, wsaVar);
        wsaVar.b();
    }

    @Override // defpackage.hn0
    public final void d(int i, int i2, int i3) {
        a0.m(this.L, i, i2, i3);
    }

    @Override // defpackage.hn0
    public final void e(int i, int i2) {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.L;
            if (i3 >= i2) {
                break;
            }
            ((wsa) arrayList.get(i + i3)).c();
            i3++;
        }
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.subList(i, i2 + i).clear();
        }
    }

    @Override // defpackage.hn0
    public final void h(int i, Object obj) {
        ((wsa) obj).getClass();
    }

    @Override // defpackage.a0
    public final void n() {
        n88 n88Var = this.I;
        n88Var.getClass();
        try {
            hfk hfkVar = n88Var.a;
            hfkVar.L(hfkVar.H(), 14);
            ArrayList arrayList = this.L;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((wsa) it.next()).a();
            }
            arrayList.clear();
        } catch (RemoteException e) {
            poc.q(e);
        }
    }
}
