package com.segment.analytics.kotlin.core;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.d4c;
import defpackage.e79;
import defpackage.eve;
import defpackage.f7a;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@lz5
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/RemoteMetric.$serializer", "Lw28;", "Lcom/segment/analytics/kotlin/core/RemoteMetric;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/RemoteMetric;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/RemoteMetric;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class RemoteMetric$$serializer implements w28 {
    public static final RemoteMetric$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RemoteMetric$$serializer remoteMetric$$serializer = new RemoteMetric$$serializer();
        INSTANCE = remoteMetric$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.RemoteMetric", remoteMetric$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("metric", false);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        pluginGeneratedSerialDescriptor.j("tags", false);
        pluginGeneratedSerialDescriptor.j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RemoteMetric$$serializer() {
    }

    @Override // defpackage.w28
    public KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, e79.a, new f7a(srgVar, srgVar), d4c.S(new f7a(srgVar, srgVar))};
    }

    @Override // defpackage.s06
    public RemoteMetric deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor2);
        boolean z = true;
        int i = 0;
        int iR = 0;
        Object objL = null;
        String strV = null;
        String strV2 = null;
        Object objM = null;
        while (z) {
            int iX = ud4VarC.x(descriptor2);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(descriptor2, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(descriptor2, 1);
                i |= 2;
            } else if (iX == 2) {
                iR = ud4VarC.r(descriptor2, 2);
                i |= 4;
            } else if (iX == 3) {
                srg srgVar = srg.a;
                objL = ud4VarC.l(descriptor2, 3, new f7a(srgVar, srgVar), objL);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                srg srgVar2 = srg.a;
                objM = ud4VarC.m(descriptor2, 4, new f7a(srgVar2, srgVar2), objM);
                i |= 16;
            }
        }
        ud4VarC.b(descriptor2);
        return new RemoteMetric(i, strV, strV2, iR, (Map) objL, (Map) objM, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public void serialize(Encoder encoder, RemoteMetric value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor2);
        RemoteMetric.write$Self(value, vd4VarC, descriptor2);
        vd4VarC.b(descriptor2);
    }

    @Override // defpackage.w28
    public KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
