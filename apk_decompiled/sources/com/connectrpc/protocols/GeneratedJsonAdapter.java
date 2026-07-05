package com.connectrpc.protocols;

import defpackage.ai9;
import defpackage.ci9;
import defpackage.gg9;
import defpackage.jj9;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.prb;
import defpackage.um6;
import defpackage.wwk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.connectrpc.protocols.EndStreamResponseJSONJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/connectrpc/protocols/EndStreamResponseJSONJsonAdapter;", "Lgg9;", "Lcom/connectrpc/protocols/EndStreamResponseJSON;", "Lprb;", "moshi", "<init>", "(Lprb;)V", "library"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class GeneratedJsonAdapter extends gg9 {
    public final ai9 a;
    public final gg9 b;
    public final gg9 c;

    public GeneratedJsonAdapter(prb prbVar) {
        prbVar.getClass();
        this.a = ai9.a("error", "metadata");
        um6 um6Var = um6.E;
        this.b = prbVar.b(ErrorPayloadJSON.class, um6Var, "error");
        this.c = prbVar.b(wwk.o(Map.class, String.class, wwk.o(List.class, String.class)), um6Var, "metadata");
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        ci9Var.getClass();
        ci9Var.beginObject();
        ErrorPayloadJSON errorPayloadJSON = null;
        Map map = null;
        while (ci9Var.hasNext()) {
            int iK = ci9Var.K(this.a);
            if (iK == -1) {
                ci9Var.R();
                ci9Var.skipValue();
            } else if (iK == 0) {
                errorPayloadJSON = (ErrorPayloadJSON) this.b.fromJson(ci9Var);
            } else if (iK == 1) {
                map = (Map) this.c.fromJson(ci9Var);
            }
        }
        ci9Var.endObject();
        return new EndStreamResponseJSON(errorPayloadJSON, map);
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        EndStreamResponseJSON endStreamResponseJSON = (EndStreamResponseJSON) obj;
        jj9Var.getClass();
        if (endStreamResponseJSON == null) {
            mr9.h("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jj9Var.d();
        jj9Var.n("error");
        this.b.toJson(jj9Var, endStreamResponseJSON.a);
        jj9Var.n("metadata");
        this.c.toJson(jj9Var, endStreamResponseJSON.b);
        jj9Var.i();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(EndStreamResponseJSON)");
        return sb.toString();
    }
}
