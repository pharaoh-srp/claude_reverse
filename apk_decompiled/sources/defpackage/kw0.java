package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kw0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ kw0(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                zy7Var.a();
                return ieiVar;
            case 1:
                zy7Var.a();
                return ieiVar;
            case 2:
                ((Boolean) obj).getClass();
                zy7Var.a();
                return ieiVar;
            case 3:
                zy7Var.a();
                return ieiVar;
            case 4:
                ((jp9) obj).getClass();
                zy7Var.a();
                return ieiVar;
            case 5:
                ((NewCodeSessionPrefill) obj).getClass();
                zy7Var.a();
                return ieiVar;
            case 6:
                ((Boolean) obj).booleanValue();
                zy7Var.a();
                return ieiVar;
            case 7:
                xd6 xd6Var = (xd6) obj;
                xd6Var.T0(((d54) zy7Var.a()).a, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                return ieiVar;
            case 8:
                zy7Var.a();
                return ieiVar;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                kta ktaVar = new kta(context, (GoogleMapOptions) zy7Var.a());
                try {
                    b7k b7kVarI = npk.i(context);
                    cbc cbcVar = new cbc(context);
                    Parcel parcelH = b7kVarI.H();
                    gyj.d(parcelH, cbcVar);
                    parcelH.writeString("gmp_git_androidmapscompose_v6.6.0");
                    b7kVarI.L(parcelH, 12);
                    break;
                } catch (RemoteException | GooglePlayServicesNotAvailableException e) {
                    Log.e("elk", "Failed to add internal usage attribution id.", e);
                }
                p88 p88Var = new p88(ktaVar);
                context.registerComponentCallbacks(p88Var);
                k2a k2aVar = new k2a(ktaVar);
                ktaVar.setTag(new dta(p88Var, k2aVar));
                ktaVar.addOnAttachStateChangeListener(new q88(k2aVar));
                return ktaVar;
            case 10:
                zy7Var.a();
                return ieiVar;
            case 11:
                ((w86) obj).getClass();
                return new o10(10, zy7Var);
            case 12:
                zy7Var.a();
                return ieiVar;
            case 13:
                ((Boolean) obj).booleanValue();
                zy7Var.a();
                return ieiVar;
            case 14:
                ekf ekfVar = (ekf) obj;
                Object objA = zy7Var.a();
                if (Float.isNaN(((Number) objA).floatValue())) {
                    objA = null;
                }
                Float f = (Float) objA;
                ckf.r(ekfVar, new mjd(f != null ? f.floatValue() : 0.0f, new fq3(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f), 0));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Boolean) obj).booleanValue();
                zy7Var.a();
                return ieiVar;
            case 16:
                zy7Var.a();
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return (fcc) zy7Var.a();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return (fcc) zy7Var.a();
            default:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.b(((Number) zy7Var.a()).floatValue());
                return ieiVar;
        }
    }
}
