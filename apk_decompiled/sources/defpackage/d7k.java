package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import com.google.android.play.agesignals.AgeSignalsException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d7k extends a7k {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ j5h G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7k(y0l y0lVar, j5h j5hVar, j5h j5hVar2, d7k d7kVar) {
        super(j5hVar);
        this.G = j5hVar2;
        this.H = d7kVar;
        Objects.requireNonNull(y0lVar);
        this.I = y0lVar;
    }

    @Override // defpackage.a7k
    public void a(Exception exc) {
        switch (this.F) {
            case 0:
                if (!(exc instanceof zzp)) {
                    super.a(exc);
                } else {
                    super.a(new AgeSignalsException(-5));
                }
                break;
            default:
                super.a(exc);
                break;
        }
    }

    @Override // defpackage.a7k
    public final void b() {
        switch (this.F) {
            case 0:
                j5h j5hVar = this.G;
                try {
                    cfk cfkVar = (cfk) this.I;
                    it8 it8Var = cfkVar.b.m;
                    String packageName = cfkVar.a.getPackageName();
                    Bundle bundle = new Bundle();
                    bundle.putInt("playcore.version.code", 3);
                    zak zakVar = new zak(cfkVar, j5hVar);
                    gt8 gt8Var = (gt8) it8Var;
                    gt8Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    parcelObtain.writeString(packageName);
                    int i = kyj.a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(zakVar);
                    try {
                        gt8Var.i.transact(1, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    pyk pykVar = (pyk) this.H;
                    bnh bnhVar = cfk.c;
                    Object[] objArr = {pykVar};
                    bnhVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", bnh.k((String) bnhVar.F, "checkAgeSignals(%s)", objArr), e);
                    }
                    j5hVar.c(new AgeSignalsException(-100));
                    return;
                }
            default:
                y0l y0lVar = (y0l) this.I;
                synchronized (y0lVar.f) {
                    try {
                        j5h j5hVar2 = this.G;
                        y0lVar.e.add(j5hVar2);
                        j5hVar2.a.h(new mvd(y0lVar, 15, j5hVar2));
                        if (y0lVar.k.getAndIncrement() > 0) {
                            y0lVar.b.i("Already connected to the service.", new Object[0]);
                        }
                        y0l.b(y0lVar, (d7k) this.H);
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7k(cfk cfkVar, j5h j5hVar, j5h j5hVar2, pyk pykVar) {
        super(j5hVar);
        this.G = j5hVar2;
        this.H = pykVar;
        this.I = cfkVar;
    }
}
