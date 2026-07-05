package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.models.organization.configtypes.AvailableModelsConfig;
import com.anthropic.claude.types.strings.ModelId;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.pvg;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.AvailableModelsConfig.AvailableModel", aVar, 3);
        pluginGeneratedSerialDescriptor.j("model_id", false);
        pluginGeneratedSerialDescriptor.j("minimum_tier", false);
        pluginGeneratedSerialDescriptor.j("minimumTier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vnb.a, srg.a, d4c.S((KSerializer) AvailableModelsConfig.AvailableModel.$childSerializers[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AvailableModelsConfig.AvailableModel.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1064unboximpl = null;
        String strV = null;
        pvg pvgVar = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                pvgVar = (pvg) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), pvgVar);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AvailableModelsConfig.AvailableModel(i, strM1064unboximpl, strV, pvgVar, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AvailableModelsConfig.AvailableModel availableModel = (AvailableModelsConfig.AvailableModel) obj;
        encoder.getClass();
        availableModel.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AvailableModelsConfig.AvailableModel.write$Self$models(availableModel, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
