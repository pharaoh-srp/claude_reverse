package com.anthropic.claude.api.events;

import com.anthropic.claude.api.events.EventLoggingRequest;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.events.EventLoggingRequest", kceVar.b(EventLoggingRequest.class), new pl9[]{kceVar.b(EventLoggingRequest.ExperimentExposure.class), kceVar.b(EventLoggingRequest.FeatureEvaluation.class), kceVar.b(EventLoggingRequest.HealthMetric.class)}, new KSerializer[]{c.a, e.a, g.a}, new Annotation[]{new b()});
    }
}
