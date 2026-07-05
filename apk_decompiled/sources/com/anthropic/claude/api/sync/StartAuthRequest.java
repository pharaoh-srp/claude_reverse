package com.anthropic.claude.api.sync;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qad;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wkg;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/sync/StartAuthRequest;", "", "", "redirect_uri", "Lcom/anthropic/claude/api/sync/PreAuthState;", "pre_auth_state", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/sync/PreAuthState;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/sync/PreAuthState;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/sync/StartAuthRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/sync/PreAuthState;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/sync/PreAuthState;)Lcom/anthropic/claude/api/sync/StartAuthRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirect_uri", "Lcom/anthropic/claude/api/sync/PreAuthState;", "getPre_auth_state", "Companion", "vkg", "wkg", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StartAuthRequest {
    public static final int $stable = 0;
    public static final wkg Companion = new wkg();
    private final PreAuthState pre_auth_state;
    private final String redirect_uri;

    public StartAuthRequest(int i, String str, PreAuthState preAuthState, vnf vnfVar) {
        this.redirect_uri = (i & 1) == 0 ? null : str;
        if ((i & 2) != 0) {
            this.pre_auth_state = preAuthState;
        } else {
            PreAuthState.Companion.getClass();
            this.pre_auth_state = PreAuthState.NONE;
        }
    }

    public static /* synthetic */ StartAuthRequest copy$default(StartAuthRequest startAuthRequest, String str, PreAuthState preAuthState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startAuthRequest.redirect_uri;
        }
        if ((i & 2) != 0) {
            preAuthState = startAuthRequest.pre_auth_state;
        }
        return startAuthRequest.copy(str, preAuthState);
    }

    public static final void write$Self$api(StartAuthRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.redirect_uri != null) {
            output.B(serialDesc, 0, srg.a, self.redirect_uri);
        }
        if (!output.E(serialDesc)) {
            PreAuthState preAuthState = self.pre_auth_state;
            PreAuthState.Companion.getClass();
            if (x44.r(preAuthState, PreAuthState.NONE)) {
                return;
            }
        }
        output.r(serialDesc, 1, qad.a, self.pre_auth_state);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreAuthState getPre_auth_state() {
        return this.pre_auth_state;
    }

    public final StartAuthRequest copy(String redirect_uri, PreAuthState pre_auth_state) {
        pre_auth_state.getClass();
        return new StartAuthRequest(redirect_uri, pre_auth_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartAuthRequest)) {
            return false;
        }
        StartAuthRequest startAuthRequest = (StartAuthRequest) other;
        return x44.r(this.redirect_uri, startAuthRequest.redirect_uri) && x44.r(this.pre_auth_state, startAuthRequest.pre_auth_state);
    }

    public final PreAuthState getPre_auth_state() {
        return this.pre_auth_state;
    }

    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public int hashCode() {
        String str = this.redirect_uri;
        return this.pre_auth_state.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "StartAuthRequest(redirect_uri=" + this.redirect_uri + ", pre_auth_state=" + this.pre_auth_state + ")";
    }

    public StartAuthRequest() {
        this((String) null, (PreAuthState) null, 3, (mq5) null);
    }

    public StartAuthRequest(String str, PreAuthState preAuthState) {
        preAuthState.getClass();
        this.redirect_uri = str;
        this.pre_auth_state = preAuthState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StartAuthRequest(String str, PreAuthState preAuthState, int i, mq5 mq5Var) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            PreAuthState.Companion.getClass();
            preAuthState = PreAuthState.NONE;
        }
        this(str, preAuthState);
    }
}
