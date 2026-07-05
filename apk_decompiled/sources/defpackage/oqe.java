package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oqe<T> {
    public final pqe a;
    public final Object b;
    public final rqe c;

    public oqe(pqe pqeVar, Object obj, qqe qqeVar) {
        this.a = pqeVar;
        this.b = obj;
        this.c = qqeVar;
    }

    public static oqe a(ApiResult apiResult) {
        qqe qqeVar = rqe.E;
        ArrayList arrayList = new ArrayList(20);
        jie jieVar = new jie();
        jieVar.g("http://localhost/");
        return b(apiResult, new pqe(new kie(jieVar), bvd.HTTP_1_1, "OK", 200, null, new wg8((String[]) arrayList.toArray(new String[0])), qqeVar, null, null, null, null, 0L, 0L, null, t4i.t));
    }

    public static oqe b(Object obj, pqe pqeVar) {
        if (pqeVar.U) {
            return new oqe(pqeVar, obj, null);
        }
        sz6.p("rawResponse must be successful response");
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
