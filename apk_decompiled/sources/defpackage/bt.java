package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class bt extends ga4 implements DialogInterface {
    public ah0 I;
    public final bh0 J;
    public final zs K;

    /* JADX WARN: Type inference failed for: r2v2, types: [bh0] */
    public bt(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iJ = j(contextThemeWrapper, i);
        if (iJ == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iJ;
        }
        super(contextThemeWrapper, i2);
        this.J = new to9() { // from class: bh0
            @Override // defpackage.to9
            public final boolean h(KeyEvent keyEvent) {
                return this.E.l(keyEvent);
            }
        };
        ng0 ng0VarH = h();
        if (iJ == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iJ = typedValue2.resourceId;
        }
        ((ah0) ng0VarH).q0 = iJ;
        ng0VarH.b();
        this.K = new zs(getContext(), this, getWindow());
    }

    public static int j(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ah0 ah0Var = (ah0) h();
        ah0Var.l();
        ((ViewGroup) ah0Var.X.findViewById(android.R.id.content)).addView(view, layoutParams);
        ah0Var.K.a(ah0Var.J.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ah0 ah0Var = (ah0) h();
        bt btVar = ah0Var.H;
        if (ah0Var.v0) {
            ah0Var.J.getDecorView().removeCallbacks(ah0Var.x0);
        }
        ah0Var.n0 = true;
        if (ah0Var.p0 != -100) {
            bt btVar2 = ah0Var.H;
        }
        ah0.E0.remove(ah0Var.H.getClass().getName());
        wg0 wg0Var = ah0Var.t0;
        if (wg0Var != null) {
            wg0Var.c();
        }
        wg0 wg0Var2 = ah0Var.u0;
        if (wg0Var2 != null) {
            wg0Var2.c();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return idi.h(this.J, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        ah0 ah0Var = (ah0) h();
        ah0Var.l();
        return ah0Var.J.findViewById(i);
    }

    public final ng0 h() {
        if (this.I == null) {
            int i = ng0.E;
            this.I = new ah0(this, this);
        }
        return this.I;
    }

    public final void i(Bundle bundle) {
        ah0 ah0Var = (ah0) h();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(ah0Var.I);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(ah0Var);
        } else if (!(layoutInflaterFrom.getFactory2() instanceof ah0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
        super.onCreate(bundle);
        h().b();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        ah0 ah0Var = (ah0) h();
        if (ah0Var.L != null) {
            ah0Var.q().getClass();
            ah0Var.r(0);
        }
    }

    public final void k(CharSequence charSequence) {
        super.setTitle(charSequence);
        ah0 ah0Var = (ah0) h();
        ah0Var.M = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = ah0Var.N;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        qbj qbjVar = ah0Var.L;
        if (qbjVar == null) {
            TextView textView = ah0Var.Y;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        r1i r1iVar = (r1i) qbjVar.e;
        if (r1iVar.g) {
            return;
        }
        Toolbar toolbar = r1iVar.a;
        r1iVar.h = charSequence;
        if ((r1iVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r1iVar.g) {
                mvi.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        i(bundle);
        zs zsVar = this.K;
        zsVar.b.setContentView(zsVar.u);
        Context context = zsVar.a;
        Window window = zsVar.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = zsVar.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !zs.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            charSequence = null;
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (zsVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (zsVar.e != null) {
                ((LinearLayout.LayoutParams) ((h6a) viewGroup.getLayoutParams())).weight = MTTypesetterKt.kLineSkipLimitMultiplier;
            }
        } else {
            charSequence = null;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = zs.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = zs.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = zs.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        zsVar.m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        zsVar.m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        zsVar.q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            zsVar.m.removeView(zsVar.q);
            if (zsVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) zsVar.m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(zsVar.m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(zsVar.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        zsVar.h = button;
        p9 p9Var = zsVar.A;
        button.setOnClickListener(p9Var);
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        Button button2 = zsVar.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(charSequence);
            zsVar.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        zsVar.i = button3;
        button3.setOnClickListener(p9Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(zsVar.j);
        Button button4 = zsVar.i;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(zsVar.j);
            zsVar.i.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        zsVar.l = button5;
        button5.setOnClickListener(p9Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = zsVar.l;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            zsVar.l.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = zsVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = zsVar.i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = zsVar.l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (zsVar.r != null) {
            viewGroupB.addView(zsVar.r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            zsVar.o = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(zsVar.d) || !zsVar.y) {
                window.findViewById(R.id.title_template).setVisibility(8);
                zsVar.o.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                zsVar.p = textView2;
                textView2.setText(zsVar.d);
                Drawable drawable = zsVar.n;
                if (drawable != null) {
                    zsVar.o.setImageDrawable(drawable);
                } else {
                    zsVar.p.setPadding(zsVar.o.getPaddingLeft(), zsVar.o.getPaddingTop(), zsVar.o.getPaddingRight(), zsVar.o.getPaddingBottom());
                    zsVar.o.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = zsVar.m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = zsVar.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = zsVar.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.E, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.F);
        }
        if (!z2) {
            View view2 = zsVar.e;
            if (view2 == null) {
                view2 = zsVar.m;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = mvi.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = zsVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = zsVar.s) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = zsVar.t;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.K.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.K.m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void onStop() {
        hyi hyiVar;
        super.onStop();
        qbj qbjVarQ = ((ah0) h()).q();
        if (qbjVarQ == null || (hyiVar = qbjVarQ.s) == null) {
            return;
        }
        hyiVar.a();
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void setContentView(int i) {
        f();
        ah0 ah0Var = (ah0) h();
        ah0Var.l();
        ViewGroup viewGroup = (ViewGroup) ah0Var.X.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(ah0Var.I).inflate(i, viewGroup);
        ah0Var.K.a(ah0Var.J.getCallback());
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        ng0 ng0VarH = h();
        String string = getContext().getString(i);
        ah0 ah0Var = (ah0) ng0VarH;
        ah0Var.M = string;
        ActionBarOverlayLayout actionBarOverlayLayout = ah0Var.N;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(string);
            return;
        }
        qbj qbjVar = ah0Var.L;
        if (qbjVar == null) {
            TextView textView = ah0Var.Y;
            if (textView != null) {
                textView.setText(string);
                return;
            }
            return;
        }
        r1i r1iVar = (r1i) qbjVar.e;
        if (r1iVar.g) {
            return;
        }
        Toolbar toolbar = r1iVar.a;
        r1iVar.h = string;
        if ((r1iVar.b & 8) != 0) {
            toolbar.setTitle(string);
            if (r1iVar.g) {
                mvi.i(toolbar.getRootView(), string);
            }
        }
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void setContentView(View view) {
        f();
        ah0 ah0Var = (ah0) h();
        ah0Var.l();
        ViewGroup viewGroup = (ViewGroup) ah0Var.X.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        ah0Var.K.a(ah0Var.J.getCallback());
    }

    @Override // defpackage.ga4, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ah0 ah0Var = (ah0) h();
        ah0Var.l();
        ViewGroup viewGroup = (ViewGroup) ah0Var.X.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        ah0Var.K.a(ah0Var.J.getCallback());
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        k(charSequence);
        zs zsVar = this.K;
        zsVar.d = charSequence;
        TextView textView = zsVar.p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
