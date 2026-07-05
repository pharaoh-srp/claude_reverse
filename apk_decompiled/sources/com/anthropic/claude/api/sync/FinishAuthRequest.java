package com.anthropic.claude.api.sync;

import defpackage.il7;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/sync/FinishAuthRequest;", "", "", "code", "state", "scope", "redirect_uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/sync/FinishAuthRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/sync/FinishAuthRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getState", "getScope", "getRedirect_uri", "Companion", "hl7", "il7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class FinishAuthRequest {
    public static final int $stable = 0;
    public static final il7 Companion = new il7();
    private final String code;
    private final String redirect_uri;
    private final String scope;
    private final String state;

    public /* synthetic */ FinishAuthRequest(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.code = null;
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.state = null;
        } else {
            this.state = str2;
        }
        if ((i & 4) == 0) {
            this.scope = null;
        } else {
            this.scope = str3;
        }
        if ((i & 8) == 0) {
            this.redirect_uri = null;
        } else {
            this.redirect_uri = str4;
        }
    }

    public static /* synthetic */ FinishAuthRequest copy$default(FinishAuthRequest finishAuthRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finishAuthRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = finishAuthRequest.state;
        }
        if ((i & 4) != 0) {
            str3 = finishAuthRequest.scope;
        }
        if ((i & 8) != 0) {
            str4 = finishAuthRequest.redirect_uri;
        }
        return finishAuthRequest.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$api(FinishAuthRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.code != null) {
            output.B(serialDesc, 0, srg.a, self.code);
        }
        if (output.E(serialDesc) || self.state != null) {
            output.B(serialDesc, 1, srg.a, self.state);
        }
        if (output.E(serialDesc) || self.scope != null) {
            output.B(serialDesc, 2, srg.a, self.scope);
        }
        if (!output.E(serialDesc) && self.redirect_uri == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.redirect_uri);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public final FinishAuthRequest copy(String code, String state, String scope, String redirect_uri) {
        return new FinishAuthRequest(code, state, scope, redirect_uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishAuthRequest)) {
            return false;
        }
        FinishAuthRequest finishAuthRequest = (FinishAuthRequest) other;
        return x44.r(this.code, finishAuthRequest.code) && x44.r(this.state, finishAuthRequest.state) && x44.r(this.scope, finishAuthRequest.scope) && x44.r(this.redirect_uri, finishAuthRequest.redirect_uri);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getRedirect_uri() {
        return this.redirect_uri;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scope;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redirect_uri;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.state;
        return vb7.t(kgh.r("FinishAuthRequest(code=", str, ", state=", str2, ", scope="), this.scope, ", redirect_uri=", this.redirect_uri, ")");
    }

    public FinishAuthRequest() {
        this((String) null, (String) null, (String) null, (String) null, 15, (mq5) null);
    }

    public FinishAuthRequest(String str, String str2, String str3, String str4) {
        this.code = str;
        this.state = str2;
        this.scope = str3;
        this.redirect_uri = str4;
    }

    public /* synthetic */ FinishAuthRequest(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
