package com.anthropic.claude.login;

import com.anthropic.claude.api.login.CodeConfiguration;
import com.anthropic.claude.types.strings.EmailAddress;
import defpackage.e79;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.moa;
import defpackage.mq5;
import defpackage.noa;
import defpackage.ok6;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u001c¨\u00065"}, d2 = {"Lcom/anthropic/claude/login/MagicLinkSentConfig;", "", "Lcom/anthropic/claude/types/strings/EmailAddress;", "email", "", "codeLength", "Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "codeCharset", "codeShowInputAfterDelay", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/login/MagicLinkSentConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-ZiuLfiY", "()Ljava/lang/String;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "component4", "copy-5oXczho", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;Ljava/lang/Integer;)Lcom/anthropic/claude/login/MagicLinkSentConfig;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail-ZiuLfiY", "Ljava/lang/Integer;", "getCodeLength", "Lcom/anthropic/claude/api/login/CodeConfiguration$CharSet;", "getCodeCharset", "getCodeShowInputAfterDelay", "Companion", "moa", "noa", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MagicLinkSentConfig {
    public static final int $stable = 0;
    public static final noa Companion = new noa();
    private final CodeConfiguration.CharSet codeCharset;
    private final Integer codeLength;
    private final Integer codeShowInputAfterDelay;
    private final String email;

    private /* synthetic */ MagicLinkSentConfig(int i, String str, Integer num, CodeConfiguration.CharSet charSet, Integer num2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, moa.a.getDescriptor());
            throw null;
        }
        this.email = str;
        this.codeLength = num;
        this.codeCharset = charSet;
        this.codeShowInputAfterDelay = num2;
    }

    /* JADX INFO: renamed from: copy-5oXczho$default, reason: not valid java name */
    public static /* synthetic */ MagicLinkSentConfig m761copy5oXczho$default(MagicLinkSentConfig magicLinkSentConfig, String str, Integer num, CodeConfiguration.CharSet charSet, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magicLinkSentConfig.email;
        }
        if ((i & 2) != 0) {
            num = magicLinkSentConfig.codeLength;
        }
        if ((i & 4) != 0) {
            charSet = magicLinkSentConfig.codeCharset;
        }
        if ((i & 8) != 0) {
            num2 = magicLinkSentConfig.codeShowInputAfterDelay;
        }
        return magicLinkSentConfig.m763copy5oXczho(str, num, charSet, num2);
    }

    public static final /* synthetic */ void write$Self$app(MagicLinkSentConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ok6.a, EmailAddress.m1006boximpl(self.email));
        e79 e79Var = e79.a;
        output.B(serialDesc, 1, e79Var, self.codeLength);
        output.B(serialDesc, 2, com.anthropic.claude.api.login.a.d, self.codeCharset);
        output.B(serialDesc, 3, e79Var, self.codeShowInputAfterDelay);
    }

    /* JADX INFO: renamed from: component1-ZiuLfiY, reason: not valid java name and from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCodeLength() {
        return this.codeLength;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CodeConfiguration.CharSet getCodeCharset() {
        return this.codeCharset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCodeShowInputAfterDelay() {
        return this.codeShowInputAfterDelay;
    }

    /* JADX INFO: renamed from: copy-5oXczho, reason: not valid java name */
    public final MagicLinkSentConfig m763copy5oXczho(String email, Integer codeLength, CodeConfiguration.CharSet codeCharset, Integer codeShowInputAfterDelay) {
        email.getClass();
        return new MagicLinkSentConfig(email, codeLength, codeCharset, codeShowInputAfterDelay, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagicLinkSentConfig)) {
            return false;
        }
        MagicLinkSentConfig magicLinkSentConfig = (MagicLinkSentConfig) other;
        return EmailAddress.m1009equalsimpl0(this.email, magicLinkSentConfig.email) && x44.r(this.codeLength, magicLinkSentConfig.codeLength) && this.codeCharset == magicLinkSentConfig.codeCharset && x44.r(this.codeShowInputAfterDelay, magicLinkSentConfig.codeShowInputAfterDelay);
    }

    public final CodeConfiguration.CharSet getCodeCharset() {
        return this.codeCharset;
    }

    public final Integer getCodeLength() {
        return this.codeLength;
    }

    public final Integer getCodeShowInputAfterDelay() {
        return this.codeShowInputAfterDelay;
    }

    /* JADX INFO: renamed from: getEmail-ZiuLfiY, reason: not valid java name */
    public final String m764getEmailZiuLfiY() {
        return this.email;
    }

    public int hashCode() {
        int iM1010hashCodeimpl = EmailAddress.m1010hashCodeimpl(this.email) * 31;
        Integer num = this.codeLength;
        int iHashCode = (iM1010hashCodeimpl + (num == null ? 0 : num.hashCode())) * 31;
        CodeConfiguration.CharSet charSet = this.codeCharset;
        int iHashCode2 = (iHashCode + (charSet == null ? 0 : charSet.hashCode())) * 31;
        Integer num2 = this.codeShowInputAfterDelay;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "MagicLinkSentConfig(email=" + EmailAddress.m1012toStringimpl(this.email) + ", codeLength=" + this.codeLength + ", codeCharset=" + this.codeCharset + ", codeShowInputAfterDelay=" + this.codeShowInputAfterDelay + ")";
    }

    public /* synthetic */ MagicLinkSentConfig(String str, Integer num, CodeConfiguration.CharSet charSet, Integer num2, mq5 mq5Var) {
        this(str, num, charSet, num2);
    }

    public /* synthetic */ MagicLinkSentConfig(int i, String str, Integer num, CodeConfiguration.CharSet charSet, Integer num2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, num, charSet, num2, vnfVar);
    }

    private MagicLinkSentConfig(String str, Integer num, CodeConfiguration.CharSet charSet, Integer num2) {
        str.getClass();
        this.email = str;
        this.codeLength = num;
        this.codeCharset = charSet;
        this.codeShowInputAfterDelay = num2;
    }
}
