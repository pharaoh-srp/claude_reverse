package defpackage;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qpk {
    public static final ta4 a = new ta4(1373096355, false, new tb4(15));

    public static void a(gdc gdcVar) {
        gdcVar.d.add(new kg4());
        Duration duration = Duration.ZERO;
        duration.getClass();
        long millis = duration.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        gdcVar.w = blj.b(millis, timeUnit);
        long millis2 = duration.toMillis();
        timeUnit.getClass();
        gdcVar.y = blj.b(millis2, timeUnit);
        long millis3 = duration.toMillis();
        timeUnit.getClass();
        gdcVar.z = blj.b(millis3, timeUnit);
    }

    public static int b(boolean z) {
        List supportedPerformancePoints;
        try {
            iw7 iw7Var = new iw7();
            iw7Var.n = gkb.k("video/avc");
            jw7 jw7Var = new jw7(iw7Var);
            String str = jw7Var.o;
            if (str != null) {
                List listE = s6b.e(str, z, false);
                String strC = s6b.c(jw7Var);
                Iterable iterableE = strC == null ? vde.I : s6b.e(strC, z, false);
                hz8 hz8VarO = nz8.o();
                hz8VarO.c(listE);
                hz8VarO.c(iterableE);
                vde vdeVarG = hz8VarO.g();
                for (int i = 0; i < vdeVarG.H; i++) {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((g6b) vdeVarG.get(i)).d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        dt4.g();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointB = dt4.b();
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (n6b.i(supportedPerformancePoints.get(i2)).covers(performancePointB)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static int c(String str) {
        for (int i : sq6.H(4)) {
            if (gid.i(i).equals(str)) {
                return i;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return 0;
    }

    public static final hjh d(hjh hjhVar, hjh hjhVar2, float f) {
        return new hjh(fgg.c(f, hjhVar.a, hjhVar2.a), fgg.c(f, hjhVar.b, hjhVar2.b));
    }

    public static final void e(dpf dpfVar, SparseArray sparseArray) {
        if (((n91) dpfVar.G).a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
            if (autofillValue.isText()) {
                n91 n91Var = (n91) dpfVar.G;
                autofillValue.getTextValue().toString();
                if (n91Var.a.get(Integer.valueOf(iKeyAt)) != null) {
                    mr9.o();
                    return;
                }
            } else {
                if (autofillValue.isDate()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValue.isList()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValue.isToggle()) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void f(dpf dpfVar, ViewStructure viewStructure) {
        n91 n91Var = (n91) dpfVar.G;
        if (n91Var.a.isEmpty()) {
            return;
        }
        int iAddChildCount = viewStructure.addChildCount(n91Var.a.size());
        Iterator it = n91Var.a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                mr9.o();
                return;
            }
            ViewStructure viewStructureNewChild = viewStructure.newChild(iAddChildCount);
            viewStructureNewChild.setAutofillId((AutofillId) dpfVar.I, iIntValue);
            viewStructureNewChild.setId(iIntValue, ((AndroidComposeView) dpfVar.F).getContext().getPackageName(), null, null);
            viewStructureNewChild.setAutofillType(1);
            throw null;
        }
    }

    public static final Bundle g(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static /* synthetic */ boolean h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, j1k j1kVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(j1kVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(j1kVar) != obj && atomicReferenceFieldUpdater.get(j1kVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
