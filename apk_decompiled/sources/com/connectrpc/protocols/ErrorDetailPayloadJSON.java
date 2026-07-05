package com.connectrpc.protocols;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.cg9;
import defpackage.mdj;
import defpackage.pg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/connectrpc/protocols/ErrorDetailPayloadJSON;", "", "", "type", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "library"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@pg9(generateAdapter = true)
public final class ErrorDetailPayloadJSON {
    public final String a;
    public final String b;

    public ErrorDetailPayloadJSON(@cg9(name = "type") String str, @cg9(name = ExperienceToggle.DEFAULT_PARAM_KEY) String str2) {
        this.a = str;
        this.b = str2;
    }
}
