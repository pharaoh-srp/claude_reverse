package com.anthropic.claude.api.events;

import com.anthropic.claude.api.events.EventLoggingRequest;
import defpackage.nc8;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements w28 {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("GrowthbookFeatureEvaluationEvent", eVar, 1);
        pluginGeneratedSerialDescriptor.j("event_data", false);
        pluginGeneratedSerialDescriptor.k(new b());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nc8.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        GrowthBookFeatureEvaluationEventData growthBookFeatureEvaluationEventData = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                growthBookFeatureEvaluationEventData = (GrowthBookFeatureEvaluationEventData) ud4VarC.l(serialDescriptor, 0, nc8.a, growthBookFeatureEvaluationEventData);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventLoggingRequest.FeatureEvaluation(i, growthBookFeatureEvaluationEventData, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventLoggingRequest.FeatureEvaluation featureEvaluation = (EventLoggingRequest.FeatureEvaluation) obj;
        encoder.getClass();
        featureEvaluation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, nc8.a, featureEvaluation.event_data);
        vd4VarC.b(serialDescriptor);
    }
}
