package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q2g implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ s2g F;

    public /* synthetic */ q2g(s2g s2gVar, int i) {
        this.E = i;
        this.F = s2gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        s2g s2gVar = this.F;
        switch (i) {
            case 0:
                kdg kdgVar = s2gVar.l;
                long jCurrentTimeMillis = System.currentTimeMillis();
                List listI1 = w44.i1(kdgVar, new x8e(10));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listI1) {
                    n6e n6eVarB = bm4.b(n6e.F, ((ChatSnapshotSummaryWithChatId) obj).getCreated_at().getTime(), jCurrentTimeMillis);
                    Object arrayList = linkedHashMap.get(n6eVarB);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(n6eVarB, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList2.add(new ucg((n6e) entry.getKey(), (List) entry.getValue()));
                }
                return w44.i1(arrayList2, new x8e(9));
            default:
                gb9.D(s2gVar.a, s2gVar.h.b(), null, new bff(s2gVar, null, 4), 2);
                return iei.a;
        }
    }
}
