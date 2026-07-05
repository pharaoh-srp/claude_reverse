package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class fx7 extends ba4 {
    public boolean b0;
    public boolean c0;
    public final tk5 Z = new tk5(13, new ex7(this));
    public final p4a a0 = new p4a(this, true);
    public boolean d0 = true;

    public fx7() {
        ((q28) this.H.G).B("android:support:lifecycle", new u94(2, this));
        this.N.add(new dx7(0, this));
        this.P.add(new dx7(1, this));
        v94 v94Var = new v94(this, 1);
        ki6 ki6Var = this.F;
        ki6Var.getClass();
        ba4 ba4Var = (ba4) ki6Var.G;
        if (ba4Var != null) {
            v94Var.a(ba4Var);
        }
        ((CopyOnWriteArraySet) ki6Var.F).add(v94Var);
    }

    public static boolean o(rx7 rx7Var) {
        boolean zO = false;
        for (cx7 cx7Var : rx7Var.c.J()) {
            if (cx7Var != null) {
                ex7 ex7Var = cx7Var.Y;
                if ((ex7Var == null ? null : ex7Var.Q) != null) {
                    zO |= o(cx7Var.i());
                }
                ay7 ay7Var = cx7Var.s0;
                a4a a4aVar = a4a.H;
                if (ay7Var != null && ((p4a) ay7Var.a()).d.compareTo(a4aVar) >= 0) {
                    cx7Var.s0.h();
                    zO = true;
                }
                if (cx7Var.r0.d.compareTo(a4aVar) >= 0) {
                    p4a p4aVar = cx7Var.r0;
                    p4aVar.e("setCurrentState");
                    p4aVar.g(a4a.G);
                    zO = true;
                }
            }
        }
        return zO;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx7.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.ba4, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.Z.o();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a0.f(y3a.ON_CREATE);
        rx7 rx7Var = ((ex7) this.Z.F).P;
        rx7Var.H = false;
        rx7Var.I = false;
        rx7Var.O.g = false;
        rx7Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        hx7 hx7Var = (hx7) ((ex7) this.Z.F).P.f.onCreateView(null, str, context, attributeSet);
        return hx7Var == null ? super.onCreateView(str, context, attributeSet) : hx7Var;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ex7) this.Z.F).P.l();
        this.a0.f(y3a.ON_DESTROY);
    }

    @Override // defpackage.ba4, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ex7) this.Z.F).P.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.c0 = false;
        ((ex7) this.Z.F).P.u(5);
        this.a0.f(y3a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.a0.f(y3a.ON_RESUME);
        rx7 rx7Var = ((ex7) this.Z.F).P;
        rx7Var.H = false;
        rx7Var.I = false;
        rx7Var.O.g = false;
        rx7Var.u(7);
    }

    @Override // defpackage.ba4, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.Z.o();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        tk5 tk5Var = this.Z;
        tk5Var.o();
        super.onResume();
        this.c0 = true;
        ((ex7) tk5Var.F).P.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        tk5 tk5Var = this.Z;
        tk5Var.o();
        ex7 ex7Var = (ex7) tk5Var.F;
        super.onStart();
        this.d0 = false;
        if (!this.b0) {
            this.b0 = true;
            rx7 rx7Var = ex7Var.P;
            rx7Var.H = false;
            rx7Var.I = false;
            rx7Var.O.g = false;
            rx7Var.u(4);
        }
        ex7Var.P.A(true);
        this.a0.f(y3a.ON_START);
        rx7 rx7Var2 = ex7Var.P;
        rx7Var2.H = false;
        rx7Var2.I = false;
        rx7Var2.O.g = false;
        rx7Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.Z.o();
    }

    @Override // android.app.Activity
    public final void onStop() {
        tk5 tk5Var;
        super.onStop();
        this.d0 = true;
        do {
            tk5Var = this.Z;
        } while (o(((ex7) tk5Var.F).P));
        rx7 rx7Var = ((ex7) tk5Var.F).P;
        rx7Var.I = true;
        rx7Var.O.g = true;
        rx7Var.u(4);
        this.a0.f(y3a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        hx7 hx7Var = (hx7) ((ex7) this.Z.F).P.f.onCreateView(view, str, context, attributeSet);
        return hx7Var == null ? super.onCreateView(view, str, context, attributeSet) : hx7Var;
    }
}
