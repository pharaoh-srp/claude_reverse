package defpackage;

import androidx.window.core.WindowStrictModeException;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v5g {
    public static final /* synthetic */ int b = 0;
    public final ati a = ati.E;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (x44.r(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return x44.r(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final odj c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new odj(lm6.E);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        u5g.d(sidecarDeviceState2, u5g.b(sidecarDeviceState));
        return new odj(d(u5g.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) throws WindowStrictModeException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pf8 pf8VarI = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (pf8VarI != null) {
                arrayList.add(pf8VarI);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r7 == 4) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pf8 i(androidx.window.sidecar.SidecarDisplayFeature r6, androidx.window.sidecar.SidecarDeviceState r7) throws androidx.window.core.WindowStrictModeException {
        /*
            r5 = this;
            zf r0 = defpackage.zf.P
            r6.getClass()
            lyk r1 = defpackage.lyk.G
            ati r5 = r5.a
            r5.getClass()
            me7 r2 = new me7
            r2.<init>(r6, r5, r1)
            q5g r5 = new q5g
            r5.<init>()
            java.lang.String r1 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            me7 r5 = r2.g(r1, r5)
            r5g r1 = new r5g
            r1.<init>()
            java.lang.String r2 = "Feature bounds must not be 0"
            me7 r5 = r5.g(r2, r1)
            s5g r1 = new s5g
            r1.<init>()
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            me7 r5 = r5.g(r2, r1)
            t5g r1 = new t5g
            r1.<init>()
            java.lang.String r2 = "Feature be pinned to either left or top"
            me7 r5 = r5.g(r2, r1)
            int r1 = r5.a
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r1) {
                case 0: goto L48;
                default: goto L45;
            }
        L45:
            java.lang.Object r5 = r5.b
            goto L62
        L48:
            ati r1 = r5.c
            int r1 = r1.ordinal()
            if (r1 == 0) goto L9b
            if (r1 == r3) goto L59
            if (r1 != r2) goto L55
            goto L61
        L55:
            defpackage.wg6.i()
            goto L61
        L59:
            java.lang.Object r5 = r5.b
            r5.getClass()
            r5.toString()
        L61:
            r5 = r4
        L62:
            androidx.window.sidecar.SidecarDisplayFeature r5 = (androidx.window.sidecar.SidecarDisplayFeature) r5
            if (r5 != 0) goto L67
            goto L9a
        L67:
            int r5 = r5.getType()
            if (r5 == r3) goto L73
            if (r5 == r2) goto L70
            goto L9a
        L70:
            wg r5 = defpackage.wg.S
            goto L75
        L73:
            wg r5 = defpackage.wg.R
        L75:
            int r7 = defpackage.u5g.b(r7)
            if (r7 == 0) goto L9a
            if (r7 == r3) goto L9a
            if (r7 == r2) goto L86
            r1 = 3
            if (r7 == r1) goto L88
            r1 = 4
            if (r7 == r1) goto L9a
            goto L88
        L86:
            zf r0 = defpackage.zf.Q
        L88:
            pf8 r7 = new pf8
            pv1 r1 = new pv1
            android.graphics.Rect r6 = r6.getRect()
            r6.getClass()
            r1.<init>(r6)
            r7.<init>(r1, r5, r0)
            return r7
        L9a:
            return r4
        L9b:
            java.lang.Object r5 = r5.d
            androidx.window.core.WindowStrictModeException r5 = (androidx.window.core.WindowStrictModeException) r5
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5g.i(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):pf8");
    }
}
