package defpackage;

import com.anthropic.claude.api.model.ModelThinkingDefault;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ModelId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vpb implements w28 {
    public static final vpb a;
    private static final SerialDescriptor descriptor;

    static {
        vpb vpbVar = new vpb();
        a = vpbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelThinkingDefault", vpbVar, 2);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("thinking", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vnb.a, d4c.S((KSerializer) ModelThinkingDefault.$childSerializers[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelThinkingDefault.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM1064unboximpl = null;
        ThinkingState thinkingState = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                thinkingState = (ThinkingState) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), thinkingState);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelThinkingDefault(i, strM1064unboximpl, thinkingState, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelThinkingDefault modelThinkingDefault = (ModelThinkingDefault) obj;
        encoder.getClass();
        modelThinkingDefault.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelThinkingDefault.write$Self$api(modelThinkingDefault, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
