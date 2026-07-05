package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class pl3 {
    public final fk0 a;

    static {
        oqb oqbVar = fk0.K;
    }

    public pl3(fk0 fk0Var) {
        this.a = fk0Var;
    }

    public final void a(View view) {
        view.getClass();
        if (this.a.n()) {
            if (Build.VERSION.SDK_INT >= 30) {
                view.performHapticFeedback(16);
            } else {
                view.performHapticFeedback(6);
            }
        }
    }

    public final void b(View view) {
        view.getClass();
        if (this.a.n()) {
            view.performHapticFeedback(6);
        }
    }

    public final void c(View view) {
        view.getClass();
        if (this.a.n()) {
            view.performHapticFeedback(3);
        }
    }

    public final void d(gf8 gf8Var) {
        gf8Var.getClass();
        if (this.a.n()) {
            gf8Var.a(0);
        }
    }

    public final void e(View view) {
        view.getClass();
        if (this.a.n()) {
            if (Build.VERSION.SDK_INT >= 30) {
                view.performHapticFeedback(17);
            } else {
                view.performHapticFeedback(6);
            }
        }
    }

    public final void f(View view) {
        view.getClass();
        if (this.a.n()) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(22);
            } else {
                view.performHapticFeedback(6);
            }
        }
    }

    public final void g(View view) {
        view.getClass();
        if (this.a.n()) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(21);
            } else {
                view.performHapticFeedback(6);
            }
        }
    }

    public final void h(View view) {
        view.getClass();
        if (this.a.n()) {
            Vibrator defaultVibrator = null;
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = view.getContext().getSystemService("vibrator_manager");
                VibratorManager vibratorManagerF = gb2.w(systemService) ? gb2.f(systemService) : null;
                if (vibratorManagerF != null) {
                    defaultVibrator = vibratorManagerF.getDefaultVibrator();
                }
            } else {
                Object systemService2 = view.getContext().getSystemService("vibrator");
                if (systemService2 instanceof Vibrator) {
                    defaultVibrator = (Vibrator) systemService2;
                }
            }
            if (defaultVibrator != null) {
                defaultVibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 200, 100, 200}, -1));
            }
        }
    }

    public final void i(View view) {
        view.getClass();
        if (this.a.n()) {
            view.performHapticFeedback(1);
        }
    }
}
