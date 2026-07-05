package com.segment.analytics.kotlin.core;

import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.re4;
import defpackage.w1a;
import defpackage.yb5;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/segment/analytics/kotlin/core/EventType;", "", "(Ljava/lang/String;I)V", "Track", "Screen", "Alias", "Identify", "Group", "Companion", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public enum EventType {
    Track,
    Screen,
    Alias,
    Identify,
    Group;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final kw9 $cachedSerializer$delegate = yb5.w(w1a.F, re4.S);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/EventType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/EventType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) EventType.$cachedSerializer$delegate.getValue();
        }
    }
}
