package defpackage;

import com.anthropic.claude.api.model.ModelTooltip;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xpb implements w28 {
    public static final xpb a;
    private static final SerialDescriptor descriptor;

    static {
        xpb xpbVar = new xpb();
        a = xpbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelTooltip", xpbVar, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) ModelTooltip.$childSerializers[0].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelTooltip.$childSerializers;
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
        return new ModelTooltip(i, _serverlocalizedstring, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelTooltip modelTooltip = (ModelTooltip) obj;
        encoder.getClass();
        modelTooltip.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelTooltip.write$Self$api(modelTooltip, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
