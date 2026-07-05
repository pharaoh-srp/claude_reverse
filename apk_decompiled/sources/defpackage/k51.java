package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k51 implements Runnable {
    public final /* synthetic */ int E;
    public Object F;

    public k51(gmj gmjVar, at atVar) {
        this.E = 15;
        this.F = atVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kb kbVar;
        Object[] objArr = 0;
        switch (this.E) {
            case 0:
                l51 l51Var = (l51) this.F;
                try {
                    l51.a(l51Var);
                    ((Handler) l51Var.i).postDelayed(this, 16L);
                    return;
                } catch (Exception e) {
                    List list = xah.a;
                    xah.f(e, "Bell Viz: Process Data Runnable Failure", null, null, 28);
                    ((lsc) l51Var.h).setValue(Boolean.TRUE);
                    return;
                }
            case 1:
                raa raaVar = (raa) this.F;
                dh6 dh6Var = raaVar.G;
                e81 e81Var = raaVar.E;
                if (raaVar.S) {
                    if (raaVar.Q) {
                        raaVar.Q = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        e81Var.e = jCurrentAnimationTimeMillis;
                        e81Var.g = -1L;
                        e81Var.f = jCurrentAnimationTimeMillis;
                        e81Var.h = 0.5f;
                    }
                    if ((e81Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > e81Var.g + ((long) e81Var.i)) || !raaVar.e()) {
                        raaVar.S = false;
                        return;
                    }
                    if (raaVar.R) {
                        raaVar.R = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
                        dh6Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (e81Var.f == 0) {
                        pmf.o("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = e81Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - e81Var.f;
                    e81Var.f = jCurrentAnimationTimeMillis2;
                    raaVar.U.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * e81Var.d));
                    WeakHashMap weakHashMap = mvi.a;
                    dh6Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                qq1 qq1Var = ((hq1) this.F).z0;
                if (qq1Var.c == null) {
                    qq1Var.c = new nq1();
                }
                qq1Var.c.getClass();
                return;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((ive) this.F).F;
                int i = bottomSheetBehavior.m;
                if (i != 2 || i == 0) {
                    return;
                }
                bottomSheetBehavior.m = 0;
                return;
            case 4:
                a36 a36Var = (a36) this.F;
                a36Var.B0.onDismiss(a36Var.J0);
                return;
            case 5:
                dh6 dh6Var2 = (dh6) this.F;
                dh6Var2.P = null;
                dh6Var2.drawableStateChanged();
                return;
            case 6:
                gl7 gl7Var = (gl7) this.F;
                Context contextJ = gl7Var.j();
                if (contextJ == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    gl7Var.Q0.h(1);
                    gl7Var.Q0.g(contextJ.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 7:
                cx7 cx7Var = (cx7) this.F;
                if (cx7Var.m0 != null) {
                    cx7Var.e().getClass();
                    return;
                }
                return;
            case 8:
                af8.a((ua2) this.F);
                return;
            case 9:
                ekd ekdVar = (ekd) this.F;
                for (a4f a4fVar : ekdVar.Y) {
                    a4fVar.q(true);
                    ax5 ax5Var = a4fVar.h;
                    if (ax5Var != null) {
                        ax5Var.D(a4fVar.e);
                        a4fVar.h = null;
                        a4fVar.g = null;
                    }
                }
                xv8 xv8Var = ekdVar.Q;
                wd7 wd7Var = (wd7) xv8Var.G;
                if (wd7Var != null) {
                    wd7Var.a();
                    xv8Var.G = null;
                }
                xv8Var.H = null;
                return;
            case 10:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.F;
                if (searchView$SearchAutoComplete.J) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.J = false;
                    return;
                }
                return;
            case 11:
                ActionMenuView actionMenuView = ((Toolbar) this.F).E;
                if (actionMenuView == null || (kbVar = actionMenuView.a0) == null) {
                    return;
                }
                kbVar.l();
                return;
            case 12:
                ((kmj) this.F).h();
                return;
            case 13:
                ge0 ge0Var = ((kmj) ((xzd) this.F).F).j;
                ge0Var.c(ge0Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 14:
                ((xmj) this.F).p.a(new hh4(4, null, null));
                return;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                throw null;
            case 16:
                z5j z5jVar = (z5j) this.F;
                synchronized (z5jVar.a) {
                    try {
                        if (z5jVar.b()) {
                            Log.e("WakeLock", String.valueOf(z5jVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            z5jVar.d();
                            if (z5jVar.b()) {
                                z5jVar.c = 1;
                                z5jVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case g.MAX_FIELD_NUMBER /* 17 */:
                if (((j5h) this.F).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case g.AVG_FIELD_NUMBER /* 18 */:
                try {
                    ((zo1) ((mvd) this.F).G).B.g();
                    return;
                } catch (Throwable th) {
                    jyj.i("BillingClient", "Exception calling onBillingServiceDisconnected.", th);
                    return;
                }
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                uxj uxjVar = (uxj) this.F;
                zo1 zo1Var = uxjVar.I;
                zo1Var.s(0);
                hp1 hp1Var = y3k.i;
                zo1Var.r(24, uxjVar.H, hp1Var);
                uxjVar.c(hp1Var);
                return;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                synchronized (((njk) this.F).G) {
                    ((ydc) ((njk) this.F).H).a();
                    break;
                }
                return;
            case 21:
                ((o0l) ((lpj) this.F).d).B();
                return;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((vxk) this.F).N = null;
                return;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                d0l d0lVar = (d0l) this.F;
                cbf cbfVar = d0lVar.G;
                long j2 = d0lVar.E;
                long j3 = d0lVar.F;
                ((yzk) cbfVar.G).K0();
                yzk yzkVar = (yzk) cbfVar.G;
                e5e e5eVar = yzkVar.J;
                yzkVar.b0().Q.b("Application going to the background");
                yzkVar.I0().X.a(true);
                yzkVar.K0();
                yzkVar.H = true;
                umk umkVar = (umk) yzkVar.E;
                if (!umkVar.K.a1()) {
                    if (umkVar.K.X0(null, zvj.N0)) {
                        e5eVar.j(j3, false, false);
                        ((uuk) e5eVar.G).a();
                    } else {
                        ((uuk) e5eVar.G).a();
                        e5eVar.j(j3, false, false);
                    }
                }
                yzkVar.b0().P.c("Application backgrounded at: timestamp_millis", Long.valueOf(j2));
                vqj vqjVar = umkVar.K;
                yek yekVar = zvj.g1;
                if (vqjVar.X0(null, yekVar)) {
                    jsk jskVarL0 = yzkVar.L0();
                    jskVarL0.K0();
                    jskVarL0.O0();
                    umk umkVar2 = (umk) jskVarL0.E;
                    if (umkVar2.K.X0(null, yekVar)) {
                        hyk hykVarN = umkVar2.n();
                        hykVarN.K0();
                        hykVarN.O0();
                        if (hykVarN.a1() && hykVarN.J0().O1() < 242600) {
                            return;
                        }
                        hyk hykVarN2 = umkVar2.n();
                        hykVarN2.K0();
                        hykVarN2.O0();
                        hykVarN2.R0(new t08(hykVarN2, hykVarN2.d1(true), objArr == true ? 1 : 0, 16));
                        return;
                    }
                    return;
                }
                return;
            default:
                umk umkVar3 = (umk) this.F;
                h1l h1lVar = umkVar3.P;
                umk.c(h1lVar);
                h1lVar.K0();
                if (h1lVar.Q1() != 1) {
                    qgk qgkVar = umkVar3.M;
                    umk.d(qgkVar);
                    qgkVar.M.b("registerTrigger called but app not eligible");
                    return;
                } else {
                    jsk jskVar = umkVar3.T;
                    umk.b(jskVar);
                    qmk qmkVar = new qmk();
                    qmkVar.F = jskVar;
                    new Thread(qmkVar).start();
                    return;
                }
        }
    }

    public /* synthetic */ k51(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public /* synthetic */ k51(int i) {
        this.E = i;
    }

    public k51(lpj lpjVar, boolean z) {
        this.E = 21;
        this.F = lpjVar;
    }
}
