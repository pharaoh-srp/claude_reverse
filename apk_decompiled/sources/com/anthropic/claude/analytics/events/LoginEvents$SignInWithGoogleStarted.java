package com.anthropic.claude.analytics.events;

import defpackage.eja;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"com/anthropic/claude/analytics/events/LoginEvents$SignInWithGoogleStarted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "<init>", "()V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILvnf;)V", "Lcom/anthropic/claude/analytics/events/LoginEvents$SignInWithGoogleStarted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/LoginEvents$SignInWithGoogleStarted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "getEventName", "()Ljava/lang/String;", "eventName", "Companion", "dja", "eja", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class LoginEvents$SignInWithGoogleStarted implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final eja Companion = new eja();

    public LoginEvents$SignInWithGoogleStarted() {
    }

    public static final /* synthetic */ void write$Self$analytics(LoginEvents$SignInWithGoogleStarted self, vd4 output, SerialDescriptor serialDesc) {
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile.login.google.started";
    }

    public /* synthetic */ LoginEvents$SignInWithGoogleStarted(int i, vnf vnfVar) {
    }
}
