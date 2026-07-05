package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ah0 extends ng0 implements tcb, LayoutInflater.Factory2 {
    public static final w6g E0 = new w6g(0);
    public static final int[] F0 = {R.attr.windowBackground};
    public static final boolean G0 = !"robolectric".equals(Build.FINGERPRINT);
    public Rect A0;
    public ri0 B0;
    public OnBackInvokedDispatcher C0;
    public OnBackInvokedCallback D0;
    public final bt H;
    public final Context I;
    public Window J;
    public vg0 K;
    public qbj L;
    public CharSequence M;
    public ActionBarOverlayLayout N;
    public pg0 O;
    public qg0 P;
    public ob Q;
    public ActionBarContextView R;
    public PopupWindow S;
    public og0 T;
    public gyi U;
    public final boolean V;
    public boolean W;
    public ViewGroup X;
    public TextView Y;
    public View Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public zg0[] i0;
    public zg0 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public Configuration o0;
    public final int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public wg0 t0;
    public wg0 u0;
    public boolean v0;
    public int w0;
    public final og0 x0;
    public boolean y0;
    public Rect z0;

    public ah0(bt btVar, bt btVar2) {
        Context context = btVar.getContext();
        Window window = btVar.getWindow();
        this.U = null;
        this.V = true;
        this.p0 = -100;
        this.x0 = new og0(this, 0);
        this.I = context;
        this.H = btVar;
        while (context != null && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (this.p0 == -100) {
            String name = this.H.getClass().getName();
            w6g w6gVar = E0;
            Integer num = (Integer) w6gVar.get(name);
            if (num != null) {
                this.p0 = num.intValue();
                w6gVar.remove(this.H.getClass().getName());
            }
        }
        if (window != null) {
            f(window);
        }
        ch0.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // defpackage.tcb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.vcb r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.B(vcb):void");
    }

    @Override // defpackage.tcb
    public final boolean a(vcb vcbVar, MenuItem menuItem) {
        zg0 zg0Var;
        Window.Callback callback = this.J.getCallback();
        if (callback != null && !this.n0) {
            vcb vcbVarK = vcbVar.k();
            zg0[] zg0VarArr = this.i0;
            int length = zg0VarArr != null ? zg0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zg0Var = zg0VarArr[i];
                    if (zg0Var != null && zg0Var.h == vcbVarK) {
                        break;
                    }
                    i++;
                } else {
                    zg0Var = null;
                    break;
                }
            }
            if (zg0Var != null) {
                return callback.onMenuItemSelected(zg0Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.ng0
    public final void b() {
        this.l0 = true;
        e(false);
        m();
        this.o0 = new Configuration(this.I.getResources().getConfiguration());
        this.m0 = true;
    }

    @Override // defpackage.ng0
    public final boolean d(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.g0 && i == 108) {
            return false;
        }
        if (this.c0 && i == 1) {
            this.c0 = false;
        }
        if (i == 1) {
            w();
            this.g0 = true;
            return true;
        }
        if (i == 2) {
            w();
            this.a0 = true;
            return true;
        }
        if (i == 5) {
            w();
            this.b0 = true;
            return true;
        }
        if (i == 10) {
            w();
            this.e0 = true;
            return true;
        }
        if (i == 108) {
            w();
            this.c0 = true;
            return true;
        }
        if (i != 109) {
            return this.J.requestFeature(i);
        }
        w();
        this.d0 = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(boolean r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.e(boolean):boolean");
    }

    public final void f(Window window) {
        Drawable drawableD;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.J != null) {
            sz6.j("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof vg0) {
            sz6.j("AppCompat has already installed itself into the Window");
            return;
        }
        vg0 vg0Var = new vg0(this, callback);
        this.K = vg0Var;
        window.setCallback(vg0Var);
        Context context = this.I;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, F0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableD = null;
        } else {
            ch0 ch0VarA = ch0.a();
            synchronized (ch0VarA) {
                drawableD = ch0VarA.a.d(resourceId, context, true);
            }
        }
        if (drawableD != null) {
            window.setBackgroundDrawable(drawableD);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.J = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.C0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.D0) != null) {
            ug0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.D0 = null;
        }
        this.C0 = null;
        x();
    }

    public final void g(int i, zg0 zg0Var, vcb vcbVar) {
        if (vcbVar == null) {
            if (zg0Var == null && i >= 0) {
                zg0[] zg0VarArr = this.i0;
                if (i < zg0VarArr.length) {
                    zg0Var = zg0VarArr[i];
                }
            }
            if (zg0Var != null) {
                vcbVar = zg0Var.h;
            }
        }
        if ((zg0Var == null || zg0Var.m) && !this.n0) {
            vg0 vg0Var = this.K;
            Window.Callback callback = this.J.getCallback();
            vg0Var.getClass();
            try {
                vg0Var.H = true;
                callback.onPanelClosed(i, vcbVar);
            } finally {
                vg0Var.H = false;
            }
        }
    }

    public final void h(vcb vcbVar) {
        kb kbVar;
        if (this.h0) {
            return;
        }
        this.h0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.N;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((r1i) actionBarOverlayLayout.I).a.E;
        if (actionMenuView != null && (kbVar = actionMenuView.a0) != null) {
            kbVar.g();
            hb hbVar = kbVar.X;
            if (hbVar != null && hbVar.b()) {
                hbVar.i.dismiss();
            }
        }
        Window.Callback callback = this.J.getCallback();
        if (callback != null && !this.n0) {
            callback.onPanelClosed(108, vcbVar);
        }
        this.h0 = false;
    }

    public final void i(zg0 zg0Var, boolean z) {
        yg0 yg0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        kb kbVar;
        if (z && zg0Var.a == 0 && (actionBarOverlayLayout = this.N) != null) {
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((r1i) actionBarOverlayLayout.I).a.E;
            if (actionMenuView != null && (kbVar = actionMenuView.a0) != null && kbVar.j()) {
                h(zg0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.I.getSystemService("window");
        if (windowManager != null && zg0Var.m && (yg0Var = zg0Var.e) != null) {
            windowManager.removeView(yg0Var);
            if (z) {
                g(zg0Var.a, zg0Var, null);
            }
        }
        zg0Var.k = false;
        zg0Var.l = false;
        zg0Var.m = false;
        zg0Var.f = null;
        zg0Var.n = true;
        if (this.j0 == zg0Var) {
            this.j0 = null;
        }
        if (zg0Var.a == 0) {
            x();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i) {
        zg0 zg0VarP = p(i);
        if (zg0VarP.h != null) {
            Bundle bundle = new Bundle();
            zg0VarP.h.t(bundle);
            if (bundle.size() > 0) {
                zg0VarP.p = bundle;
            }
            zg0VarP.h.w();
            zg0VarP.h.clear();
        }
        zg0VarP.o = true;
        zg0VarP.n = true;
        if ((i == 108 || i == 0) && this.N != null) {
            zg0 zg0VarP2 = p(0);
            zg0VarP2.k = false;
            v(zg0VarP2, null);
        }
    }

    public final void l() {
        ViewGroup viewGroup;
        if (this.W) {
            return;
        }
        Context context = this.I;
        int[] iArr = t0e.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            sz6.j("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            d(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            d(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            d(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            d(10);
        }
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m();
        this.J.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.g0) {
            viewGroup = this.e0 ? (ViewGroup) layoutInflaterFrom.inflate(com.anthropic.claude.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.anthropic.claude.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.anthropic.claude.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.d0 = false;
            this.c0 = false;
        } else if (this.c0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.anthropic.claude.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new np4(context, typedValue.resourceId) : context).inflate(com.anthropic.claude.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.anthropic.claude.R.id.decor_content_parent);
            this.N = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.J.getCallback());
            if (this.d0) {
                this.N.j(109);
            }
            if (this.a0) {
                this.N.j(2);
            }
            if (this.b0) {
                this.N.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.c0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.d0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.f0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.e0);
            sb.append(", windowNoTitle: ");
            sz6.p(sq6.v(" }", sb, this.g0));
            return;
        }
        pg0 pg0Var = new pg0(this);
        WeakHashMap weakHashMap = mvi.a;
        fvi.c(viewGroup, pg0Var);
        if (this.N == null) {
            this.Y = (TextView) viewGroup.findViewById(com.anthropic.claude.R.id.title);
        }
        boolean z = wyi.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.anthropic.claude.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.J.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.J.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new qg0(this));
        this.X = viewGroup;
        CharSequence charSequence = this.M;
        if (!TextUtils.isEmpty(charSequence)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.N;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(charSequence);
            } else {
                qbj qbjVar = this.L;
                if (qbjVar != null) {
                    r1i r1iVar = (r1i) qbjVar.e;
                    if (!r1iVar.g) {
                        Toolbar toolbar = r1iVar.a;
                        r1iVar.h = charSequence;
                        if ((r1iVar.b & 8) != 0) {
                            toolbar.setTitle(charSequence);
                            if (r1iVar.g) {
                                mvi.i(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
                } else {
                    TextView textView = this.Y;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.X.findViewById(R.id.content);
        View decorView = this.J.getDecorView();
        contentFrameLayout2.K.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(ModuleDescriptor.MODULE_VERSION)) {
            typedArrayObtainStyledAttributes2.getValue(ModuleDescriptor.MODULE_VERSION, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.W = true;
        zg0 zg0VarP = p(0);
        if (this.n0 || zg0VarP.h != null) {
            return;
        }
        r(108);
    }

    public final void m() {
        if (this.J != null) {
            return;
        }
        sz6.j("We have not been given a Window");
    }

    public final Context n() {
        Context context;
        qbj qbjVarQ = q();
        if (qbjVarQ != null) {
            if (qbjVarQ.b == null) {
                TypedValue typedValue = new TypedValue();
                qbjVarQ.a.getTheme().resolveAttribute(com.anthropic.claude.R.attr.actionBarWidgetTheme, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    qbjVarQ.b = new ContextThemeWrapper(qbjVarQ.a, i);
                } else {
                    qbjVarQ.b = qbjVarQ.a;
                }
            }
            context = qbjVarQ.b;
        } else {
            context = null;
        }
        return context == null ? this.I : context;
    }

    public final k5 o(Context context) {
        if (this.t0 == null) {
            if (lrb.I == null) {
                Context applicationContext = context.getApplicationContext();
                lrb.I = new lrb(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.t0 = new wg0(this, lrb.I);
        }
        return this.t0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ri0 ri0Var;
        Context np4Var;
        View lh0Var;
        View view2 = null;
        if (this.B0 == null) {
            int[] iArr = t0e.j;
            Context context2 = this.I;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.B0 = new ri0();
            } else {
                try {
                    this.B0 = (ri0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.B0 = new ri0();
                }
            }
        }
        ri0Var = this.B0;
        int i = yri.a;
        ri0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, t0e.x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        np4Var = (resourceId == 0 || ((context instanceof np4) && ((np4) context).a == resourceId)) ? context : new np4(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                lh0Var = new lh0(np4Var, attributeSet);
                break;
            case "CheckedTextView":
                lh0Var = new lg0(np4Var, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                lh0Var = new ih0(np4Var, attributeSet);
                break;
            case "TextView":
                lh0Var = ri0Var.e(np4Var, attributeSet);
                break;
            case "ImageButton":
                lh0Var = new gh0(np4Var, attributeSet, com.anthropic.claude.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                lh0Var = new nh0(np4Var, attributeSet);
                break;
            case "Spinner":
                lh0Var = new zh0(np4Var, attributeSet);
                break;
            case "RadioButton":
                lh0Var = ri0Var.d(np4Var, attributeSet);
                break;
            case "ToggleButton":
                lh0Var = new pi0(np4Var, attributeSet);
                break;
            case "ImageView":
                lh0Var = new hh0(np4Var, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                lh0Var = ri0Var.a(np4Var, attributeSet);
                break;
            case "CheckBox":
                lh0Var = ri0Var.c(np4Var, attributeSet);
                break;
            case "EditText":
                lh0Var = new eh0(np4Var, attributeSet);
                break;
            case "Button":
                lh0Var = ri0Var.b(np4Var, attributeSet);
                break;
            default:
                lh0Var = null;
                break;
        }
        if (lh0Var == null && context != np4Var) {
            Object[] objArr = ri0Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = np4Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = ri0.g;
                        if (i2 < 3) {
                            View viewF = ri0Var.f(np4Var, str, strArr[i2]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    View viewF2 = ri0Var.f(np4Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            lh0Var = view2;
        }
        if (lh0Var != null) {
            Context context3 = lh0Var.getContext();
            if ((context3 instanceof ContextWrapper) && lh0Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, ri0.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    lh0Var.setOnClickListener(new qi0(lh0Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = np4Var.obtainStyledAttributes(attributeSet, ri0.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = mvi.a;
                    new bvi(3).e(lh0Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = np4Var.obtainStyledAttributes(attributeSet, ri0.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    mvi.i(lh0Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = np4Var.obtainStyledAttributes(attributeSet, ri0.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = mvi.a;
                    new bvi(0).e(lh0Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return lh0Var;
    }

    public final zg0 p(int i) {
        zg0[] zg0VarArr = this.i0;
        if (zg0VarArr == null || zg0VarArr.length <= i) {
            zg0[] zg0VarArr2 = new zg0[i + 1];
            if (zg0VarArr != null) {
                System.arraycopy(zg0VarArr, 0, zg0VarArr2, 0, zg0VarArr.length);
            }
            this.i0 = zg0VarArr2;
            zg0VarArr = zg0VarArr2;
        }
        zg0 zg0Var = zg0VarArr[i];
        if (zg0Var != null) {
            return zg0Var;
        }
        zg0 zg0Var2 = new zg0();
        zg0Var2.a = i;
        zg0Var2.n = false;
        zg0VarArr[i] = zg0Var2;
        return zg0Var2;
    }

    public final qbj q() {
        l();
        if (this.c0 && this.L == null) {
            bt btVar = this.H;
            if (btVar != null) {
                this.L = new qbj(btVar);
            }
            qbj qbjVar = this.L;
            if (qbjVar != null) {
                qbjVar.c(this.y0);
            }
        }
        return this.L;
    }

    public final void r(int i) {
        this.w0 = (1 << i) | this.w0;
        if (this.v0) {
            return;
        }
        View decorView = this.J.getDecorView();
        WeakHashMap weakHashMap = mvi.a;
        decorView.postOnAnimation(this.x0);
        this.v0 = true;
    }

    public final boolean s() {
        xo5 xo5Var;
        j1i j1iVar;
        boolean z = this.k0;
        this.k0 = false;
        zg0 zg0VarP = p(0);
        if (!zg0VarP.m) {
            ob obVar = this.Q;
            if (obVar != null) {
                obVar.b();
                return true;
            }
            qbj qbjVarQ = q();
            if (qbjVarQ == null || (xo5Var = qbjVarQ.e) == null || (j1iVar = ((r1i) xo5Var).a.s0) == null || j1iVar.F == null) {
                return false;
            }
            j1i j1iVar2 = ((r1i) xo5Var).a.s0;
            adb adbVar = j1iVar2 == null ? null : j1iVar2.F;
            if (adbVar != null) {
                adbVar.collapseActionView();
            }
        } else if (!z) {
            i(zg0VarP, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r15.J.getCount() > 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.zg0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.t(zg0, android.view.KeyEvent):void");
    }

    public final boolean u(zg0 zg0Var, int i, KeyEvent keyEvent) {
        vcb vcbVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zg0Var.k || v(zg0Var, keyEvent)) && (vcbVar = zg0Var.h) != null) {
            return vcbVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(defpackage.zg0 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah0.v(zg0, android.view.KeyEvent):boolean");
    }

    public final void w() {
        if (this.W) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void x() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.C0 != null && (p(0).m || this.Q != null)) {
                z = true;
            }
            if (z && this.D0 == null) {
                this.D0 = ug0.b(this.C0, this);
            } else {
                if (z || (onBackInvokedCallback = this.D0) == null) {
                    return;
                }
                ug0.c(this.C0, onBackInvokedCallback);
                this.D0 = null;
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
