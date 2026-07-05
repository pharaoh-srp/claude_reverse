package com.anthropic.claude.app.verification;

import defpackage.bga;
import defpackage.cc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kdi;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/app/verification/VerificationScreens;", "Lbga;", "Lcc;", "getActiveSurface", "()Lcc;", "activeSurface", "Companion", "EnterPhoneStep", "VerifyPhoneCodeStep", "com/anthropic/claude/app/verification/b", "Lcom/anthropic/claude/app/verification/VerificationScreens$EnterPhoneStep;", "Lcom/anthropic/claude/app/verification/VerificationScreens$VerifyPhoneCodeStep;", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface VerificationScreens extends bga {
    public static final b Companion = b.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/app/verification/VerificationScreens$EnterPhoneStep;", "Lcom/anthropic/claude/app/verification/VerificationScreens;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "app", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class EnterPhoneStep implements VerificationScreens {
        public static final int $stable = 0;
        public static final EnterPhoneStep INSTANCE = new EnterPhoneStep();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new kdi(28));

        private EnterPhoneStep() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.app.verification.VerificationScreens.EnterPhoneStep", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EnterPhoneStep);
        }

        @Override // com.anthropic.claude.app.verification.VerificationScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public int hashCode() {
            return 1527827849;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnterPhoneStep";
        }
    }

    @Override // defpackage.bga
    default cc getActiveSurface() {
        return cc.Other;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/app/verification/VerificationScreens$VerifyPhoneCodeStep;", "Lcom/anthropic/claude/app/verification/VerificationScreens;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/app/verification/VerificationScreens$VerifyPhoneCodeStep;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/app/verification/VerificationScreens$VerifyPhoneCodeStep;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhoneNumber", "Companion", "com/anthropic/claude/app/verification/c", "com/anthropic/claude/app/verification/d", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class VerifyPhoneCodeStep implements VerificationScreens {
        public static final int $stable = 0;
        public static final d Companion = new d();
        private final String phoneNumber;

        public /* synthetic */ VerifyPhoneCodeStep(int i, String str, vnf vnfVar) {
            if (1 == (i & 1)) {
                this.phoneNumber = str;
            } else {
                gvj.f(i, 1, c.a.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ VerifyPhoneCodeStep copy$default(VerifyPhoneCodeStep verifyPhoneCodeStep, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifyPhoneCodeStep.phoneNumber;
            }
            return verifyPhoneCodeStep.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final VerifyPhoneCodeStep copy(String phoneNumber) {
            phoneNumber.getClass();
            return new VerifyPhoneCodeStep(phoneNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyPhoneCodeStep) && x44.r(this.phoneNumber, ((VerifyPhoneCodeStep) other).phoneNumber);
        }

        @Override // com.anthropic.claude.app.verification.VerificationScreens, defpackage.bga
        public /* bridge */ cc getActiveSurface() {
            return super.getActiveSurface();
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public String toString() {
            return ij0.j("VerifyPhoneCodeStep(phoneNumber=", this.phoneNumber, ")");
        }

        public VerifyPhoneCodeStep(String str) {
            str.getClass();
            this.phoneNumber = str;
        }
    }
}
