package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.Spatializer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x31 implements lfh {
    public boolean E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;

    public x31(Context context, do0 do0Var, p31 p31Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.F = applicationContext;
        this.G = do0Var;
        this.O = p31Var;
        this.N = audioDeviceInfo;
        String str = tpi.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.H = handler;
        this.I = new v31(this);
        this.J = new xg0(1, this);
        vde vdeVar = u31.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.K = uriFor != null ? new w31(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public List a() {
        s31 s31Var;
        Spatializer spatializer;
        int i = Build.VERSION.SDK_INT;
        if (i < 32 || (s31Var = (s31) this.L) == null) {
            iz8 iz8Var = nz8.F;
            return vde.I;
        }
        Spatializer spatializer2 = (Spatializer) s31Var.G;
        if (spatializer2 == null || !s31Var.F || !spatializer2.isAvailable() || (spatializer = (Spatializer) s31Var.G) == null || !spatializer.isEnabled()) {
            iz8 iz8Var2 = nz8.F;
            return vde.I;
        }
        if (i < 36) {
            return nz8.u(252);
        }
        Spatializer spatializer3 = (Spatializer) s31Var.G;
        spatializer3.getClass();
        return o31.c(spatializer3).getSpatializedChannelMasks();
    }

    public void b(u31 u31Var) {
        if (!this.E || u31Var.equals((u31) this.M)) {
            return;
        }
        this.M = u31Var;
        i61 i61Var = (i61) ((do0) this.G).F;
        i61Var.f();
        u31 u31Var2 = i61Var.h;
        if (u31Var2 == null || u31Var.equals(u31Var2)) {
            return;
        }
        i61Var.h = u31Var;
        kba kbaVar = i61Var.f;
        if (kbaVar != null) {
            kbaVar.e(-1, new wg6(20));
        }
    }

    public void c() {
        List listA = a();
        Context context = (Context) this.F;
        p31 p31Var = (p31) this.O;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.N;
        vde vdeVar = u31.e;
        b(u31.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p31Var, audioDeviceInfo, listA));
    }

    @Override // defpackage.lfh
    public void k(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(794272399);
        int i2 = (e18Var2.f(this) ? 32 : 16) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            xn5.I(bjh.F, ((yih) this.F).d().G, ta4Var, (wgh) this.H, null, (pz7) this.I, (pz7) this.J, (pz7) this.K, null, null, x44.r((dhh) this.G, unb.R), this.E, false, (w79) this.L, (mnc) this.M, (ffh) this.N, (ta4) this.O, e18Var, 390, 0);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(this, ta4Var, i, 15);
        }
    }

    public x31(yih yihVar, dhh dhhVar, wgh wghVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, boolean z, w79 w79Var, mnc mncVar, ffh ffhVar, ta4 ta4Var) {
        this.F = yihVar;
        this.G = dhhVar;
        this.H = wghVar;
        this.I = pz7Var;
        this.J = pz7Var2;
        this.K = pz7Var3;
        this.E = z;
        this.L = w79Var;
        this.M = mncVar;
        this.N = ffhVar;
        this.O = ta4Var;
    }
}
