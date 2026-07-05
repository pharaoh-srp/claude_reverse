package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.webkit.WebSettings;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ft4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Context G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft4(Context context, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = context;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ft4 ft4Var = new ft4(this.G, tp4Var, 0);
                ft4Var.F = obj;
                return ft4Var;
            default:
                ft4 ft4Var2 = new ft4(this.G, tp4Var, 1);
                ft4Var2.F = obj;
                return ft4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ft4) create((JsonObject) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ft4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Vibrator defaultVibrator;
        VibrationEffect vibrationEffectCreatePredefined;
        Object hreVar;
        int i = this.E;
        Context context = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                String strA = gt4.a("type", (JsonObject) obj2);
                if (strA == null) {
                    strA = "light";
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    Object systemService = context.getSystemService("vibrator_manager");
                    systemService.getClass();
                    defaultVibrator = gb2.z(systemService).getDefaultVibrator();
                } else {
                    Object systemService2 = context.getSystemService("vibrator");
                    systemService2.getClass();
                    defaultVibrator = (Vibrator) systemService2;
                }
                defaultVibrator.getClass();
                if (!defaultVibrator.hasVibrator()) {
                    i15 i15Var = i15.d;
                    return new i15(null, "device has no vibrator", 2, false);
                }
                switch (strA.hashCode()) {
                    case -1867169789:
                        if (strA.equals("success")) {
                            vibrationEffectCreatePredefined = i2 >= 29 ? VibrationEffect.createPredefined(1) : VibrationEffect.createWaveform(new long[]{0, 30, 60, 30}, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var2 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var3 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    case -1078030475:
                        if (strA.equals("medium")) {
                            vibrationEffectCreatePredefined = i2 >= 29 ? VibrationEffect.createPredefined(0) : VibrationEffect.createOneShot(30L, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var22 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var32 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    case 96784904:
                        if (strA.equals("error")) {
                            vibrationEffectCreatePredefined = VibrationEffect.createWaveform(new long[]{0, 80, 60, 80}, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var222 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var322 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    case 99152071:
                        if (strA.equals("heavy")) {
                            vibrationEffectCreatePredefined = i2 >= 29 ? VibrationEffect.createPredefined(5) : VibrationEffect.createOneShot(60L, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var2222 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var3222 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    case 102970646:
                        if (strA.equals("light")) {
                            vibrationEffectCreatePredefined = i2 >= 29 ? VibrationEffect.createPredefined(2) : VibrationEffect.createOneShot(15L, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var22222 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var32222 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    case 1124446108:
                        if (strA.equals("warning")) {
                            vibrationEffectCreatePredefined = VibrationEffect.createOneShot(100L, -1);
                            defaultVibrator.vibrate(vibrationEffectCreatePredefined);
                            i15 i15Var222222 = i15.d;
                            return zl4.o(null);
                        }
                        i15 i15Var322222 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                    default:
                        i15 i15Var3222222 = i15.d;
                        return new i15(null, "unknown haptic type: ".concat(strA), 2, false);
                }
            default:
                sf5.h0(obj);
                try {
                    hreVar = WebSettings.getDefaultUserAgent(context);
                    break;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                return new jre(hreVar);
        }
    }
}
