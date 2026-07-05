package com.anthropic.claude.api.account;

import defpackage.b5;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.x7;
import defpackage.y7;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/account/AccountDeletableResponse;", "", "", "deletable", "", "", "reasons", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/AccountDeletableResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/anthropic/claude/api/account/AccountDeletableResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getDeletable", "Ljava/util/List;", "getReasons", "Companion", "x7", "y7", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AccountDeletableResponse {
    public static final int $stable = 0;
    private final boolean deletable;
    private final List<String> reasons;
    public static final y7 Companion = new y7();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new b5(1))};

    public /* synthetic */ AccountDeletableResponse(int i, boolean z, List list, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, x7.a.getDescriptor());
            throw null;
        }
        this.deletable = z;
        if ((i & 2) == 0) {
            this.reasons = null;
        } else {
            this.reasons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountDeletableResponse copy$default(AccountDeletableResponse accountDeletableResponse, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountDeletableResponse.deletable;
        }
        if ((i & 2) != 0) {
            list = accountDeletableResponse.reasons;
        }
        return accountDeletableResponse.copy(z, list);
    }

    public static final /* synthetic */ void write$Self$api(AccountDeletableResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.p(serialDesc, 0, self.deletable);
        if (!output.E(serialDesc) && self.reasons == null) {
            return;
        }
        output.B(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.reasons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDeletable() {
        return this.deletable;
    }

    public final List<String> component2() {
        return this.reasons;
    }

    public final AccountDeletableResponse copy(boolean deletable, List<String> reasons) {
        return new AccountDeletableResponse(deletable, reasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountDeletableResponse)) {
            return false;
        }
        AccountDeletableResponse accountDeletableResponse = (AccountDeletableResponse) other;
        return this.deletable == accountDeletableResponse.deletable && x44.r(this.reasons, accountDeletableResponse.reasons);
    }

    public final boolean getDeletable() {
        return this.deletable;
    }

    public final List<String> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.deletable) * 31;
        List<String> list = this.reasons;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "AccountDeletableResponse(deletable=" + this.deletable + ", reasons=" + this.reasons + ")";
    }

    public AccountDeletableResponse(boolean z, List<String> list) {
        this.deletable = z;
        this.reasons = list;
    }

    public /* synthetic */ AccountDeletableResponse(boolean z, List list, int i, mq5 mq5Var) {
        this(z, (i & 2) != 0 ? null : list);
    }
}
