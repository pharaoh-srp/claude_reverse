package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class bnb extends ga4 {
    public zy7 I;
    public gnb J;
    public long K;
    public final View L;
    public final anb M;

    public bnb(zy7 zy7Var, gnb gnbVar, long j, View view, fu9 fu9Var, cz5 cz5Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.I = zy7Var;
        this.J = gnbVar;
        this.K = j;
        this.L = view;
        Window window = getWindow();
        if (window == null) {
            sz6.j("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        mbj.b(window, false);
        anb anbVar = new anb(getContext(), window);
        anbVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        anbVar.setClipChildren(false);
        anbVar.setElevation(cz5Var.q0(8.0f));
        anbVar.setOutlineProvider(new e36(1));
        this.M = anbVar;
        setContentView(anbVar);
        anbVar.setTag(R.id.view_tree_lifecycle_owner, ink.a(view));
        anbVar.setTag(R.id.view_tree_view_model_store_owner, syi.a(view));
        anbVar.setTag(R.id.view_tree_saved_state_registry_owner, ryi.a(view));
        h(this.I, this.J, this.K, fu9Var);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void h(zy7 zy7Var, gnb gnbVar, long j, fu9 fu9Var) {
        int i;
        this.I = zy7Var;
        this.J = gnbVar;
        this.K = j;
        sef sefVar = gnbVar.a;
        ViewGroup.LayoutParams layoutParams = this.L.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) ? false : true;
        int iOrdinal = sefVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    wg6.i();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
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
        this.M.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window4 = getWindow();
        window4.getClass();
        Window window5 = getWindow();
        window5.getClass();
        window5.getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        fdj edjVar = i2 >= 35 ? new edj(window4) : i2 >= 30 ? new ddj(window4) : new cdj(window4);
        long j2 = d54.g;
        edjVar.d(!d54.c(j, j2) && ((double) d4c.Z(j)) <= 0.5d);
        edjVar.c(!d54.c(j, j2) && ((double) d4c.Z(j)) <= 0.5d);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.I.a();
        }
        return zOnTouchEvent;
    }
}
