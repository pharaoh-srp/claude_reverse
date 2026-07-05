package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o8j {
    public static final Map a;
    public static final Set b;

    static {
        List<String> listX = x44.X("mcp__webagent__", "mcp__slackbot__");
        ArrayList arrayList = new ArrayList();
        for (String str : listX) {
            gq6<n8j> gq6Var = n8j.G;
            ArrayList arrayList2 = new ArrayList(x44.y(gq6Var, 10));
            for (n8j n8jVar : gq6Var) {
                arrayList2.add(new cpc(kgh.o(str, n8jVar.E), n8jVar));
            }
            b54.t0(arrayList, arrayList2);
        }
        Map mapP0 = sta.p0(arrayList);
        a = mapP0;
        b = mapP0.keySet();
    }
}
