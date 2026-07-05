package com.anthropic.claude.api.login;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.gvj;
import defpackage.k7;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.mti;
import defpackage.nti;
import defpackage.ok6;
import defpackage.onf;
import defpackage.qg9;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0003;<=BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&¨\u0006>"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyResponse;", "", "", "success", "Lcom/anthropic/claude/api/account/Account;", "account", "", "secret", "sso_url", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "state", "created", "<init>", "(ZLcom/anthropic/claude/api/account/Account;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLcom/anthropic/claude/api/account/Account;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/anthropic/claude/api/account/Account;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "component6", "()Ljava/lang/Boolean;", "copy", "(ZLcom/anthropic/claude/api/account/Account;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/login/VerifyResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Lcom/anthropic/claude/api/account/Account;", "getAccount", "Ljava/lang/String;", "getSecret", "getSso_url", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "getState", "Ljava/lang/Boolean;", "getCreated", "Companion", "AuthenticationState", "com/anthropic/claude/api/login/k", "nti", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VerifyResponse {
    public static final int $stable = 0;
    private final Account account;
    private final Boolean created;
    private final String secret;
    private final String sso_url;
    private final AuthenticationState state;
    private final boolean success;
    public static final nti Companion = new nti();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new mti(0)), null};

    public /* synthetic */ VerifyResponse(int i, boolean z, Account account, String str, String str2, AuthenticationState authenticationState, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, k.a.getDescriptor());
            throw null;
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.account = null;
        } else {
            this.account = account;
        }
        if ((i & 4) == 0) {
            this.secret = null;
        } else {
            this.secret = str;
        }
        if ((i & 8) == 0) {
            this.sso_url = null;
        } else {
            this.sso_url = str2;
        }
        if ((i & 16) == 0) {
            this.state = null;
        } else {
            this.state = authenticationState;
        }
        if ((i & 32) == 0) {
            this.created = null;
        } else {
            this.created = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AuthenticationState.Companion.serializer();
    }

    public static /* synthetic */ VerifyResponse copy$default(VerifyResponse verifyResponse, boolean z, Account account, String str, String str2, AuthenticationState authenticationState, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyResponse.success;
        }
        if ((i & 2) != 0) {
            account = verifyResponse.account;
        }
        if ((i & 4) != 0) {
            str = verifyResponse.secret;
        }
        if ((i & 8) != 0) {
            str2 = verifyResponse.sso_url;
        }
        if ((i & 16) != 0) {
            authenticationState = verifyResponse.state;
        }
        if ((i & 32) != 0) {
            bool = verifyResponse.created;
        }
        AuthenticationState authenticationState2 = authenticationState;
        Boolean bool2 = bool;
        return verifyResponse.copy(z, account, str, str2, authenticationState2, bool2);
    }

    public static final /* synthetic */ void write$Self$api(VerifyResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.p(serialDesc, 0, self.success);
        if (output.E(serialDesc) || self.account != null) {
            output.B(serialDesc, 1, k7.a, self.account);
        }
        if (output.E(serialDesc) || self.secret != null) {
            output.B(serialDesc, 2, srg.a, self.secret);
        }
        if (output.E(serialDesc) || self.sso_url != null) {
            output.B(serialDesc, 3, srg.a, self.sso_url);
        }
        if (output.E(serialDesc) || self.state != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.state);
        }
        if (!output.E(serialDesc) && self.created == null) {
            return;
        }
        output.B(serialDesc, 5, zt1.a, self.created);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSso_url() {
        return this.sso_url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AuthenticationState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getCreated() {
        return this.created;
    }

    public final VerifyResponse copy(boolean success, Account account, String secret, String sso_url, AuthenticationState state, Boolean created) {
        return new VerifyResponse(success, account, secret, sso_url, state, created);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyResponse)) {
            return false;
        }
        VerifyResponse verifyResponse = (VerifyResponse) other;
        return this.success == verifyResponse.success && x44.r(this.account, verifyResponse.account) && x44.r(this.secret, verifyResponse.secret) && x44.r(this.sso_url, verifyResponse.sso_url) && x44.r(this.state, verifyResponse.state) && x44.r(this.created, verifyResponse.created);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final Boolean getCreated() {
        return this.created;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getSso_url() {
        return this.sso_url;
    }

    public final AuthenticationState getState() {
        return this.state;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.secret;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sso_url;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthenticationState authenticationState = this.state;
        int iHashCode5 = (iHashCode4 + (authenticationState == null ? 0 : authenticationState.hashCode())) * 31;
        Boolean bool = this.created;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.success;
        Account account = this.account;
        String str = this.secret;
        String str2 = this.sso_url;
        AuthenticationState authenticationState = this.state;
        Boolean bool = this.created;
        StringBuilder sb = new StringBuilder("VerifyResponse(success=");
        sb.append(z);
        sb.append(", account=");
        sb.append(account);
        sb.append(", secret=");
        kgh.u(sb, str, ", sso_url=", str2, ", state=");
        sb.append(authenticationState);
        sb.append(", created=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "", "Companion", "com/anthropic/claude/api/login/n", "Authenticated", "MagicLink", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$Authenticated;", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$MagicLink;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    @qg9(discriminator = AuthenticationState.DISCRIMINATOR)
    public interface AuthenticationState {
        public static final n Companion = n.a;
        public static final String DISCRIMINATOR = "kind";

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$Authenticated;", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "Lcom/anthropic/claude/api/account/Account;", "account", "<init>", "(Lcom/anthropic/claude/api/account/Account;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/account/Account;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$Authenticated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/account/Account;", "copy", "(Lcom/anthropic/claude/api/account/Account;)Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$Authenticated;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/account/Account;", "getAccount", "Companion", "com/anthropic/claude/api/login/l", "com/anthropic/claude/api/login/m", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Authenticated implements AuthenticationState {
            public static final int $stable = 0;
            public static final m Companion = new m();
            private final Account account;

            public /* synthetic */ Authenticated(int i, Account account, vnf vnfVar) {
                if (1 == (i & 1)) {
                    this.account = account;
                } else {
                    gvj.f(i, 1, l.a.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Authenticated copy$default(Authenticated authenticated, Account account, int i, Object obj) {
                if ((i & 1) != 0) {
                    account = authenticated.account;
                }
                return authenticated.copy(account);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Account getAccount() {
                return this.account;
            }

            public final Authenticated copy(Account account) {
                account.getClass();
                return new Authenticated(account);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Authenticated) && x44.r(this.account, ((Authenticated) other).account);
            }

            public final Account getAccount() {
                return this.account;
            }

            public int hashCode() {
                return this.account.hashCode();
            }

            public String toString() {
                return "Authenticated(account=" + this.account + ")";
            }

            public Authenticated(Account account) {
                account.getClass();
                this.account = account;
            }
        }

        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$MagicLink;", "Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState;", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email", "Lcom/anthropic/claude/api/login/CodeConfiguration;", "fallback_code_configuration", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/login/CodeConfiguration;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/login/CodeConfiguration;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$MagicLink;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ZiuLfiY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/api/login/CodeConfiguration;", "copy-gwOj_C0", "(Ljava/lang/String;Lcom/anthropic/claude/api/login/CodeConfiguration;)Lcom/anthropic/claude/api/login/VerifyResponse$AuthenticationState$MagicLink;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail-ZiuLfiY", "Lcom/anthropic/claude/api/login/CodeConfiguration;", "getFallback_code_configuration", "Companion", "com/anthropic/claude/api/login/o", "com/anthropic/claude/api/login/p", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class MagicLink implements AuthenticationState {
            public static final int $stable = 0;
            public static final p Companion = new p();
            private final String email;
            private final CodeConfiguration fallback_code_configuration;

            private /* synthetic */ MagicLink(int i, String str, CodeConfiguration codeConfiguration, vnf vnfVar) {
                if (1 != (i & 1)) {
                    gvj.f(i, 1, o.a.getDescriptor());
                    throw null;
                }
                this.email = str;
                if ((i & 2) == 0) {
                    this.fallback_code_configuration = null;
                } else {
                    this.fallback_code_configuration = codeConfiguration;
                }
            }

            /* JADX INFO: renamed from: copy-gwOj_C0$default, reason: not valid java name */
            public static /* synthetic */ MagicLink m323copygwOj_C0$default(MagicLink magicLink, String str, CodeConfiguration codeConfiguration, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = magicLink.email;
                }
                if ((i & 2) != 0) {
                    codeConfiguration = magicLink.fallback_code_configuration;
                }
                return magicLink.m325copygwOj_C0(str, codeConfiguration);
            }

            public static final /* synthetic */ void write$Self$api(MagicLink self, vd4 output, SerialDescriptor serialDesc) {
                output.r(serialDesc, 0, ok6.a, EmailAddress.m1006boximpl(self.email));
                if (!output.E(serialDesc) && self.fallback_code_configuration == null) {
                    return;
                }
                output.B(serialDesc, 1, b.a, self.fallback_code_configuration);
            }

            /* JADX INFO: renamed from: component1-ZiuLfiY, reason: not valid java name and from getter */
            public final String getEmail() {
                return this.email;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final CodeConfiguration getFallback_code_configuration() {
                return this.fallback_code_configuration;
            }

            /* JADX INFO: renamed from: copy-gwOj_C0, reason: not valid java name */
            public final MagicLink m325copygwOj_C0(String email, CodeConfiguration fallback_code_configuration) {
                email.getClass();
                return new MagicLink(email, fallback_code_configuration, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MagicLink)) {
                    return false;
                }
                MagicLink magicLink = (MagicLink) other;
                return EmailAddress.m1009equalsimpl0(this.email, magicLink.email) && x44.r(this.fallback_code_configuration, magicLink.fallback_code_configuration);
            }

            /* JADX INFO: renamed from: getEmail-ZiuLfiY, reason: not valid java name */
            public final String m326getEmailZiuLfiY() {
                return this.email;
            }

            public final CodeConfiguration getFallback_code_configuration() {
                return this.fallback_code_configuration;
            }

            public int hashCode() {
                int iM1010hashCodeimpl = EmailAddress.m1010hashCodeimpl(this.email) * 31;
                CodeConfiguration codeConfiguration = this.fallback_code_configuration;
                return iM1010hashCodeimpl + (codeConfiguration == null ? 0 : codeConfiguration.hashCode());
            }

            public String toString() {
                return "MagicLink(email=" + EmailAddress.m1012toStringimpl(this.email) + ", fallback_code_configuration=" + this.fallback_code_configuration + ")";
            }

            public /* synthetic */ MagicLink(String str, CodeConfiguration codeConfiguration, mq5 mq5Var) {
                this(str, codeConfiguration);
            }

            public /* synthetic */ MagicLink(int i, String str, CodeConfiguration codeConfiguration, vnf vnfVar, mq5 mq5Var) {
                this(i, str, codeConfiguration, vnfVar);
            }

            private MagicLink(String str, CodeConfiguration codeConfiguration) {
                str.getClass();
                this.email = str;
                this.fallback_code_configuration = codeConfiguration;
            }

            public /* synthetic */ MagicLink(String str, CodeConfiguration codeConfiguration, int i, mq5 mq5Var) {
                this(str, (i & 2) != 0 ? null : codeConfiguration, null);
            }
        }
    }

    public VerifyResponse(boolean z, Account account, String str, String str2, AuthenticationState authenticationState, Boolean bool) {
        this.success = z;
        this.account = account;
        this.secret = str;
        this.sso_url = str2;
        this.state = authenticationState;
        this.created = bool;
    }

    public /* synthetic */ VerifyResponse(boolean z, Account account, String str, String str2, AuthenticationState authenticationState, Boolean bool, int i, mq5 mq5Var) {
        this(z, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : authenticationState, (i & 32) != 0 ? null : bool);
    }
}
