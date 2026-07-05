package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class f36 extends ga4 {
    public zy7 I;
    public c36 J;
    public final View K;
    public final b36 L;
    public boolean M;

    public f36(zy7 zy7Var, c36 c36Var, View view, fu9 fu9Var, cz5 cz5Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c36Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.I = zy7Var;
        this.J = c36Var;
        this.K = view;
        Window window = getWindow();
        if (window == null) {
            sz6.j("Dialog has no window");
            throw null;
        }
        c36 c36Var2 = this.J;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = c36Var2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        mbj.b(window, this.J.e);
        window.setGravity(17);
        if (!this.J.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                ie0.a.a(attributes2);
            }
            if (i >= 30) {
                me0 me0Var = me0.a;
                me0Var.b(attributes2, 0);
                me0Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        b36 b36Var = new b36(getContext(), window);
        setTitle(this.J.f);
        b36Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        b36Var.setClipChildren(false);
        b36Var.setElevation(cz5Var.q0(8.0f));
        b36Var.setOutlineProvider(new e36(0));
        this.L = b36Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(b36Var);
        b36Var.setTag(R.id.view_tree_lifecycle_owner, ink.a(view));
        b36Var.setTag(R.id.view_tree_view_model_store_owner, syi.a(view));
        b36Var.setTag(R.id.view_tree_saved_state_registry_owner, ryi.a(view));
        i(this.I, this.J, fu9Var);
        vdc vdcVarC = c();
        p10 p10Var = new p10(this, 1);
        vdcVarC.getClass();
        vdcVarC.a(this, new wdc(p10Var));
    }

    public static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof b36) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void i(zy7 zy7Var, c36 c36Var, fu9 fu9Var) {
        int i;
        this.I = zy7Var;
        this.J = c36Var;
        sef sefVar = c36Var.c;
        boolean zC = u40.c(this.K);
        int iOrdinal = sefVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    wg6.i();
                    return;
                }
                zC = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        int iOrdinal2 = fu9Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                wg6.i();
                return;
            }
            i = 1;
        }
        b36 b36Var = this.L;
        b36Var.setLayoutDirection(i);
        boolean z = c36Var.e;
        boolean z2 = c36Var.d;
        Window window2 = b36Var.N;
        boolean z3 = (b36Var.R && z2 == b36Var.P && z == b36Var.Q) ? false : true;
        b36Var.P = z2;
        b36Var.Q = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !b36Var.R) {
                window2.setLayout(i2, -2);
                b36Var.R = true;
            }
        }
        setCanceledOnTouchOutside(c36Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.J.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.I.a();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            c36 r1 = r9.J
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            b36 r1 = r9.L
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.mwa.L(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.mwa.L(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.M = r3
            return r0
        L77:
            boolean r10 = r9.M
            if (r10 == 0) goto L90
            zy7 r10 = r9.I
            r10.a()
            r9.M = r3
            return r4
        L83:
            r9.M = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.M = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f36.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
