package defpackage;

import com.anthropic.claude.api.model.ModelSelectorState;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lpb implements w28 {
    public static final lpb a;
    private static final SerialDescriptor descriptor;

    static {
        lpb lpbVar = new lpb();
        a = lpbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelSelectorState", lpbVar, 4);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("model", false);
        pluginGeneratedSerialDescriptor.j("thinking", true);
        pluginGeneratedSerialDescriptor.j("thinking_by_model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ModelSelectorState.$childSerializers;
        return new KSerializer[]{tpb.a, vnb.a, d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelSelectorState.$childSerializers;
        boolean z = true;
        int i = 0;
        String strM378unboximpl = null;
        String strM1064unboximpl = null;
        ThinkingState thinkingState = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ModelSelectorSurface modelSelectorSurface = (ModelSelectorSurface) ud4VarC.l(serialDescriptor, 0, tpb.a, strM378unboximpl != null ? ModelSelectorSurface.m372boximpl(strM378unboximpl) : null);
                strM378unboximpl = modelSelectorSurface != null ? modelSelectorSurface.m378unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 1, vnb.a, strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null);
                strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                i |= 2;
            } else if (iX == 2) {
                thinkingState = (ThinkingState) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), thinkingState);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelSelectorState(i, strM378unboximpl, strM1064unboximpl, thinkingState, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelSelectorState modelSelectorState = (ModelSelectorState) obj;
        encoder.getClass();
        modelSelectorState.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelSelectorState.write$Self$api(modelSelectorState, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
