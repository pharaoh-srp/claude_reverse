package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y58;
import defpackage.y6a;
import defpackage.z58;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitProxyFileResponse;", "", "", "path", "name", "content", "encoding", "", "size", "sha", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/GitProxyFileResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/anthropic/claude/sessions/types/GitProxyFileResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "getName", "getContent", "getEncoding", "I", "getSize", "getSha", "Companion", "y58", "z58", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GitProxyFileResponse {
    public static final z58 Companion = new z58();
    private final String content;
    private final String encoding;
    private final String name;
    private final String path;
    private final String sha;
    private final int size;

    public /* synthetic */ GitProxyFileResponse(int i, String str, String str2, String str3, String str4, int i2, String str5, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, y58.a.getDescriptor());
            throw null;
        }
        this.path = str;
        this.name = str2;
        this.content = str3;
        this.encoding = str4;
        this.size = i2;
        this.sha = str5;
    }

    public static /* synthetic */ GitProxyFileResponse copy$default(GitProxyFileResponse gitProxyFileResponse, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gitProxyFileResponse.path;
        }
        if ((i2 & 2) != 0) {
            str2 = gitProxyFileResponse.name;
        }
        if ((i2 & 4) != 0) {
            str3 = gitProxyFileResponse.content;
        }
        if ((i2 & 8) != 0) {
            str4 = gitProxyFileResponse.encoding;
        }
        if ((i2 & 16) != 0) {
            i = gitProxyFileResponse.size;
        }
        if ((i2 & 32) != 0) {
            str5 = gitProxyFileResponse.sha;
        }
        int i3 = i;
        String str6 = str5;
        return gitProxyFileResponse.copy(str, str2, str3, str4, i3, str6);
    }

    public static final /* synthetic */ void write$Self$sessions(GitProxyFileResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.path);
        output.q(serialDesc, 1, self.name);
        output.q(serialDesc, 2, self.content);
        output.q(serialDesc, 3, self.encoding);
        output.l(4, self.size, serialDesc);
        output.q(serialDesc, 5, self.sha);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEncoding() {
        return this.encoding;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSha() {
        return this.sha;
    }

    public final GitProxyFileResponse copy(String path, String name, String content, String encoding, int size, String sha) {
        path.getClass();
        name.getClass();
        content.getClass();
        encoding.getClass();
        sha.getClass();
        return new GitProxyFileResponse(path, name, content, encoding, size, sha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitProxyFileResponse)) {
            return false;
        }
        GitProxyFileResponse gitProxyFileResponse = (GitProxyFileResponse) other;
        return x44.r(this.path, gitProxyFileResponse.path) && x44.r(this.name, gitProxyFileResponse.name) && x44.r(this.content, gitProxyFileResponse.content) && x44.r(this.encoding, gitProxyFileResponse.encoding) && this.size == gitProxyFileResponse.size && x44.r(this.sha, gitProxyFileResponse.sha);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSha() {
        return this.sha;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.sha.hashCode() + vb7.c(this.size, kgh.l(kgh.l(kgh.l(this.path.hashCode() * 31, 31, this.name), 31, this.content), 31, this.encoding), 31);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.name;
        String str3 = this.content;
        String str4 = this.encoding;
        int i = this.size;
        String str5 = this.sha;
        StringBuilder sbR = kgh.r("GitProxyFileResponse(path=", str, ", name=", str2, ", content=");
        kgh.u(sbR, str3, ", encoding=", str4, ", size=");
        sbR.append(i);
        sbR.append(", sha=");
        sbR.append(str5);
        sbR.append(")");
        return sbR.toString();
    }

    public GitProxyFileResponse(String str, String str2, String str3, String str4, int i, String str5) {
        y6a.s(str, str2, str3, str4, str5);
        this.path = str;
        this.name = str2;
        this.content = str3;
        this.encoding = str4;
        this.size = i;
        this.sha = str5;
    }
}
