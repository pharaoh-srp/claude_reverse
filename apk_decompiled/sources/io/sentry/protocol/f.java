package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.w6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements m2 {
    public t E;
    public List F;
    public HashMap G;

    public static f a(f fVar, w6 w6Var) {
        ArrayList arrayList = new ArrayList();
        if (w6Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(w6Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : w6Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (fVar == null) {
            fVar = new f();
        }
        List list = fVar.F;
        if (list == null) {
            fVar.F = new ArrayList(arrayList);
            return fVar;
        }
        list.addAll(arrayList);
        return fVar;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("sdk_info");
            yVar.x(a1Var, this.E);
        }
        if (this.F != null) {
            yVar.r("images");
            yVar.x(a1Var, this.F);
        }
        HashMap map = this.G;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.G, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
