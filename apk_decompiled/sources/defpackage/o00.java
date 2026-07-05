package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class o00 implements ViewTranslationCallback {
    public static final o00 a = new o00();

    public final boolean onClearTranslation(View view) {
        zy7 zy7Var;
        view.getClass();
        a10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.J = x00.E;
        w69 w69VarC = contentCaptureManager.c();
        Object[] objArr = w69VarC.c;
        long[] jArr = w69VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ewb ewbVar = ((yjf) objArr[(i << 3) + i3]).a.d.E;
                        Object objG = ewbVar.g(akf.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = ewbVar.g(ojf.n);
                            e5 e5Var = (e5) (objG2 != null ? objG2 : null);
                            if (e5Var != null && (zy7Var = (zy7) e5Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        bz7 bz7Var;
        view.getClass();
        a10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.J = x00.E;
        w69 w69VarC = contentCaptureManager.c();
        Object[] objArr = w69VarC.c;
        long[] jArr = w69VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ewb ewbVar = ((yjf) objArr[(i << 3) + i3]).a.d.E;
                        Object objG = ewbVar.g(akf.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (x44.r(objG, Boolean.TRUE)) {
                            Object objG2 = ewbVar.g(ojf.m);
                            e5 e5Var = (e5) (objG2 != null ? objG2 : null);
                            if (e5Var != null && (bz7Var = (bz7) e5Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        bz7 bz7Var;
        view.getClass();
        a10 contentCaptureManager = ((AndroidComposeView) view).getContentCaptureManager();
        contentCaptureManager.getClass();
        contentCaptureManager.J = x00.F;
        w69 w69VarC = contentCaptureManager.c();
        Object[] objArr = w69VarC.c;
        long[] jArr = w69VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ewb ewbVar = ((yjf) objArr[(i << 3) + i3]).a.d.E;
                        Object objG = ewbVar.g(akf.E);
                        if (objG == null) {
                            objG = null;
                        }
                        if (x44.r(objG, Boolean.FALSE)) {
                            Object objG2 = ewbVar.g(ojf.m);
                            e5 e5Var = (e5) (objG2 != null ? objG2 : null);
                            if (e5Var != null && (bz7Var = (bz7) e5Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
