package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.dx7;
import defpackage.hm4;
import defpackage.id7;
import defpackage.mdj;
import defpackage.odj;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lhm4;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class MulticastConsumer implements hm4 {
    public final Context a;
    public odj c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.a = context;
    }

    public final void a(dx7 dx7Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            odj odjVar = this.c;
            if (odjVar != null) {
                dx7Var.accept(odjVar);
            }
            this.d.add(dx7Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.hm4
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            odj odjVarC = id7.c(this.a, value);
            this.c = odjVarC;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((hm4) it.next()).accept(odjVarC);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b() {
        return this.d.isEmpty();
    }

    public final void c(hm4 hm4Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(hm4Var);
        } finally {
            reentrantLock.unlock();
        }
    }
}
