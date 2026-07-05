package defpackage;

import com.anthropic.claude.api.chat.citation.Citation;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u1g implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ w1g F;

    public /* synthetic */ u1g(w1g w1gVar, int i) {
        this.E = i;
        this.F = w1gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        w1g w1gVar = this.F;
        switch (i) {
            case 0:
                kdg kdgVar = w1gVar.j;
                kdgVar.getClass();
                lqa lqaVar = new lqa();
                ListIterator listIterator = kdgVar.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        return lqaVar.c();
                    }
                    whd whdVar = (whd) c8aVar.next();
                    if (whdVar instanceof uhd) {
                        for (mtc mtcVar : ((uhd) whdVar).e) {
                            for (Citation citation : mtcVar instanceof itc ? ((itc) mtcVar).c : mtcVar instanceof zsc ? ((zsc) mtcVar).d : lm6.E) {
                                String uuid = citation.getUuid();
                                if (uuid != null) {
                                    lqaVar.put(uuid, citation);
                                }
                            }
                        }
                    }
                }
                break;
            default:
                w1gVar.P();
                return iei.a;
        }
    }
}
