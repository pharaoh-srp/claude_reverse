package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.Settings;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class tlg implements n7d, lvg {
    public gx E;
    public final AtomicBoolean F = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue G = new ConcurrentLinkedQueue();

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        baseEvent.getClass();
        if (this.F.get()) {
            return baseEvent;
        }
        yb5.z(e(), "SegmentStartupQueue queueing event");
        ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
        if (concurrentLinkedQueue.size() >= 1000) {
            concurrentLinkedQueue.remove();
        }
        concurrentLinkedQueue.offer(baseEvent);
        return null;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        this.E = gxVar;
        el5 el5Var = gxVar.F;
        gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new rrb(gxVar, this, null, 11), 2);
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        mwa.X(settings, i);
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.E;
    }
}
