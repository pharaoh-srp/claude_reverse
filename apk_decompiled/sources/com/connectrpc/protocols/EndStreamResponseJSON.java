package com.connectrpc.protocols;

import defpackage.cg9;
import defpackage.mdj;
import defpackage.pg9;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\b\u0001\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/connectrpc/protocols/EndStreamResponseJSON;", "", "Lcom/connectrpc/protocols/ErrorPayloadJSON;", "error", "", "", "", "Lcom/connectrpc/Headers;", "metadata", "<init>", "(Lcom/connectrpc/protocols/ErrorPayloadJSON;Ljava/util/Map;)V", "library"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@pg9(generateAdapter = true)
public final class EndStreamResponseJSON {
    public final ErrorPayloadJSON a;
    public final Map b;

    public EndStreamResponseJSON(@cg9(name = "error") ErrorPayloadJSON errorPayloadJSON, @cg9(name = "metadata") Map<String, ? extends List<String>> map) {
        this.a = errorPayloadJSON;
        this.b = map;
    }
}
