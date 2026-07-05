package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.s06;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("model_disabled", bVar, 1);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) DisabledReason.ModelDisabled.$childSerializers[0].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = DisabledReason.ModelDisabled.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        _ServerLocalizedString _serverlocalizedstring = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), _serverlocalizedstring);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DisabledReason.ModelDisabled(i, _serverlocalizedstring, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DisabledReason.ModelDisabled modelDisabled = (DisabledReason.ModelDisabled) obj;
        encoder.getClass();
        modelDisabled.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DisabledReason.ModelDisabled.write$Self$api(modelDisabled, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
