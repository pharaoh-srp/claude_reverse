package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class q20 implements ga8 {
    public static boolean g = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public uxi c;
    public boolean d;
    public xv8 e;
    public final o20 f;

    public q20(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        o20 o20Var = new o20(0, this);
        this.f = o20Var;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(o20Var);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new p20(0, this));
    }

    public static final void d(q20 q20Var) {
        xv8 xv8Var = q20Var.e;
        if (xv8Var != null) {
            synchronized (xv8Var) {
                try {
                    ewb ewbVar = (ewb) xv8Var.F;
                    if (ewbVar != null) {
                        ewbVar.a();
                    }
                    ewb ewbVar2 = (ewb) xv8Var.G;
                    if (ewbVar2 != null) {
                        ewbVar2.a();
                    }
                    xv8Var.H = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        q20Var.e = null;
    }

    @Override // defpackage.ga8
    public final void a(ja8 ja8Var) {
        synchronized (this.b) {
            if (!ja8Var.s) {
                ja8Var.s = true;
                ja8Var.b();
            }
        }
    }

    @Override // defpackage.ga8
    public final xv8 b() {
        xv8 xv8Var = this.e;
        if (xv8Var != null) {
            return xv8Var;
        }
        xv8 xv8Var2 = new xv8(8);
        this.e = xv8Var2;
        return xv8Var2;
    }

    @Override // defpackage.ga8
    public final ja8 c() {
        la8 sa8Var;
        la8 qa8Var;
        ja8 ja8Var;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i >= 29) {
                    qa8Var = new qa8();
                } else {
                    if (g) {
                        try {
                            sa8Var = new oa8(this.a);
                        } catch (Throwable unused) {
                            g = false;
                            AndroidComposeView androidComposeView2 = this.a;
                            uxi uxiVar = this.c;
                            if (uxiVar == null) {
                                uxi uxiVar2 = new uxi(androidComposeView2.getContext());
                                androidComposeView2.addView(uxiVar2, -1);
                                this.c = uxiVar2;
                                uxiVar = uxiVar2;
                            }
                            sa8Var = new sa8(uxiVar);
                        }
                    } else {
                        AndroidComposeView androidComposeView3 = this.a;
                        uxi uxiVar3 = this.c;
                        if (uxiVar3 == null) {
                            uxi uxiVar4 = new uxi(androidComposeView3.getContext());
                            androidComposeView3.addView(uxiVar4, -1);
                            this.c = uxiVar4;
                            uxiVar3 = uxiVar4;
                        }
                        sa8Var = new sa8(uxiVar3);
                    }
                    qa8Var = sa8Var;
                }
                ja8Var = new ja8(qa8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja8Var;
    }
}
