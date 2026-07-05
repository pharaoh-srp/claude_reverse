package defpackage;

import com.caverock.androidsvg.b;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r42 implements n42 {
    public List a;

    @Override // defpackage.n42
    public final boolean a(h1f h1fVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (b.g((v42) it.next(), h1fVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return gid.q(new StringBuilder("not("), this.a, ")");
    }
}
