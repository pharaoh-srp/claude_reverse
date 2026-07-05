package com.anthropic.claude.api.login;

import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.dti;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ok6;
import defpackage.onf;
import defpackage.qg9;
import defpackage.qo3;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0003789BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u0006:"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest;", "", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "credentials", "", "recaptcha_token", "recaptcha_site_key", "source", "play_integrity_token", "Lcom/anthropic/claude/api/login/ClientAttestation;", "client_attestation", "<init>", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/ClientAttestation;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/ClientAttestation;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/anthropic/claude/api/login/ClientAttestation;", "copy", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/login/ClientAttestation;)Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "getCredentials", "Ljava/lang/String;", "getRecaptcha_token", "getRecaptcha_site_key", "getSource", "getPlay_integrity_token", "Lcom/anthropic/claude/api/login/ClientAttestation;", "getClient_attestation", "Companion", "Credentials", "com/anthropic/claude/api/login/d", "dti", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VerifyMagicLinkRequest {
    public static final int $stable = 0;
    private final ClientAttestation client_attestation;
    private final Credentials credentials;
    private final String play_integrity_token;
    private final String recaptcha_site_key;
    private final String recaptcha_token;
    private final String source;
    public static final dti Companion = new dti();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new kdi(29)), null, null, null, null, null};

    public /* synthetic */ VerifyMagicLinkRequest(int i, Credentials credentials, String str, String str2, String str3, String str4, ClientAttestation clientAttestation, vnf vnfVar) {
        if (17 != (i & 17)) {
            gvj.f(i, 17, d.a.getDescriptor());
            throw null;
        }
        this.credentials = credentials;
        if ((i & 2) == 0) {
            this.recaptcha_token = "xxx";
        } else {
            this.recaptcha_token = str;
        }
        if ((i & 4) == 0) {
            this.recaptcha_site_key = "xxx";
        } else {
            this.recaptcha_site_key = str2;
        }
        if ((i & 8) == 0) {
            this.source = "claude";
        } else {
            this.source = str3;
        }
        this.play_integrity_token = str4;
        if ((i & 32) == 0) {
            this.client_attestation = null;
        } else {
            this.client_attestation = clientAttestation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Credentials.Companion.serializer();
    }

    public static /* synthetic */ VerifyMagicLinkRequest copy$default(VerifyMagicLinkRequest verifyMagicLinkRequest, Credentials credentials, String str, String str2, String str3, String str4, ClientAttestation clientAttestation, int i, Object obj) {
        if ((i & 1) != 0) {
            credentials = verifyMagicLinkRequest.credentials;
        }
        if ((i & 2) != 0) {
            str = verifyMagicLinkRequest.recaptcha_token;
        }
        if ((i & 4) != 0) {
            str2 = verifyMagicLinkRequest.recaptcha_site_key;
        }
        if ((i & 8) != 0) {
            str3 = verifyMagicLinkRequest.source;
        }
        if ((i & 16) != 0) {
            str4 = verifyMagicLinkRequest.play_integrity_token;
        }
        if ((i & 32) != 0) {
            clientAttestation = verifyMagicLinkRequest.client_attestation;
        }
        String str5 = str4;
        ClientAttestation clientAttestation2 = clientAttestation;
        return verifyMagicLinkRequest.copy(credentials, str, str2, str3, str5, clientAttestation2);
    }

    public static final /* synthetic */ void write$Self$api(VerifyMagicLinkRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.credentials);
        if (output.E(serialDesc) || !x44.r(self.recaptcha_token, "xxx")) {
            output.q(serialDesc, 1, self.recaptcha_token);
        }
        if (output.E(serialDesc) || !x44.r(self.recaptcha_site_key, "xxx")) {
            output.q(serialDesc, 2, self.recaptcha_site_key);
        }
        if (output.E(serialDesc) || !x44.r(self.source, "claude")) {
            output.q(serialDesc, 3, self.source);
        }
        output.B(serialDesc, 4, srg.a, self.play_integrity_token);
        if (!output.E(serialDesc) && self.client_attestation == null) {
            return;
        }
        output.B(serialDesc, 5, qo3.a, self.client_attestation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Credentials getCredentials() {
        return this.credentials;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecaptcha_token() {
        return this.recaptcha_token;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecaptcha_site_key() {
        return this.recaptcha_site_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlay_integrity_token() {
        return this.play_integrity_token;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ClientAttestation getClient_attestation() {
        return this.client_attestation;
    }

    public final VerifyMagicLinkRequest copy(Credentials credentials, String recaptcha_token, String recaptcha_site_key, String source, String play_integrity_token, ClientAttestation client_attestation) {
        credentials.getClass();
        recaptcha_token.getClass();
        recaptcha_site_key.getClass();
        source.getClass();
        return new VerifyMagicLinkRequest(credentials, recaptcha_token, recaptcha_site_key, source, play_integrity_token, client_attestation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyMagicLinkRequest)) {
            return false;
        }
        VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) other;
        return x44.r(this.credentials, verifyMagicLinkRequest.credentials) && x44.r(this.recaptcha_token, verifyMagicLinkRequest.recaptcha_token) && x44.r(this.recaptcha_site_key, verifyMagicLinkRequest.recaptcha_site_key) && x44.r(this.source, verifyMagicLinkRequest.source) && x44.r(this.play_integrity_token, verifyMagicLinkRequest.play_integrity_token) && x44.r(this.client_attestation, verifyMagicLinkRequest.client_attestation);
    }

    public final ClientAttestation getClient_attestation() {
        return this.client_attestation;
    }

    public final Credentials getCredentials() {
        return this.credentials;
    }

    public final String getPlay_integrity_token() {
        return this.play_integrity_token;
    }

    public final String getRecaptcha_site_key() {
        return this.recaptcha_site_key;
    }

    public final String getRecaptcha_token() {
        return this.recaptcha_token;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(this.credentials.hashCode() * 31, 31, this.recaptcha_token), 31, this.recaptcha_site_key), 31, this.source);
        String str = this.play_integrity_token;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        ClientAttestation clientAttestation = this.client_attestation;
        return iHashCode + (clientAttestation != null ? clientAttestation.hashCode() : 0);
    }

    public String toString() {
        Credentials credentials = this.credentials;
        String str = this.recaptcha_token;
        String str2 = this.recaptcha_site_key;
        String str3 = this.source;
        String str4 = this.play_integrity_token;
        ClientAttestation clientAttestation = this.client_attestation;
        StringBuilder sb = new StringBuilder("VerifyMagicLinkRequest(credentials=");
        sb.append(credentials);
        sb.append(", recaptcha_token=");
        sb.append(str);
        sb.append(", recaptcha_site_key=");
        kgh.u(sb, str2, ", source=", str3, ", play_integrity_token=");
        sb.append(str4);
        sb.append(", client_attestation=");
        sb.append(clientAttestation);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "", "Companion", "com/anthropic/claude/api/login/h", "Code", "Nonce", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Code;", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Nonce;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    @qg9(discriminator = Credentials.DISCRIMINATOR)
    public interface Credentials {
        public static final h Companion = h.a;
        public static final String DISCRIMINATOR = "method";

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Code;", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "", "code", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email_address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Code;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-ZiuLfiY", "component2", "copy-Txs9taw", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Code;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getEmail_address-ZiuLfiY", "Companion", "com/anthropic/claude/api/login/e", "com/anthropic/claude/api/login/f", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Code implements Credentials {
            public static final int $stable = 0;
            public static final f Companion = new f();
            private final String code;
            private final String email_address;

            private /* synthetic */ Code(int i, String str, String str2, vnf vnfVar) {
                if (3 != (i & 3)) {
                    gvj.f(i, 3, e.a.getDescriptor());
                    throw null;
                }
                this.code = str;
                this.email_address = str2;
            }

            /* JADX INFO: renamed from: copy-Txs9taw$default, reason: not valid java name */
            public static /* synthetic */ Code m319copyTxs9taw$default(Code code, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = code.code;
                }
                if ((i & 2) != 0) {
                    str2 = code.email_address;
                }
                return code.m321copyTxs9taw(str, str2);
            }

            public static final /* synthetic */ void write$Self$api(Code self, vd4 output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.code);
                output.r(serialDesc, 1, ok6.a, EmailAddress.m1006boximpl(self.email_address));
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            /* JADX INFO: renamed from: component2-ZiuLfiY, reason: not valid java name and from getter */
            public final String getEmail_address() {
                return this.email_address;
            }

            /* JADX INFO: renamed from: copy-Txs9taw, reason: not valid java name */
            public final Code m321copyTxs9taw(String code, String email_address) {
                code.getClass();
                email_address.getClass();
                return new Code(code, email_address, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Code)) {
                    return false;
                }
                Code code = (Code) other;
                return x44.r(this.code, code.code) && EmailAddress.m1009equalsimpl0(this.email_address, code.email_address);
            }

            public final String getCode() {
                return this.code;
            }

            /* JADX INFO: renamed from: getEmail_address-ZiuLfiY, reason: not valid java name */
            public final String m322getEmail_addressZiuLfiY() {
                return this.email_address;
            }

            public int hashCode() {
                return EmailAddress.m1010hashCodeimpl(this.email_address) + (this.code.hashCode() * 31);
            }

            public String toString() {
                return ij0.l("Code(code=", this.code, ", email_address=", EmailAddress.m1012toStringimpl(this.email_address), ")");
            }

            public /* synthetic */ Code(String str, String str2, mq5 mq5Var) {
                this(str, str2);
            }

            public /* synthetic */ Code(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
                this(i, str, str2, vnfVar);
            }

            private Code(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.code = str;
                this.email_address = str2;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Nonce;", "Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials;", "", "nonce", "encoded_email_address", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Nonce;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/login/VerifyMagicLinkRequest$Credentials$Nonce;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNonce", "getEncoded_email_address", "Companion", "com/anthropic/claude/api/login/i", "com/anthropic/claude/api/login/j", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        @onf
        public static final /* data */ class Nonce implements Credentials {
            public static final int $stable = 0;
            public static final j Companion = new j();
            private final String encoded_email_address;
            private final String nonce;

            public /* synthetic */ Nonce(int i, String str, String str2, vnf vnfVar) {
                if (3 != (i & 3)) {
                    gvj.f(i, 3, i.a.getDescriptor());
                    throw null;
                }
                this.nonce = str;
                this.encoded_email_address = str2;
            }

            public static /* synthetic */ Nonce copy$default(Nonce nonce, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nonce.nonce;
                }
                if ((i & 2) != 0) {
                    str2 = nonce.encoded_email_address;
                }
                return nonce.copy(str, str2);
            }

            public static final /* synthetic */ void write$Self$api(Nonce self, vd4 output, SerialDescriptor serialDesc) {
                output.q(serialDesc, 0, self.nonce);
                output.q(serialDesc, 1, self.encoded_email_address);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getNonce() {
                return this.nonce;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getEncoded_email_address() {
                return this.encoded_email_address;
            }

            public final Nonce copy(String nonce, String encoded_email_address) {
                nonce.getClass();
                encoded_email_address.getClass();
                return new Nonce(nonce, encoded_email_address);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Nonce)) {
                    return false;
                }
                Nonce nonce = (Nonce) other;
                return x44.r(this.nonce, nonce.nonce) && x44.r(this.encoded_email_address, nonce.encoded_email_address);
            }

            public final String getEncoded_email_address() {
                return this.encoded_email_address;
            }

            public final String getNonce() {
                return this.nonce;
            }

            public int hashCode() {
                return this.encoded_email_address.hashCode() + (this.nonce.hashCode() * 31);
            }

            public String toString() {
                return ij0.l("Nonce(nonce=", this.nonce, ", encoded_email_address=", this.encoded_email_address, ")");
            }

            public Nonce(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.nonce = str;
                this.encoded_email_address = str2;
            }
        }
    }

    public VerifyMagicLinkRequest(Credentials credentials, String str, String str2, String str3, String str4, ClientAttestation clientAttestation) {
        credentials.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.credentials = credentials;
        this.recaptcha_token = str;
        this.recaptcha_site_key = str2;
        this.source = str3;
        this.play_integrity_token = str4;
        this.client_attestation = clientAttestation;
    }

    public /* synthetic */ VerifyMagicLinkRequest(Credentials credentials, String str, String str2, String str3, String str4, ClientAttestation clientAttestation, int i, mq5 mq5Var) {
        this(credentials, (i & 2) != 0 ? "xxx" : str, (i & 4) != 0 ? "xxx" : str2, (i & 8) != 0 ? "claude" : str3, str4, (i & 32) != 0 ? null : clientAttestation);
    }
}
