package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.oad;
import defpackage.onf;
import defpackage.pad;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/PrSubscriptionRequest;", "", "", "session_id", "repo", "", "pr_number", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/PrSubscriptionRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/anthropic/claude/sessions/types/PrSubscriptionRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSession_id", "getRepo", "I", "getPr_number", "Companion", "oad", "pad", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PrSubscriptionRequest {
    public static final pad Companion = new pad();
    private final int pr_number;
    private final String repo;
    private final String session_id;

    public /* synthetic */ PrSubscriptionRequest(int i, String str, String str2, int i2, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, oad.a.getDescriptor());
            throw null;
        }
        this.session_id = str;
        this.repo = str2;
        this.pr_number = i2;
    }

    public static /* synthetic */ PrSubscriptionRequest copy$default(PrSubscriptionRequest prSubscriptionRequest, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = prSubscriptionRequest.session_id;
        }
        if ((i2 & 2) != 0) {
            str2 = prSubscriptionRequest.repo;
        }
        if ((i2 & 4) != 0) {
            i = prSubscriptionRequest.pr_number;
        }
        return prSubscriptionRequest.copy(str, str2, i);
    }

    public static final /* synthetic */ void write$Self$sessions(PrSubscriptionRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.session_id);
        output.q(serialDesc, 1, self.repo);
        output.l(2, self.pr_number, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRepo() {
        return this.repo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPr_number() {
        return this.pr_number;
    }

    public final PrSubscriptionRequest copy(String session_id, String repo, int pr_number) {
        session_id.getClass();
        repo.getClass();
        return new PrSubscriptionRequest(session_id, repo, pr_number);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrSubscriptionRequest)) {
            return false;
        }
        PrSubscriptionRequest prSubscriptionRequest = (PrSubscriptionRequest) other;
        return x44.r(this.session_id, prSubscriptionRequest.session_id) && x44.r(this.repo, prSubscriptionRequest.repo) && this.pr_number == prSubscriptionRequest.pr_number;
    }

    public final int getPr_number() {
        return this.pr_number;
    }

    public final String getRepo() {
        return this.repo;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public int hashCode() {
        return Integer.hashCode(this.pr_number) + kgh.l(this.session_id.hashCode() * 31, 31, this.repo);
    }

    public String toString() {
        return vb7.l(this.pr_number, ")", kgh.r("PrSubscriptionRequest(session_id=", this.session_id, ", repo=", this.repo, ", pr_number="));
    }

    public PrSubscriptionRequest(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.session_id = str;
        this.repo = str2;
        this.pr_number = i;
    }
}
