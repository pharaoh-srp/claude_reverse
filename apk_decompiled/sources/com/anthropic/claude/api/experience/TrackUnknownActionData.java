package com.anthropic.claude.api.experience;

import defpackage.gl0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.n7h;
import defpackage.onf;
import defpackage.w1a;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\u0002\b\u0010¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/experience/TrackUnknownActionData;", "Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "api", "Landroidx/compose/runtime/Immutable;", "Lkotlinx/serialization/Serializable;"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class TrackUnknownActionData implements ExperienceTrackActionData {
    public static final int $stable = 0;
    public static final TrackUnknownActionData INSTANCE = new TrackUnknownActionData();
    private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(27));

    private TrackUnknownActionData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        return new lq6("com.anthropic.claude.api.experience.TrackUnknownActionData", INSTANCE, new Annotation[]{new gl0(7)});
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return (KSerializer) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof TrackUnknownActionData);
    }

    public int hashCode() {
        return 546508590;
    }

    public final KSerializer serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "TrackUnknownActionData";
    }
}
