package com.segment.analytics.kotlin.core;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.eve;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.uh9;
import defpackage.vd4;
import defpackage.w28;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@lz5
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/segment/analytics/kotlin/core/GroupEvent.$serializer", "Lw28;", "Lcom/segment/analytics/kotlin/core/GroupEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/GroupEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/GroupEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class GroupEvent$$serializer implements w28 {
    public static final GroupEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GroupEvent$$serializer groupEvent$$serializer = new GroupEvent$$serializer();
        INSTANCE = groupEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("group", groupEvent$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("groupId", false);
        pluginGeneratedSerialDescriptor.j("traits", false);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("anonymousId", false);
        pluginGeneratedSerialDescriptor.j("integrations", false);
        pluginGeneratedSerialDescriptor.j("context", false);
        pluginGeneratedSerialDescriptor.j("userId", true);
        pluginGeneratedSerialDescriptor.j("_metadata", true);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GroupEvent$$serializer() {
    }

    @Override // defpackage.w28
    public KSerializer[] childSerializers() {
        KSerializer kSerializerSerializer = EventType.INSTANCE.serializer();
        srg srgVar = srg.a;
        uh9 uh9Var = uh9.a;
        return new KSerializer[]{srgVar, uh9Var, kSerializerSerializer, srgVar, srgVar, uh9Var, uh9Var, srgVar, DestinationMetadata$$serializer.INSTANCE, srgVar};
    }

    @Override // defpackage.s06
    public GroupEvent deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        ud4 ud4VarC = decoder.c(descriptor2);
        GroupEvent groupEvent = null;
        boolean z = true;
        Object objL = null;
        String strV = null;
        Object objL2 = null;
        Object objL3 = null;
        String strV2 = null;
        String strV3 = null;
        Object objL4 = null;
        Object objL5 = null;
        String strV4 = null;
        String strV5 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(descriptor2);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    objL = ud4VarC.l(descriptor2, 1, uh9.a, objL);
                    i |= 2;
                    break;
                case 2:
                    objL2 = ud4VarC.l(descriptor2, 2, EventType.INSTANCE.serializer(), objL2);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    strV3 = ud4VarC.v(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    objL3 = ud4VarC.l(descriptor2, 5, uh9.a, objL3);
                    i |= 32;
                    break;
                case 6:
                    objL4 = ud4VarC.l(descriptor2, 6, uh9.a, objL4);
                    i |= 64;
                    break;
                case 7:
                    strV4 = ud4VarC.v(descriptor2, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    objL5 = ud4VarC.l(descriptor2, 8, DestinationMetadata$$serializer.INSTANCE, objL5);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    strV5 = ud4VarC.v(descriptor2, 9);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return groupEvent;
            }
            groupEvent = null;
        }
        ud4VarC.b(descriptor2);
        return new GroupEvent(i, strV, (JsonObject) objL, (EventType) objL2, strV2, strV3, (JsonObject) objL3, (JsonObject) objL4, strV4, (DestinationMetadata) objL5, strV5, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public void serialize(Encoder encoder, GroupEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        vd4 vd4VarC = encoder.c(descriptor2);
        GroupEvent.write$Self(value, vd4VarC, descriptor2);
        vd4VarC.b(descriptor2);
    }

    @Override // defpackage.w28
    public KSerializer[] typeParametersSerializers() {
        return eve.g;
    }
}
