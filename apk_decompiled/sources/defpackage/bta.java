package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class bta implements wsa {
    public final n88 a;
    public cz5 b;
    public fu9 c;
    public ka2 d;

    public bta(n88 n88Var, ka2 ka2Var, String str, cz5 cz5Var, fu9 fu9Var, mnc mncVar) {
        n88Var.getClass();
        ka2Var.getClass();
        cz5Var.getClass();
        fu9Var.getClass();
        mncVar.getClass();
        this.a = n88Var;
        this.b = cz5Var;
        this.c = fu9Var;
        ita.a(this, n88Var, mncVar);
        ka2Var.b(n88Var);
        if (str != null) {
            n88Var.d(str);
        }
        this.d = ka2Var;
    }

    @Override // defpackage.wsa
    public final void a() {
        this.d.b(null);
    }

    @Override // defpackage.wsa
    public final void b() {
        ata ataVar = new ata(this);
        n88 n88Var = this.a;
        hfk hfkVar = n88Var.a;
        hfk hfkVar2 = n88Var.a;
        try {
            voj vojVar = new voj(ataVar);
            Parcel parcelH = hfkVar.H();
            gyj.d(parcelH, vojVar);
            hfkVar.L(parcelH, 99);
            try {
                voj vojVar2 = new voj(new ata(this), 0);
                Parcel parcelH2 = hfkVar2.H();
                gyj.d(parcelH2, vojVar2);
                hfkVar2.L(parcelH2, 98);
                try {
                    voj vojVar3 = new voj(new ata(this), (byte) 0);
                    Parcel parcelH3 = hfkVar2.H();
                    gyj.d(parcelH3, vojVar3);
                    hfkVar2.L(parcelH3, 96);
                    try {
                        voj vojVar4 = new voj(new ata(this), (char) 0);
                        Parcel parcelH4 = hfkVar2.H();
                        gyj.d(parcelH4, vojVar4);
                        hfkVar2.L(parcelH4, 97);
                    } catch (RemoteException e) {
                        poc.q(e);
                    }
                } catch (RemoteException e2) {
                    poc.q(e2);
                }
            } catch (RemoteException e3) {
                poc.q(e3);
            }
        } catch (RemoteException e4) {
            poc.q(e4);
        }
    }

    @Override // defpackage.wsa
    public final void c() {
        this.d.b(null);
    }
}
