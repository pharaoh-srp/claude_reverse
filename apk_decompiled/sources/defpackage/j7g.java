package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j7g extends fhi implements l7g, q9i {
    @Override // defpackage.fhi
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract j7g l0(boolean z);

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public abstract j7g n0(r9i r9iVar);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", g06.e.y((jc0) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(O());
        if (!H().isEmpty()) {
            w44.R0(H(), sb, ", ", "<", ">", null, 112);
        }
        if (b0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
