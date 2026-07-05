package androidx.compose.runtime;

import defpackage.csg;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.qvb;
import defpackage.w44;
import defpackage.wub;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class ComposePausableCompositionException extends RuntimeException {
    public final qvb E;
    public final qvb F;
    public final wub G;
    public final int H;

    public ComposePausableCompositionException(qvb qvbVar, qvb qvbVar2, wub wubVar, int i, Exception exc) {
        super(exc);
        this.E = qvbVar;
        this.F = qvbVar2;
        this.G = wubVar;
        this.H = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listW;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.H);
        sb.append(":\n            |");
        zmf zmfVarV = yb5.v(new a(this, null));
        if (zmfVarV.hasNext()) {
            Object next = zmfVarV.next();
            if (zmfVarV.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (zmfVarV.hasNext()) {
                    arrayList.add(zmfVarV.next());
                }
                listW = arrayList;
            } else {
                listW = x44.W(next);
            }
        } else {
            listW = lm6.E;
        }
        sb.append(w44.S0(w44.k1(50, listW), "\n", null, null, null, 62));
        sb.append("\n            ");
        return csg.W(sb.toString());
    }
}
