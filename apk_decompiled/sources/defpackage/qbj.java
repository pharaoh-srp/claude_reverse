package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class qbj implements s9 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public xo5 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public pbj i;
    public pbj j;
    public qb5 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public hyi s;
    public boolean t;
    public final obj u;
    public final obj v;
    public final xzd w;

    public qbj(Activity activity, boolean z) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new obj(this, 0);
        this.v = new obj(this, 1);
        this.w = new xzd(22, this);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z) {
        gyi gyiVarI;
        gyi gyiVarI2;
        boolean z2 = this.q;
        if (z) {
            if (!z2) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (z2) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        xo5 xo5Var = this.e;
        if (!zIsLaidOut) {
            if (z) {
                ((r1i) xo5Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((r1i) xo5Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            r1i r1iVar = (r1i) xo5Var;
            gyiVarI = mvi.a(r1iVar.a);
            gyiVarI.a(MTTypesetterKt.kLineSkipLimitMultiplier);
            gyiVarI.c(100L);
            gyiVarI.d(new q1i(r1iVar, 4));
            gyiVarI2 = this.f.i(0, 200L);
        } else {
            r1i r1iVar2 = (r1i) xo5Var;
            gyi gyiVarA = mvi.a(r1iVar2.a);
            gyiVarA.a(1.0f);
            gyiVarA.c(200L);
            gyiVarA.d(new q1i(r1iVar2, 0));
            gyiVarI = this.f.i(8, 100L);
            gyiVarI2 = gyiVarA;
        }
        hyi hyiVar = new hyi();
        ArrayList arrayList = hyiVar.a;
        arrayList.add(gyiVarI);
        View view = (View) gyiVarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) gyiVarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(gyiVarI2);
        hyiVar.b();
    }

    public final void b(View view) {
        xo5 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.anthropic.claude.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.anthropic.claude.R.id.action_bar);
        if (callbackFindViewById instanceof xo5) {
            wrapper = (xo5) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.anthropic.claude.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.anthropic.claude.R.id.action_bar_container);
        this.d = actionBarContainer;
        xo5 xo5Var = this.e;
        if (xo5Var == null || this.f == null || actionBarContainer == null) {
            sz6.j(qbj.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((r1i) xo5Var).a.getContext();
        this.a = context;
        if ((((r1i) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(com.anthropic.claude.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((r1i) this.e).getClass();
        } else {
            ((r1i) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((r1i) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, t0e.a, com.anthropic.claude.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.K) {
                sz6.j("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.t = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = mvi.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        r1i r1iVar = (r1i) this.e;
        int i2 = r1iVar.b;
        this.h = true;
        r1iVar.a((i & 4) | (i2 & (-5)));
    }

    public final void d(boolean z) {
        boolean z2 = this.q || !this.p;
        boolean z3 = this.r;
        xzd xzdVar = this.w;
        View view = this.g;
        if (!z2) {
            if (z3) {
                this.r = false;
                hyi hyiVar = this.s;
                if (hyiVar != null) {
                    hyiVar.a();
                }
                int i = this.n;
                obj objVar = this.u;
                if (i != 0 || !z) {
                    objVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                hyi hyiVar2 = new hyi();
                float f = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                gyi gyiVarA = mvi.a(this.d);
                gyiVarA.e(f);
                View view2 = (View) gyiVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(xzdVar != null ? new lna(xzdVar, view2) : null);
                }
                boolean z4 = hyiVar2.e;
                ArrayList arrayList = hyiVar2.a;
                if (!z4) {
                    arrayList.add(gyiVarA);
                }
                if (this.o && view != null) {
                    gyi gyiVarA2 = mvi.a(view);
                    gyiVarA2.e(f);
                    if (!hyiVar2.e) {
                        arrayList.add(gyiVarA2);
                    }
                }
                boolean z5 = hyiVar2.e;
                if (!z5) {
                    hyiVar2.c = x;
                }
                if (!z5) {
                    hyiVar2.b = 250L;
                }
                if (!z5) {
                    hyiVar2.d = objVar;
                }
                this.s = hyiVar2;
                hyiVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r = true;
        hyi hyiVar3 = this.s;
        if (hyiVar3 != null) {
            hyiVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        obj objVar2 = this.v;
        if (i2 == 0 && z) {
            this.d.setTranslationY(MTTypesetterKt.kLineSkipLimitMultiplier);
            float f2 = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.d.setTranslationY(f2);
            hyi hyiVar4 = new hyi();
            gyi gyiVarA3 = mvi.a(this.d);
            gyiVarA3.e(MTTypesetterKt.kLineSkipLimitMultiplier);
            View view3 = (View) gyiVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(xzdVar != null ? new lna(xzdVar, view3) : null);
            }
            boolean z6 = hyiVar4.e;
            ArrayList arrayList2 = hyiVar4.a;
            if (!z6) {
                arrayList2.add(gyiVarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                gyi gyiVarA4 = mvi.a(view);
                gyiVarA4.e(MTTypesetterKt.kLineSkipLimitMultiplier);
                if (!hyiVar4.e) {
                    arrayList2.add(gyiVarA4);
                }
            }
            boolean z7 = hyiVar4.e;
            if (!z7) {
                hyiVar4.c = y;
            }
            if (!z7) {
                hyiVar4.b = 250L;
            }
            if (!z7) {
                hyiVar4.d = objVar2;
            }
            this.s = hyiVar4;
            hyiVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(MTTypesetterKt.kLineSkipLimitMultiplier);
            if (this.o && view != null) {
                view.setTranslationY(MTTypesetterKt.kLineSkipLimitMultiplier);
            }
            objVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = mvi.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public qbj(bt btVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new obj(this, 0);
        this.v = new obj(this, 1);
        this.w = new xzd(22, this);
        b(btVar.getWindow().getDecorView());
    }
}
