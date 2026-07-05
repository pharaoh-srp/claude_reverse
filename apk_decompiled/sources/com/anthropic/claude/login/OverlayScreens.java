package com.anthropic.claude.login;

import com.anthropic.claude.core.logging.EmptyDestination;
import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oob;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/login/OverlayScreens;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "None", "MagicLinkVerify", "com/anthropic/claude/login/g", "Lcom/anthropic/claude/login/OverlayScreens$MagicLinkVerify;", "Lcom/anthropic/claude/login/OverlayScreens$None;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface OverlayScreens extends bga {
    public static final g Companion = g.a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0083\u0004J\n\u0010\t\u001a\u00020\nHÖ\u0081\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\fJ\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004Ê\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/login/OverlayScreens$None;", "Lcom/anthropic/claude/login/OverlayScreens;", "Lcom/anthropic/claude/core/logging/EmptyDestination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class None implements OverlayScreens, EmptyDestination {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new oob(18));

        private None() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.login.OverlayScreens.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        @Override // com.anthropic.claude.login.OverlayScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return -1618083799;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "None";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/login/OverlayScreens$MagicLinkVerify;", "Lcom/anthropic/claude/login/OverlayScreens;", "Lcom/anthropic/claude/login/MagicLinkIntentData;", "intentData", "<init>", "(Lcom/anthropic/claude/login/MagicLinkIntentData;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/login/MagicLinkIntentData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/login/OverlayScreens$MagicLinkVerify;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/login/MagicLinkIntentData;", "copy", "(Lcom/anthropic/claude/login/MagicLinkIntentData;)Lcom/anthropic/claude/login/OverlayScreens$MagicLinkVerify;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/login/MagicLinkIntentData;", "getIntentData", "Companion", "com/anthropic/claude/login/h", "com/anthropic/claude/login/i", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class MagicLinkVerify implements OverlayScreens {
        public static final int $stable = 0;
        public static final i Companion = new i();
        private final MagicLinkIntentData intentData;

        public /* synthetic */ MagicLinkVerify(int i, MagicLinkIntentData magicLinkIntentData, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.intentData = magicLinkIntentData;
            } else {
                gvj.f(i, 1, h.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ MagicLinkVerify copy$default(MagicLinkVerify magicLinkVerify, MagicLinkIntentData magicLinkIntentData, int i, Object obj) {
            if ((i & 1) != 0) {
                magicLinkIntentData = magicLinkVerify.intentData;
            }
            return magicLinkVerify.copy(magicLinkIntentData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MagicLinkIntentData getIntentData() {
            return this.intentData;
        }

        public final MagicLinkVerify copy(MagicLinkIntentData intentData) {
            intentData.getClass();
            return new MagicLinkVerify(intentData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MagicLinkVerify) && x44.r(this.intentData, ((MagicLinkVerify) other).intentData);
        }

        @Override // com.anthropic.claude.login.OverlayScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final MagicLinkIntentData getIntentData() {
            return this.intentData;
        }

        public int hashCode() {
            return this.intentData.hashCode();
        }

        public String toString() {
            return "MagicLinkVerify(intentData=" + this.intentData + ")";
        }

        public MagicLinkVerify(MagicLinkIntentData magicLinkIntentData) {
            magicLinkIntentData.getClass();
            this.intentData = magicLinkIntentData;
        }
    }
}
