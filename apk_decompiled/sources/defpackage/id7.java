package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class id7 {
    public static pf8 a(rdj rdjVar, FoldingFeature foldingFeature) {
        wg wgVar;
        zf zfVar;
        rdjVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            wgVar = wg.R;
        } else {
            if (type != 2) {
                return null;
            }
            wgVar = wg.S;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            zfVar = zf.P;
        } else {
            if (state != 2) {
                return null;
            }
            zfVar = zf.Q;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        pv1 pv1Var = new pv1(bounds);
        Rect rectC = rdjVar.a.c();
        if (pv1Var.a() == 0 && pv1Var.b() == 0) {
            return null;
        }
        if (pv1Var.b() != rectC.width() && pv1Var.a() != rectC.height()) {
            return null;
        }
        if (pv1Var.b() < rectC.width() && pv1Var.a() < rectC.height()) {
            return null;
        }
        if (pv1Var.b() == rectC.width() && pv1Var.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new pf8(new pv1(bounds2), wgVar, zfVar);
    }

    public static odj b(rdj rdjVar, WindowLayoutInfo windowLayoutInfo) {
        rdjVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            pf8 pf8VarA = foldingFeature instanceof FoldingFeature ? a(rdjVar, foldingFeature) : null;
            if (pf8VarA != null) {
                arrayList.add(pf8VarA);
            }
        }
        return new odj(arrayList);
    }

    public static odj c(Context context, WindowLayoutInfo windowLayoutInfo) {
        vdj vdjVar = pyk.W;
        wv1 wv1Var = wv1.F;
        ez5 ez5Var = ez5.F;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        dz5 dz5Var = i >= 34 ? ez5.E : tqh.K;
        x44.s(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(FreeTypeConstants.FT_LOAD_PEDANTIC));
        if (i >= 30) {
            if (i >= 34) {
                vdjVar = ez5Var;
            } else if (i >= 30) {
                vdjVar = wv1Var;
            }
            return b(vdjVar.I(context, dz5Var), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            pmf.n("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            vdjVar = ez5Var;
        } else if (i >= 30) {
            vdjVar = wv1Var;
        }
        return b(vdjVar.c(activity, dz5Var), windowLayoutInfo);
    }
}
