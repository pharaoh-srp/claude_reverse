package com.anthropic.claude.login;

import defpackage.gh2;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.koa;
import defpackage.loa;
import defpackage.mdj;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/login/MagicLinkIntentData;", "", "", "nonce", "encodedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/login/MagicLinkIntentData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/login/MagicLinkIntentData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNonce", "getEncodedEmail", "Companion", "loa", "koa", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MagicLinkIntentData {
    public static final int $stable = 0;
    public static final loa Companion = new loa();
    private static final gh2 channel = x44.a();
    private final String encodedEmail;
    private final String nonce;

    public /* synthetic */ MagicLinkIntentData(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, koa.a.getDescriptor());
            throw null;
        }
        this.nonce = str;
        this.encodedEmail = str2;
    }

    public static /* synthetic */ MagicLinkIntentData copy$default(MagicLinkIntentData magicLinkIntentData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = magicLinkIntentData.nonce;
        }
        if ((i & 2) != 0) {
            str2 = magicLinkIntentData.encodedEmail;
        }
        return magicLinkIntentData.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(MagicLinkIntentData self, vd4 output, SerialDescriptor serialDesc) {
        srg srgVar = srg.a;
        output.B(serialDesc, 0, srgVar, self.nonce);
        output.B(serialDesc, 1, srgVar, self.encodedEmail);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncodedEmail() {
        return this.encodedEmail;
    }

    public final MagicLinkIntentData copy(String nonce, String encodedEmail) {
        return new MagicLinkIntentData(nonce, encodedEmail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MagicLinkIntentData)) {
            return false;
        }
        MagicLinkIntentData magicLinkIntentData = (MagicLinkIntentData) other;
        return x44.r(this.nonce, magicLinkIntentData.nonce) && x44.r(this.encodedEmail, magicLinkIntentData.encodedEmail);
    }

    public final String getEncodedEmail() {
        return this.encodedEmail;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        String str = this.nonce;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.encodedEmail;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("MagicLinkIntentData(nonce=", this.nonce, ", encodedEmail=", this.encodedEmail, ")");
    }

    public MagicLinkIntentData(String str, String str2) {
        this.nonce = str;
        this.encodedEmail = str2;
    }
}
