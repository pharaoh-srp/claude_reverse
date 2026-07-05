package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.anthropic.claude.bell.BellModeService;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class lj1 implements ServiceConnection {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ lj1(flj fljVar) {
        this.E = 2;
        Objects.requireNonNull(fljVar);
        this.F = fljVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        utj jtjVar = null;
        switch (this.E) {
            case 0:
                iBinder.getClass();
                mj1 mj1Var = (mj1) this.F;
                BellModeService bellModeService = ((cm1) iBinder).i;
                mj1Var.I = bellModeService;
                String str = mj1Var.b;
                String str2 = mj1Var.c;
                String strS = mj1Var.S();
                String strQ = mj1Var.Q();
                String strT = mj1Var.T();
                boolean z = mj1Var.d;
                o1j o1jVar = mj1Var.e;
                koi koiVar = mj1Var.f;
                fn1 fn1VarD = bellModeService.d(str, str2, strS, strQ, strT, z, o1jVar, koiVar.d, koiVar.e);
                mj1Var.K.m(fn1VarD);
                if (fn1VarD == null) {
                    mj1Var.N.r(nk1.a);
                }
                break;
            case 1:
                iBinder.getClass();
                en1 en1Var = (en1) this.F;
                BellModeService bellModeService2 = ((cm1) iBinder).i;
                en1Var.m = bellModeService2;
                fn1 fn1VarD2 = bellModeService2.d(en1Var.b, en1Var.c, en1Var.d, en1Var.e, en1Var.f, en1Var.g, o1j.E, en1Var.h, en1Var.i);
                ((en1) this.F).q.m(fn1VarD2);
                if (fn1VarD2 == null) {
                    ((en1) this.F).b();
                    ((en1) this.F).a.stopService(new Intent(((en1) this.F).a, (Class<?>) BellModeService.class));
                    bz7 bz7Var = BellModeService.T;
                    if (BellModeService.T == ((en1) this.F).n) {
                        BellModeService.T = null;
                    }
                    ((en1) this.F).k.a();
                }
                break;
            case 2:
                flj fljVar = (flj) this.F;
                fljVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                fljVar.a().post(new dlj(this, iBinder));
                break;
            case 3:
                jyj.g("BillingClientTesting", "Billing Override Service connected.");
                t2k t2kVar = (t2k) this.F;
                int i = ptj.j;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    jtjVar = iInterfaceQueryLocalInterface instanceof utj ? (utj) iInterfaceQueryLocalInterface : new jtj(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 7);
                }
                t2kVar.H = jtjVar;
                t2kVar.G = 2;
                t2kVar.I(26);
                break;
            case 4:
                y0l y0lVar = (y0l) this.F;
                y0lVar.b.i("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                y0lVar.a().post(new muk(this, iBinder));
                break;
            case 5:
                s4l s4lVar = (s4l) this.F;
                s4lVar.b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                s4lVar.a().post(new bbk(this, iBinder));
                break;
            default:
                u5l u5lVar = (u5l) this.F;
                u5lVar.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                u5lVar.a().post(new w4l(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 1;
        switch (this.E) {
            case 0:
                mj1 mj1Var = (mj1) this.F;
                mj1Var.K.m(null);
                mj1Var.I = null;
                mj1Var.H = null;
                break;
            case 1:
                en1 en1Var = (en1) this.F;
                en1Var.q.m(null);
                en1Var.m = null;
                en1Var.l = null;
                break;
            case 2:
                flj fljVar = (flj) this.F;
                fljVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                fljVar.a().post(new elj(this));
                break;
            case 3:
                jyj.h("BillingClientTesting", "Billing Override Service disconnected.");
                t2k t2kVar = (t2k) this.F;
                t2kVar.H = null;
                t2kVar.G = 0;
                break;
            case 4:
                y0l y0lVar = (y0l) this.F;
                y0lVar.b.i("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                y0lVar.a().post(new jnk(this));
                break;
            case 5:
                s4l s4lVar = (s4l) this.F;
                s4lVar.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                s4lVar.a().post(new rzk(i, this));
                break;
            default:
                u5l u5lVar = (u5l) this.F;
                u5lVar.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                u5lVar.a().post(new n3l(1, this));
                break;
        }
    }

    public /* synthetic */ lj1(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ lj1(y0l y0lVar) {
        this.E = 4;
        Objects.requireNonNull(y0lVar);
        this.F = y0lVar;
    }
}
