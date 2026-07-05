package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class srb implements qrb {
    public final Context E;
    public mp4 F;
    public final hsc G = new hsc(1.0f);
    public fkg H;

    public srb(Context context) {
        this.E = context;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(obj, this);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        return nai.W(this, b45Var);
    }

    @Override // defpackage.qrb
    public final float T() {
        tp4 tp4Var;
        ylg ylgVar;
        if (this.H == null) {
            Context context = this.E;
            ewb ewbVar = bej.a;
            synchronized (ewbVar) {
                try {
                    Object objG = ewbVar.g(context);
                    tp4Var = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        zy1 zy1VarP = wd6.P(-1, 6, null);
                        objG = j8.f0(new b3f(new dxb(contentResolver, uriFor, new tq5(zy1VarP, dgj.A(Looper.getMainLooper()), 1), zy1VarP, context, null)), fd9.o(), new llg(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        ewbVar.m(context, objG);
                    }
                    ylgVar = (ylg) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.G.i(((Number) ylgVar.getValue()).floatValue());
            mp4 mp4Var = this.F;
            if (mp4Var == null) {
                sz6.j("MotionDurationScale scale factor requested before recomposer loop start");
                return MTTypesetterKt.kLineSkipLimitMultiplier;
            }
            this.H = gb9.D(mp4Var, null, null, new rrb(ylgVar, this, tp4Var, 0), 3);
        }
        return this.G.h();
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        return nai.Z(this, c45Var);
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        return nai.C(this, b45Var);
    }
}
