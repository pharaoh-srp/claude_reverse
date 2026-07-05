package com.anthropic.claude.settings.internal.growthbook;

import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.znf;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements w28 {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.settings.internal.growthbook.GrowthBookOverrideScreenData.Companion.PersistedCustomFeatures", cVar, 1);
        pluginGeneratedSerialDescriptor.j("features", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures growthBookOverrideScreenData$Companion$PersistedCustomFeatures = (GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures) obj;
        encoder.getClass();
        growthBookOverrideScreenData$Companion$PersistedCustomFeatures.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures.$childSerializers[0].getValue(), growthBookOverrideScreenData$Companion$PersistedCustomFeatures.features);
        vd4VarC.b(serialDescriptor);
    }
}
