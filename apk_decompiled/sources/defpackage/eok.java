package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eok implements Runnable {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Parcelable G;
    public /* synthetic */ Object H;

    public eok(mnk mnkVar, rvj rvjVar, u1l u1lVar) {
        this.E = 1;
        this.G = rvjVar;
        this.H = u1lVar;
        this.F = mnkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar;
        boolean zD;
        boolean zI;
        hyk hykVar;
        switch (this.E) {
            case 0:
                mnk mnkVar = (mnk) this.F;
                Bundle bundle = (Bundle) this.G;
                String str = (String) this.H;
                o0l o0lVar = mnkVar.i;
                boolean zX0 = o0lVar.N().X0(null, zvj.h1);
                boolean zX02 = o0lVar.N().X0(null, zvj.j1);
                if (bundle.isEmpty() && zX0 && zX02) {
                    wrj wrjVar = o0lVar.G;
                    o0l.t(wrjVar);
                    wrjVar.P1(str);
                    return;
                } else {
                    wrj wrjVar2 = o0lVar.G;
                    o0l.t(wrjVar2);
                    wrjVar2.h1(str, bundle);
                    return;
                }
            case 1:
                mnk mnkVar2 = (mnk) this.F;
                o0l o0lVar2 = mnkVar2.i;
                rvj rvjVar = (rvj) this.G;
                String str2 = rvjVar.E;
                avj avjVar = rvjVar.F;
                if ("_cmp".equals(str2) && avjVar != null) {
                    Bundle bundle2 = avjVar.E;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            o0lVar2.b0().P.c("Event has been filtered ", rvjVar.toString());
                            rvjVar = new rvj("_cmpx", rvjVar.F, rvjVar.G, rvjVar.H);
                        }
                    }
                }
                String str3 = rvjVar.E;
                u1l u1lVar = (u1l) this.H;
                pkk pkkVar = o0lVar2.E;
                dik dikVar = o0lVar2.K;
                o0l.t(pkkVar);
                String str4 = u1lVar.E;
                if (TextUtils.isEmpty(str4) || (mVar = (m) pkkVar.L.get(str4)) == null || mVar.p() == 0) {
                    mnkVar2.F(rvjVar, u1lVar);
                    return;
                }
                o0lVar2.b0().R.c("EES config found for", str4);
                pkk pkkVar2 = o0lVar2.E;
                o0l.t(pkkVar2);
                cuj cujVar = TextUtils.isEmpty(str4) ? null : (cuj) pkkVar2.N.c(str4);
                if (cujVar == null) {
                    o0lVar2.b0().R.c("EES not loaded for", str4);
                    mnkVar2.F(rvjVar, u1lVar);
                    return;
                }
                try {
                    o0l.t(dikVar);
                    HashMap mapB1 = dik.b1(rvjVar.F.x0(), true);
                    String strB = q7j.b(str3, v40.m, v40.k);
                    if (strB == null) {
                        strB = str3;
                    }
                    zD = cujVar.d(new bqj(strB, rvjVar.H, mapB1));
                    break;
                } catch (zzc unused) {
                    o0lVar2.b0().J.a(u1lVar.F, str3, "EES error. appId, eventName");
                    zD = false;
                }
                if (!zD) {
                    o0lVar2.b0().R.c("EES was not applied to event", str3);
                    mnkVar2.F(rvjVar, u1lVar);
                    return;
                }
                if (cujVar.f()) {
                    o0lVar2.b0().R.c("EES edited event", str3);
                    o0l.t(dikVar);
                    mnkVar2.F(dik.d1(cujVar.a().V()), u1lVar);
                } else {
                    mnkVar2.F(rvjVar, u1lVar);
                }
                if (cujVar.e()) {
                    for (bqj bqjVar : (ArrayList) cujVar.a().W()) {
                        o0lVar2.b0().R.c("EES logging created event", bqjVar.c());
                        o0l.t(dikVar);
                        mnkVar2.F(dik.d1(bqjVar), u1lVar);
                    }
                    return;
                }
                return;
            case 2:
                synchronized (((AtomicReference) this.F)) {
                    try {
                        try {
                            zI = ((hyk) this.H).I0().V0().i(ork.ANALYTICS_STORAGE);
                            hykVar = (hyk) this.H;
                        } catch (RemoteException e) {
                            ((hyk) this.H).b0().J.c("Failed to get app instance id", e);
                        }
                        if (!zI) {
                            hykVar.b0().O.b("Analytics storage consent denied; will not get app instance id");
                            ((hyk) this.H).L0().o1(null);
                            ((hyk) this.H).I0().L.h(null);
                            ((AtomicReference) this.F).set(null);
                            return;
                        }
                        pfk pfkVar = hykVar.H;
                        if (pfkVar == null) {
                            hykVar.b0().J.b("Failed to get app instance id");
                            return;
                        }
                        ((AtomicReference) this.F).set(pfkVar.v((u1l) this.G));
                        String str5 = (String) ((AtomicReference) this.F).get();
                        if (str5 != null) {
                            ((hyk) this.H).L0().o1(str5);
                            ((hyk) this.H).I0().L.h(str5);
                        }
                        ((hyk) this.H).c1();
                        ((AtomicReference) this.F).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.F).notify();
                    }
                }
            default:
                u1l u1lVar2 = (u1l) this.F;
                hyk hykVar2 = (hyk) this.H;
                pfk pfkVar2 = hykVar2.H;
                if (pfkVar2 == null) {
                    hykVar2.b0().J.b("Failed to send default event parameters to service");
                    return;
                }
                try {
                    pfkVar2.mo1199e((Bundle) this.G, u1lVar2);
                    return;
                } catch (RemoteException e2) {
                    hykVar2.b0().J.c("Failed to send default event parameters to service", e2);
                    return;
                }
        }
    }

    public /* synthetic */ eok(hyk hykVar, Object obj, Parcelable parcelable, int i) {
        this.E = i;
        this.F = obj;
        this.G = parcelable;
        this.H = hykVar;
    }

    public /* synthetic */ eok() {
        this.E = 0;
    }
}
