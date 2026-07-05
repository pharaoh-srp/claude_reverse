package defpackage;

import com.squareup.wire.internal.MathMethodsKt;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ov5 {
    public final h99 a;
    public final ConcurrentHashMap b;

    public ov5(h99 h99Var, int i) {
        switch (i) {
            case 1:
                h99Var.getClass();
                this.a = h99Var;
                this.b = new ConcurrentHashMap();
                break;
            default:
                h99Var.getClass();
                this.a = h99Var;
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public void a(long j, String str) {
        str.getClass();
        nv5 nv5Var = (nv5) this.b.remove(str);
        h99 h99Var = this.a;
        if (nv5Var == null) {
            dch.H(h99Var, 4, g99.G, new rb1(str, 12), null, false, 56);
            return;
        }
        int i = nv5Var.a.get();
        int i2 = nv5Var.b.get();
        int i3 = nv5Var.c.get();
        lqa lqaVar = new lqa();
        lqaVar.put("metric_type", "rum ui slowness");
        lqa lqaVar2 = new lqa();
        lqaVar2.put("view_duration", Long.valueOf(j));
        lqa lqaVar3 = new lqa();
        lqaVar3.put("count", Integer.valueOf(i));
        lqaVar3.put("ignored_count", Integer.valueOf(i2));
        lqaVar3.put("missed_count", Integer.valueOf(i3));
        lqa lqaVar4 = new lqa();
        lqaVar4.put("max_count", 1000);
        lqaVar4.put("slow_frame_threshold", Float.valueOf(2.0f));
        lqaVar4.put("max_duration", 700000000L);
        lqaVar4.put("view_min_duration", Long.valueOf(MathMethodsKt.NANOS_PER_SECOND));
        lqaVar3.put("config", lqaVar4.c());
        lqaVar2.put("slow_frames", lqaVar3.c());
        lqaVar.put("rum_ui_slowness", lqaVar2.c());
        ((rl) h99Var).N(yf5.h0, lqaVar.c(), 0.75f, null);
    }
}
