package com.connectrpc.protocols;

import defpackage.cg9;
import defpackage.mdj;
import defpackage.pg9;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/connectrpc/protocols/ErrorPayloadJSON;", "", "", "code", "message", "", "Lcom/connectrpc/protocols/ErrorDetailPayloadJSON;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "library"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@pg9(generateAdapter = true)
public final class ErrorPayloadJSON {
    public final String a;
    public final String b;
    public final List c;

    public ErrorPayloadJSON(@cg9(name = "code") String str, @cg9(name = "message") String str2, @cg9(name = "details") List<ErrorDetailPayloadJSON> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
