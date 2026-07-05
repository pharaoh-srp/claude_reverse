package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y75;
import defpackage.z75;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/sessions/types/CreatePullRequestRequest;", "", "", "repo", "head", "base", "title", "body", "", "draft", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CreatePullRequestRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/sessions/types/CreatePullRequestRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRepo", "getHead", "getBase", "getTitle", "getBody", "Z", "getDraft", "Companion", "y75", "z75", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreatePullRequestRequest {
    public static final z75 Companion = new z75();
    private final String base;
    private final String body;
    private final boolean draft;
    private final String head;
    private final String repo;
    private final String title;

    public /* synthetic */ CreatePullRequestRequest(int i, String str, String str2, String str3, String str4, String str5, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, y75.a.getDescriptor());
            throw null;
        }
        this.repo = str;
        this.head = str2;
        if ((i & 4) == 0) {
            this.base = null;
        } else {
            this.base = str3;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str4;
        }
        if ((i & 16) == 0) {
            this.body = null;
        } else {
            this.body = str5;
        }
        if ((i & 32) == 0) {
            this.draft = false;
        } else {
            this.draft = z;
        }
    }

    public static /* synthetic */ CreatePullRequestRequest copy$default(CreatePullRequestRequest createPullRequestRequest, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createPullRequestRequest.repo;
        }
        if ((i & 2) != 0) {
            str2 = createPullRequestRequest.head;
        }
        if ((i & 4) != 0) {
            str3 = createPullRequestRequest.base;
        }
        if ((i & 8) != 0) {
            str4 = createPullRequestRequest.title;
        }
        if ((i & 16) != 0) {
            str5 = createPullRequestRequest.body;
        }
        if ((i & 32) != 0) {
            z = createPullRequestRequest.draft;
        }
        String str6 = str5;
        boolean z2 = z;
        return createPullRequestRequest.copy(str, str2, str3, str4, str6, z2);
    }

    public static final /* synthetic */ void write$Self$sessions(CreatePullRequestRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.repo);
        output.q(serialDesc, 1, self.head);
        if (output.E(serialDesc) || self.base != null) {
            output.B(serialDesc, 2, srg.a, self.base);
        }
        if (output.E(serialDesc) || self.title != null) {
            output.B(serialDesc, 3, srg.a, self.title);
        }
        if (output.E(serialDesc) || self.body != null) {
            output.B(serialDesc, 4, srg.a, self.body);
        }
        if (output.E(serialDesc) || self.draft) {
            output.p(serialDesc, 5, self.draft);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHead() {
        return this.head;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBase() {
        return this.base;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDraft() {
        return this.draft;
    }

    public final CreatePullRequestRequest copy(String repo, String head, String base, String title, String body, boolean draft) {
        repo.getClass();
        head.getClass();
        return new CreatePullRequestRequest(repo, head, base, title, body, draft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePullRequestRequest)) {
            return false;
        }
        CreatePullRequestRequest createPullRequestRequest = (CreatePullRequestRequest) other;
        return x44.r(this.repo, createPullRequestRequest.repo) && x44.r(this.head, createPullRequestRequest.head) && x44.r(this.base, createPullRequestRequest.base) && x44.r(this.title, createPullRequestRequest.title) && x44.r(this.body, createPullRequestRequest.body) && this.draft == createPullRequestRequest.draft;
    }

    public final String getBase() {
        return this.base;
    }

    public final String getBody() {
        return this.body;
    }

    public final boolean getDraft() {
        return this.draft;
    }

    public final String getHead() {
        return this.head;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iL = kgh.l(this.repo.hashCode() * 31, 31, this.head);
        String str = this.base;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.body;
        return Boolean.hashCode(this.draft) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.repo;
        String str2 = this.head;
        String str3 = this.base;
        String str4 = this.title;
        String str5 = this.body;
        boolean z = this.draft;
        StringBuilder sbR = kgh.r("CreatePullRequestRequest(repo=", str, ", head=", str2, ", base=");
        kgh.u(sbR, str3, ", title=", str4, ", body=");
        sbR.append(str5);
        sbR.append(", draft=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public CreatePullRequestRequest(String str, String str2, String str3, String str4, String str5, boolean z) {
        str.getClass();
        str2.getClass();
        this.repo = str;
        this.head = str2;
        this.base = str3;
        this.title = str4;
        this.body = str5;
        this.draft = z;
    }

    public /* synthetic */ CreatePullRequestRequest(String str, String str2, String str3, String str4, String str5, boolean z, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z);
    }
}
