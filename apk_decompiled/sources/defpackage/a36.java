package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public class a36 extends cx7 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean H0;
    public Dialog J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public Handler y0;
    public final k51 z0 = new k51(4, this);
    public final x26 A0 = new x26(this);
    public final y26 B0 = new y26(this);
    public int C0 = 0;
    public int D0 = 0;
    public boolean E0 = true;
    public boolean F0 = true;
    public int G0 = -1;
    public final poj I0 = new poj(this);
    public boolean N0 = false;

    @Override // defpackage.cx7
    public final void B(Bundle bundle) {
        Dialog dialog = this.J0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.C0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.D0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.E0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.F0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.G0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.cx7
    public final void C() {
        this.i0 = true;
        Dialog dialog = this.J0;
        if (dialog != null) {
            this.K0 = false;
            dialog.show();
            View decorView = this.J0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // defpackage.cx7
    public final void D() {
        this.i0 = true;
        Dialog dialog = this.J0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.cx7
    public final void E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.E(layoutInflater, viewGroup, bundle);
        if (this.J0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.J0.onRestoreInstanceState(bundle2);
    }

    public final void H(boolean z) {
        if (this.L0) {
            return;
        }
        this.L0 = true;
        this.M0 = false;
        Dialog dialog = this.J0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.J0.dismiss();
            if (!z) {
                if (Looper.myLooper() == this.y0.getLooper()) {
                    onDismiss(this.J0);
                } else {
                    this.y0.post(this.z0);
                }
            }
        }
        this.K0 = true;
        if (this.G0 < 0) {
            tb1 tb1Var = new tb1(l());
            tb1Var.o = true;
            tb1Var.h(this);
            tb1Var.e(true, true);
            return;
        }
        rx7 rx7VarL = l();
        int i = this.G0;
        if (i < 0) {
            sz6.p(grc.p(i, "Bad id: "));
        } else {
            rx7VarL.y(new px7(rx7VarL, i), true);
            this.G0 = -1;
        }
    }

    public Dialog I() {
        if (rx7.J(3)) {
            toString();
        }
        return new ga4(F(), this.D0);
    }

    @Override // defpackage.cx7
    public final d4c b() {
        return new z26(this, new z26(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.K0) {
            return;
        }
        if (rx7.J(3)) {
            toString();
        }
        H(true);
    }

    @Override // defpackage.cx7
    public final void s() {
        this.i0 = true;
    }

    @Override // defpackage.cx7
    public final void u(Context context) {
        Object obj;
        super.u(context);
        bvb bvbVar = this.t0;
        bvbVar.getClass();
        bvb.a("observeForever");
        poj pojVar = this.I0;
        pba pbaVar = new pba(bvbVar, pojVar);
        h3f h3fVar = bvbVar.b;
        e3f e3fVarA = h3fVar.a(pojVar);
        if (e3fVarA != null) {
            obj = e3fVarA.F;
        } else {
            e3f e3fVar = new e3f(pojVar, pbaVar);
            h3fVar.H++;
            e3f e3fVar2 = h3fVar.F;
            if (e3fVar2 == null) {
                h3fVar.E = e3fVar;
                h3fVar.F = e3fVar;
            } else {
                e3fVar2.G = e3fVar;
                e3fVar.H = e3fVar2;
                h3fVar.F = e3fVar;
            }
            obj = null;
        }
        rba rbaVar = (rba) obj;
        if (rbaVar instanceof qba) {
            sz6.p("Cannot add the same observer with different lifecycles");
            return;
        }
        if (rbaVar == null) {
            pbaVar.a(true);
        }
        if (this.M0) {
            return;
        }
        this.L0 = false;
    }

    @Override // defpackage.cx7
    public void v(Bundle bundle) {
        super.v(bundle);
        this.y0 = new Handler();
        this.F0 = this.c0 == 0;
        if (bundle != null) {
            this.C0 = bundle.getInt("android:style", 0);
            this.D0 = bundle.getInt("android:theme", 0);
            this.E0 = bundle.getBoolean("android:cancelable", true);
            this.F0 = bundle.getBoolean("android:showsDialog", this.F0);
            this.G0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.cx7
    public final void w() {
        this.i0 = true;
        Dialog dialog = this.J0;
        if (dialog != null) {
            this.K0 = true;
            dialog.setOnDismissListener(null);
            this.J0.dismiss();
            if (!this.L0) {
                onDismiss(this.J0);
            }
            this.J0 = null;
            this.N0 = false;
        }
    }

    @Override // defpackage.cx7
    public final void x() {
        this.i0 = true;
        if (!this.M0 && !this.L0) {
            this.L0 = true;
        }
        this.t0.h(this.I0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0042, B:29:0x004c, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0064), top: B:45:0x0018 }] */
    @Override // defpackage.cx7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater y(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.y(r7)
            boolean r0 = r6.F0
            r1 = 2
            if (r0 == 0) goto L83
            boolean r2 = r6.H0
            if (r2 == 0) goto Lf
            goto L83
        Lf:
            if (r0 != 0) goto L12
            goto L6d
        L12:
            boolean r0 = r6.N0
            if (r0 != 0) goto L6d
            r0 = 0
            r2 = 1
            r6.H0 = r2     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.I()     // Catch: java.lang.Throwable -> L4a
            r6.J0 = r3     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.F0     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L64
            int r4 = r6.C0     // Catch: java.lang.Throwable -> L4a
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L4a
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L4a
        L3c:
            android.content.Context r3 = r6.j()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L4c
            android.app.Dialog r4 = r6.J0     // Catch: java.lang.Throwable -> L4a
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4a
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L4a
            goto L4c
        L4a:
            r7 = move-exception
            goto L6a
        L4c:
            android.app.Dialog r3 = r6.J0     // Catch: java.lang.Throwable -> L4a
            boolean r4 = r6.E0     // Catch: java.lang.Throwable -> L4a
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.J0     // Catch: java.lang.Throwable -> L4a
            x26 r4 = r6.A0     // Catch: java.lang.Throwable -> L4a
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L4a
            android.app.Dialog r3 = r6.J0     // Catch: java.lang.Throwable -> L4a
            y26 r4 = r6.B0     // Catch: java.lang.Throwable -> L4a
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L4a
            r6.N0 = r2     // Catch: java.lang.Throwable -> L4a
            goto L67
        L64:
            r2 = 0
            r6.J0 = r2     // Catch: java.lang.Throwable -> L4a
        L67:
            r6.H0 = r0
            goto L6d
        L6a:
            r6.H0 = r0
            throw r7
        L6d:
            boolean r0 = defpackage.rx7.J(r1)
            if (r0 == 0) goto L76
            r6.toString()
        L76:
            android.app.Dialog r6 = r6.J0
            if (r6 == 0) goto L8c
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = r7.cloneInContext(r6)
            return r6
        L83:
            boolean r0 = defpackage.rx7.J(r1)
            if (r0 == 0) goto L8c
            r6.toString()
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a36.y(android.os.Bundle):android.view.LayoutInflater");
    }
}
