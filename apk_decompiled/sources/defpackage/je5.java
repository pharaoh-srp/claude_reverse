package defpackage;

import com.anthropic.claude.api.tasks.CustomToolUseEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class je5 implements w28 {
    public static final je5 a;
    private static final SerialDescriptor descriptor;

    static {
        je5 je5Var = new je5();
        a = je5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tool_use", je5Var, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("step_id", true);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("tool_name", false);
        pluginGeneratedSerialDescriptor.j("input", true);
        pluginGeneratedSerialDescriptor.k(new gl0(12));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), srgVar, srgVar, uh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strV = null;
        String strV2 = null;
        JsonObject jsonObject = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                jsonObject = (JsonObject) ud4VarC.l(serialDescriptor, 4, uh9.a, jsonObject);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CustomToolUseEvent(i, str, str2, strV, strV2, jsonObject, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CustomToolUseEvent customToolUseEvent = (CustomToolUseEvent) obj;
        encoder.getClass();
        customToolUseEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CustomToolUseEvent.write$Self$api(customToolUseEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
